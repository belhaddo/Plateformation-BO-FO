package fr.utbm.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import fr.utbm.plateformation.services.*;

@WebServlet(name = "Singup" ,urlPatterns="/singup")
public class Singup extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String getFname = request.getParameter("fname");
        String getLname = request.getParameter("lname");
        String getEmail = request.getParameter("email");
        String getPwd = request.getParameter("pwd");
        String getCpwd = request.getParameter("cpwd");
        String getAdrs = request.getParameter("adrs");
        String getPhone = request.getParameter("phone");

        if(getPwd.equals(getCpwd)) {
            ClientService clientService = new ClientService();
            clientService.addClient(getFname, getLname, getEmail, getAdrs, getPhone, getPwd);
            response.sendRedirect(request.getContextPath() + "/pages/login.jsp");

        }
        else{
            response.sendRedirect(request.getContextPath() + "/pages/singup.jsp");


        }








    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
