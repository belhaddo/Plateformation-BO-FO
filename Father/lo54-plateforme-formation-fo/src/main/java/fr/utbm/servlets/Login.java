package fr.utbm.servlets;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login" ,urlPatterns = "/Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String getEmail = request.getParameter("email");
        String getPwd = request.getParameter("pwd");

       /* String theUrl = "http://localhost:8080/clients/connexion?email="+getEmail+"&mdp="+getPwd;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Boolean> reponseApi = null;
        HttpEntity<String> entity = new HttpEntity<>("parameters");
        reponseApi = restTemplate.exchange(theUrl, HttpMethod.GET, entity, Boolean.class);

        System.out.println(reponseApi.toString());*/

        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Boolean connexion;
        String getEmail = request.getParameter("email");
        String getPwd = request.getParameter("pwd");

        }
}
