/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.servlet;

import com.leapfrog.custommvc.dao.CustomerDAO;
import com.leapfrog.custommvc.dao.impl.CustomerDAOImpl;
import com.leapfrog.custommvc.entity.Customer;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zak
 */
@WebServlet(name = "default", urlPatterns = {"/","/home"})
public class DefaultServlet extends HttpServlet {
    private CustomerDAO customerDAO = new CustomerDAOImpl();
    String path = "/WEB-INF/views/";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customers", customerDAO.getAll());
        request.getRequestDispatcher(path + "index.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        PrintStream ps = new PrintStream(response.getOutputStream());
        String name= request.getParameter("name");
        ps.println("<h1>Hello " +name +"</h1>");
    }
}
