package com.ShoppingCart.Services;
import com.ShoppingCart.Clients.*;
import com.ShoppingCart.DAO.DAOUser;
import com.ShoppingCart.Domain.DomainUser;
import com.ShoppingCart.Util.*;
/**
 * Created by hardikranjan on 20/02/17.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import  java.util.List;
interface serviceuser
{
     void useradd() throws Exception;
}
public class ServicesUser implements serviceuser
{
    public void useradd() throws Exception
    {
        String cvuser = "src/com/ShoppingCart/Util/user.txt";
        BufferedReader br = new BufferedReader(new FileReader(cvuser));
        DAOUser obj = new DAOUser();
        String space="";
        String comma=",";
        DomainUser du = new DomainUser();
        while((space=br.readLine())!=null)
        {
            String[] str = space.split(comma);
            du.setUserid(Integer.parseInt(str[0]));
            du.setName(str[1]);
            du.setEmail(str[2]);
            du.setAddress(str[3]);
            obj.insert(du);
        }
    }
}
