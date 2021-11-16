package com.dhx.web.servlet;

import com.dhx.domain.User;
import com.dhx.service.UserService;
import com.dhx.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService us = new UserServiceImpl();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = null;
        user = us.login(username, password);
        if (user!=null){
            request.setAttribute("loginMsg","登录成功!");
            request.setAttribute("user",user);
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }else{
            request.setAttribute("loginMsg","账号或密码错误!");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            System.out.println(request.getRequestURI());
        }
    }
}
