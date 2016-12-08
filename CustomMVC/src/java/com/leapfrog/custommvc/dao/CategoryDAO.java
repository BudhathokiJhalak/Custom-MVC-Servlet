/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.dao;

import com.leapfrog.custommvc.entity.Category;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author zak
 */
public interface CategoryDAO {

    List<Category> getAll() throws ClassNotFoundException, SQLException;

}
