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

@WebServlet(name = "DeletePasswordServlet")
public class DeletePasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        User user = (User) request.getSession().getAttribute("loginUser");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String location = request.getParameter("location");

        PsdDaoImpl dao = new PsdDaoImpl();
        dao.deletePasswordList(new PasswordList(user.getTel(),username,password,location));
        response.sendRedirect("MyPasswordListServlet");
    }
}
