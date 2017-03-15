package com.ShoppingCart.DAO;
import com.ShoppingCart.Domain.*;
import com.ShoppingCart.Util.*;
import java.sql.*;
import java.util.Date;
/**
 * Created by hardikranjan on 21/02/17.
 */

public class DAOOrder implements DAOorders
{
    public int place(DomainOrder du) throws Exception
    {
        Connection con = DBConnection.getConnection();

        int userid = du.getOrderUserId(); // Calling DomainOrder to get User_id
        String status = du.getStatus();

        Timestamp t=new Timestamp(new Date().getTime());//For Present Date

        String query = "insert into Orders (OrdersUsersId,OrdersCreatedDate,OrdersStatus) values (?,?,?)";
        //Insert values into database for orders table
        int odrId = 0;
        PreparedStatement pst = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
        //Return_Generated_Keys to return the Order_Id
        pst.setInt(1, userid);
        pst.setTimestamp(2,t);
        pst.setString(3, status);
        pst.executeUpdate();
        ResultSet rs = pst.getGeneratedKeys();

        if(rs.next())
        {
            odrId = rs.getInt(1);
        }

        return odrId;
    }
}
