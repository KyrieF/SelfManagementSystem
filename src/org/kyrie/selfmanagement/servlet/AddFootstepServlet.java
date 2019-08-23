package org.kyrie.selfmanagement.servlet;

import org.kyrie.selfmanagement.dao.impl.FootDaoImpl;
import org.kyrie.selfmanagement.po.Footstep;
import org.kyrie.selfmanagement.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "AddFootstepServlet")
public class AddFootstepServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        User user = (User) request.getSession().getAttribute("loginUser");
        Footstep footstep = new Footstep();
        footstep.setTel(user.getTel());
        footstep.setTitle(request.getParameter("title"));
        footstep.setParagragh(request.getParameter("paragragh"));
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        footstep.setTime(df.format(new Date()));
        FootDaoImpl dao = new FootDaoImpl();
        dao.AddFootstep(footstep);
        response.sendRedirect("MyFootstepServlet");

    }
}
