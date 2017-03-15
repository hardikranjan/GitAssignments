package com.ShoppingCart.DAO;

import com.ShoppingCart.Domain.*;
import com.ShoppingCart.Util.*;
import java.sql.*;
/**
 * Created by hardikranjan on 21/02/17.
 */
public class DAOProduct implements DAOProductt
{
    public void insert(DomainProduct obj) throws Exception
        {
            Connection con = DBConnection.getConnection();
            String name = obj.getProductname();
            int initialprice = obj.getProductunitprice();
            int quantity = obj.getProductquantity();

            PreparedStatement pst = con.prepareStatement("insert into Products (ProductsName,ProductsQuantity,ProductsInitialPrice) values (?,?,?)");
            pst.setString(1, name);
            pst.setInt(2,quantity);
            pst.setInt(3, initialprice);
            pst.execute();
        }

        public void updateById(int id,int qty) throws Exception{

            Connection con = DBConnection.getConnection();
            String query = "update Products set ProductsQuantity = ? where ProductsId = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,qty);
            pst.setInt(2,id);

            pst.executeUpdate();
        }

        public DomainProduct getById(int id) throws Exception{
            String query = "select * from Products where ProductsId=?";

            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,id);
            DomainProduct dp = null;
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                dp  = new DomainProduct();
                dp.setProductid(rs.getInt(1));
                dp.setProductname(rs.getString(2));
                dp.setProductquantity(rs.getInt(3));
                dp.setProductunitprice(rs.getInt(4));
            }
            return dp;
        }
}
