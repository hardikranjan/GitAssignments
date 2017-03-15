package com.ShoppingCart.DAO;

import com.ShoppingCart.Domain.DomainOrder;

/**
 * Created by hardikranjan on 24/02/17.
 */
public interface DAOorders {
    int place(DomainOrder du) throws Exception;
}
