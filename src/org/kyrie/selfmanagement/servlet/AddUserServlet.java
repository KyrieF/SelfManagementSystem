package org.kyrie.selfmanagement.servlet;

import org.kyrie.selfmanagement.dao.impl.UserDaoImpl;
import org.kyrie.selfmanagement.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddUserServlet")
public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        UserDaoImpl dao = new UserDaoImpl();
        String p1 = request.getParameter("password");
        String p2 = request.getParameter("password2");
        if (p1.equals(p2)) {
            if (dao.addUser(new User(request.getParameter("tel"), p1,request.getParameter("nickname"))) == 1) {
                response.sendRedirect("login.jsp");
            }
        } else {
            response.sendRedirect("signUp.jsp?error=yes");
        }
    }
}
