package com.ShoppingCart.Services;

import com.ShoppingCart.DAO.DAOOrder;
import com.ShoppingCart.DAO.DAOOrderDetail;
import com.ShoppingCart.Domain.DomainOrder;
import com.ShoppingCart.Domain.DomainOrderDetail;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by hardikranjan on 20/02/17.
 */
public class ServicesOrderDetail
{
    DAOOrderDetail daoOD = new DAOOrderDetail();

    public void place(DomainOrderDetail obj) throws Exception
    {
        /*
        String cvuser = "/Users/hardikranjan/Project/AppDirect/ShoppingCart/src/com/ShoppingCart/Util/orderdetail.txt";
        BufferedReader br = new BufferedReader(new FileReader(cvuser));
        DAOOrderDetail obj = new DAOOrderDetail();
        String space="";
        String comma=",";
        DomainOrderDetail du = new DomainOrderDetail();
        while((space=br.readLine())!=null)
        {
            String[] str = space.split(comma);
            du.setProductid(Integer.parseInt(str[0]));
            du.setOrderdetailquantity(Integer.parseInt(str[1]));

            try
            {
                obj.placed(du);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        */
        daoOD.placed(obj);
    }
}
