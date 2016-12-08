/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.controller;

import com.leapfrog.custommvc.system.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author zak
 */
@WebServlet(name = "loginController", urlPatterns = {"/login/*"})
public class LoginController extends Controller {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //retrive from database
        
        
        if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("admin")){
            HttpSession session = request.getSession(true);
            session.setAttribute("user", "username");
            response.sendRedirect(request.getContextPath()+"/admin/category");
        }else{
            response.sendRedirect(request.getContextPath()+"/login?error");
        }
    }

}
