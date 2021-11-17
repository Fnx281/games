package com.dhx.web.servlet;

import com.dhx.domain.User;
import com.dhx.service.UserService;
import com.dhx.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService us = new UserServiceImpl();
        User user = new User();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String confirm_password = request.getParameter("confirm_password");
            String birthday = request.getParameter("birthday");
            String gender = request.getParameter("gender");
            String telePhone = request.getParameter("telPhone");
            String email = request.getParameter("email");
            try {
                Date dateBirthday= sdf.parse(birthday);
                user.setBirthday(dateBirthday);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            user.setUsername(username);
            user.setPassword(password);
            user.setGender(gender);
            user.setTelePhone(telePhone);
            user.setEmail(email);
            user.setStatus("user");
            user.setCode("12346");

            boolean register = us.register(user);

            if (register){
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }else{
                request.setAttribute("errorMsg","注册失败");
                request.getRequestDispatcher("/register.jsp").forward(request,response);
            }
    }
}
