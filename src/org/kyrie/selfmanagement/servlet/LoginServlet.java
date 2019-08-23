package org.kyrie.selfmanagement.servlet;

import org.kyrie.selfmanagement.dao.impl.UserDaoImpl;
import org.kyrie.selfmanagement.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String tel = request.getParameter("tel");
        String password = request.getParameter("password");

        UserDaoImpl dao = new UserDaoImpl();
        User user = dao.queryUser(tel);
        if (user != null && user.getPassword().equals(password)) {
            request.getSession().setAttribute("loginUser", user);
            System.out.println("--------------->"+user.getTel()+user.getPassword()+user.getNickname());
            request.getRequestDispatcher("menu.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.jsp?error=yes");
        }
    }
}
