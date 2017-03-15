package com.ShoppingCart.Services;
import com.ShoppingCart.Domain.*;
import com.ShoppingCart.Util.*;
import com.ShoppingCart.DAO.*;
import java.io.*;
import com.ShoppingCart.Clients.*;
import java.util.ArrayList;

/**
 * Created by hardikranjan on 21/02/17.
 */
//Writting in CSV File

public class ServicesBill
{
    public void billgenerate(int orderId) throws Exception
    {
        File file = new File("/Users/hardikranjan/Project/AppDirect/ShoppingCart/src/com/ShoppingCart/Util/Bill.csv");
        DAOBill daoBill =new DAOBill();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        DomainProduct dp = new DomainProduct();

        String pname="";
        int price=0,productquantity=0,pprice=0;

        ServicesProduct sp = new ServicesProduct();

        ArrayList<Integer> arrayList = daoBill.Billdetail(orderId);

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Order Id: "+ orderId+"\n");

        String row = "NAME,QUANTITY,INITIALPRICE,TOTAL";
        fileWriter.write(row+ "\n");
        int quantity=0,productid=0;
        int grossTotal=0;

        for(int i=0;i<arrayList.size();i+=2)
        {
            quantity = arrayList.get(i);
            productid = arrayList.get(i + 1);
            dp = sp.getById(productid);
         //   System.out.println(productid + " " + (dp==null));

            pprice = dp.getProductunitprice();
            pname = dp.getProductname();

            int total = pprice * quantity;
            grossTotal = grossTotal + total;
            row = ""+ pname + "," + quantity + "," + pprice + "," + total;

            fileWriter.write(row);
            fileWriter.write("\n");
        }
        fileWriter.write("Total Price= " + grossTotal);
        fileWriter.flush();
        fileWriter.close();
    }

}
