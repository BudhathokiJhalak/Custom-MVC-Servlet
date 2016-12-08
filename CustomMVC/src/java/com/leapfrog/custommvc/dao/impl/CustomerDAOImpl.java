/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.dao.impl;

import com.leapfrog.custommvc.dao.CustomerDAO;
import com.leapfrog.custommvc.entity.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zak
 */
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Donald", "Trump", "trumpdonald@gmail.com"));
        customerList.add(new Customer(2, "John", "Cena", "cena.john@gmail.com"));
        return customerList;
    }
    
}
