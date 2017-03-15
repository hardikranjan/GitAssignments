package com.ShoppingCart.DAO;
/**
 * Created by hardikranjan on 20/02/17.
 */
import com.ShoppingCart.Domain.DomainUser;
import com.ShoppingCart.Util.*;
import java.sql.*;

public class DAOUser implements DAO_Users {

    public void insert(DomainUser obj) throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con = DBConnection.getConnection();

        String name = obj.getName();
        String email = obj.getEmail();
        String address = obj.getAddress();

        PreparedStatement pst = con.prepareStatement("insert into Users (UsersName,UsersEmailId,UsersAddress) values (?,?,?)");
        pst.setString(1, name);
        pst.setString(2, email);
        pst.setString(3, address);
        pst.executeUpdate();

        con.close();
    }
}


