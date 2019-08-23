package org.kyrie.selfmanagement.servlet;

import org.kyrie.selfmanagement.dao.impl.FootDaoImpl;
import org.kyrie.selfmanagement.po.Footstep;
import org.kyrie.selfmanagement.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "MyFootstepServlet")
public class MyFootstepServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        HttpSession seee = request.getSession();
        User user = (User) request.getSession().getAttribute("loginUser");
        FootDaoImpl dao = new FootDaoImpl();
        ArrayList<Footstep> footsteps = dao.myFootstep(user.getTel());
        seee.setAttribute("footsteps", footsteps);
        response.sendRedirect("timeless.jsp");
    }
}
