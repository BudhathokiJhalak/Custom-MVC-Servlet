/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.dao;

import com.leapfrog.custommvc.entity.Customer;
import java.util.List;

/**
 *
 * @author zak
 */
public interface CustomerDAO {

    List<Customer> getAll();
}
