/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.dao.impl;

import com.leapfrog.custommvc.dao.CategoryDAO;
import com.leapfrog.custommvc.entity.Category;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zak
 */
public class CategoryDAOImpl implements CategoryDAO{

    @Override
    public List<Category> getAll() throws ClassNotFoundException, SQLException {
        List<Category> catList=new ArrayList<>();
        catList.add(new Category(1, "Apparels", "Apparels", true));
        catList.add(new Category(2, "Electronics", "Electronics", false));
        return catList;
        
    }
    
}
