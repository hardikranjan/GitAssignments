package com.ShoppingCart.Clients;

import com.ShoppingCart.Domain.DomainProduct;
import com.ShoppingCart.Services.ServicesProduct;
import com.ShoppingCart.Services.ServicesUser;

/**
 * Created by hardikranjan on 20/02/17.
 */


//EXECUTE USERS CODE FOR ADDING PRODUCTS
public class ClientProduct
{
    public static void main(String[] args) throws Exception {
        ServicesProduct dp = new ServicesProduct();
        try {
            dp.addproduct();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
