package org.kyrie.selfmanagement.servlet;

import org.kyrie.selfmanagement.dao.impl.PsdDaoImpl;
import org.kyrie.selfmanagement.po.PasswordList;
import org.kyrie.selfmanagement.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddPasswordServlet")
public class AddPasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        User user = (User) (request.getSession().getAttribute("loginUser"));
        PasswordList passwordList = new PasswordList(user.getTel(), request.getParameter("username"),
                request.getParameter("password"), request.getParameter("location"));
        PsdDaoImpl dao = new PsdDaoImpl();
        dao.addList(passwordList);
        response.sendRedirect("MyPasswordListServlet");
    }
}
