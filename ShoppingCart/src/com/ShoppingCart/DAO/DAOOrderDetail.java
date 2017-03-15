package com.ShoppingCart.DAO;

import com.ShoppingCart.Domain.DomainOrderDetail;
import com.ShoppingCart.Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by hardikranjan on 21/02/17.
 */
//Inserting values in Order_Detail Database
public class DAOOrderDetail implements DAOorderdetaill
{
    public void placed(DomainOrderDetail obj) throws Exception {
        Connection con = DBConnection.getConnection();

        int id = obj.getOrderId();
        int proid = obj.getProductid();
        int quantity = obj.getOrderdetailquantity();

        PreparedStatement pst = con.prepareStatement("insert into orderDetails (OrdersId,OrderProductsId,OrderDetailsQuantity) values (?,?,?)");
        pst.setInt(1, id);
        pst.setInt(2, proid);
        pst.setInt(3,quantity);

        pst.execute();

    }
}
