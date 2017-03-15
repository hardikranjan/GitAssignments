package com.ShoppingCart.Services;
import com.ShoppingCart.DAO.*;
import com.ShoppingCart.Domain.*;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by hardikranjan on 20/02/17.
 */

public class ServicesOrder implements serviceorder
{
    @Override
    public void addorder() throws Exception
    {
        String cvuser = "src/com/ShoppingCart/Util/order.txt";
        BufferedReader br = new BufferedReader(new FileReader(cvuser));
        DAOOrder obj = new DAOOrder();
        String space="";
        String comma=",";

        DomainOrder du = new DomainOrder();

        ServicesOrderDetail sor = new ServicesOrderDetail();
        ServicesProduct sp = new ServicesProduct();

        String row1 = br.readLine();
        int userId = Integer.parseInt(row1);
        int orderId = 0;

        du.setOrderuserid(userId);
        du.setStatus("Confirmed");

        try {
            orderId = obj.place(du);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Order Bill in CSV File ");
        while((space=br.readLine())!=null)
        {
            String[] str = space.split(comma);
            int productId = (Integer.parseInt(str[0]));
            int qty = Integer.parseInt(str[1]);

            DomainOrderDetail dod = new DomainOrderDetail();
            dod.setOrderId(orderId);
            dod.setProductid(productId);
            dod.setOrderdetailquantity(qty);

            sor.place(dod);
            DomainProduct dp = sp.getById(productId);
            int updatedQty = dp.getProductquantity() - qty;
            sp.updateById(productId,updatedQty);

            //CALLING BILL
            ServicesBill servicesBill = new ServicesBill();
            servicesBill.billgenerate(orderId);
        }
    }
}
