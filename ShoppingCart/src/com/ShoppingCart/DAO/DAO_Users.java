package com.ShoppingCart.DAO;

import com.ShoppingCart.Domain.DomainUser;

/**
 * Created by hardikranjan on 25/02/17.
 */
public interface DAO_Users {
    interface DaoUsers
    {
        void insert(DomainUser ojk) throws Exception;
    }
}
