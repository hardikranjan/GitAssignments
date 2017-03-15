package com.ShoppingCart.Clients;

import com.ShoppingCart.Services.ServicesOrder;
import com.ShoppingCart.Services.ServicesUser;

/**
 * Created by hardikranjan on 20/02/17.
 */


//EXECUTE USER CODE FOR ADDING USERS
public class ClientUser
{
    public static void main(String[] arg) throws Exception {
        ServicesUser su = new ServicesUser();
        try {
            su.useradd();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
