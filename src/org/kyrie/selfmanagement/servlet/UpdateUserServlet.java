package org.kyrie.selfmanagement.servlet;

import org.kyrie.selfmanagement.dao.impl.UserDaoImpl;
import org.kyrie.selfmanagement.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        UserDaoImpl dao = new UserDaoImpl();
        if (dao.updateUser(new User(request.getParameter("tel"), request.getParameter("password"),request.getParameter("nickname"))) == 1) {
            response.sendRedirect("main.jsp");
        } else {
            response.sendRedirect("update.jsp?error=yes");
        }
    }
}
