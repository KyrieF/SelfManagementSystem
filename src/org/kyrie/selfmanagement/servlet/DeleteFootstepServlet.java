package org.kyrie.selfmanagement.servlet;

import org.kyrie.selfmanagement.dao.impl.FootDaoImpl;
import org.kyrie.selfmanagement.po.Footstep;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteFootstepServlet")
public class DeleteFootstepServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        FootDaoImpl dao = new FootDaoImpl();
        dao.DeleteFootstep(request.getParameter("time"));
        response.sendRedirect("MyFootstepServlet");

    }
}
