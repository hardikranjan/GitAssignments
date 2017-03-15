package com.ShoppingCart.Clients;

import com.ShoppingCart.Services.ServicesBill;
import com.ShoppingCart.Services.ServicesOrder;
import java.io.IOException;

/**
 * Created by hardikranjan on 20/02/17.
 */

//EXECUTE CLIENT TO PLACE ORDER
public class ClientOrder
{
    public static void main(String[] args) throws IOException {

        //This is the main through which Order is placed and CSV File (Bill.csv) is created in UTIL PACKAGE
        ServicesOrder sd = new ServicesOrder();
        try {
            sd.addorder();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
