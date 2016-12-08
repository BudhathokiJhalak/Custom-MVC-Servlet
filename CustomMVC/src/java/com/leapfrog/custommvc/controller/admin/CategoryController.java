/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.controller.admin;

import com.leapfrog.custommvc.dao.CategoryDAO;
import com.leapfrog.custommvc.dao.impl.CategoryDAOImpl;
import com.leapfrog.custommvc.system.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zak
 */
@WebServlet(name = "categoryController", urlPatterns = {"/admin/category/*"})
public class CategoryController extends Controller {

    private CategoryDAO categoryDAO = new CategoryDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/WEB-INF/views/admin/category/";
        String page = "index.jsp";
        if (request.getRequestURI().contains("/add")) {
            page = "add.jsp";
        } else {
            try {
                request.setAttribute("categories", categoryDAO.getAll());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        request.getRequestDispatcher(path + page).forward(request, response);
    }
}
