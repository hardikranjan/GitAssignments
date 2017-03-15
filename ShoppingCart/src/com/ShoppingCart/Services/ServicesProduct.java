package com.ShoppingCart.Services;
import com.ShoppingCart.DAO.DAOProduct;
import com.ShoppingCart.Domain.DomainProduct;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by hardikranjan on 20/02/17.
 */

interface serviceproduct
{
    void addproduct() throws Exception;
}
public class ServicesProduct implements serviceproduct
{
    public void addproduct() throws Exception {
        String csv ="src/com/ShoppingCart/Util/product.txt";

        BufferedReader br1 =new BufferedReader(new FileReader(csv));
        DAOProduct dp1=new DAOProduct();

        String space="";
        String comma=",";
        DomainProduct dp2= new DomainProduct();
        while((space=br1.readLine())!=null)
        {
            String[] str = space.split(comma);
            dp2.setProductname(str[1]);
            dp2.setProductquantity(Integer.parseInt(str[2]));
            dp2.setProductunitprice(Integer.parseInt(str[3]));
            dp1.insert(dp2);
        }
    }

    public void updateById(int id,int qty) throws  Exception{
        DAOProduct dp2= new DAOProduct();
        dp2.updateById(id,qty);
    }

    public DomainProduct getById(int id) throws Exception{
        DAOProduct dp = new DAOProduct();
        return dp.getById(id);
    }

}
