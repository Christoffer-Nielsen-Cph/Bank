package com.example.bank;

import DomæneObjekter.Konto;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    Map<String, Konto> kontiMap = new HashMap<>();

    public void init() {


        Konto konto = new Konto("Chris", "123", 4000321);
        Konto konto1 = new Konto("Long", "123", 4201);
        Konto konto2 = new Konto("Dennis", "123", 32194);
        Konto konto3 = new Konto("Nikolaj", "123", 64812132);
        Konto konto4 = new Konto("Søren", "123", 69312321);
        Konto konto5 = new Konto("Betyl", "123", 69321511);

        kontiMap.put(konto.getNavn(),konto);
        kontiMap.put(konto1.getNavn(),konto1);
        kontiMap.put(konto2.getNavn(),konto2);
        kontiMap.put(konto3.getNavn(),konto3);
        kontiMap.put(konto4.getNavn(),konto4);
        kontiMap.put(konto5.getNavn(),konto5);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("Konti",kontiMap);
        String msg ="Her har du en oversigt over dine kontoer";
        request.setAttribute("msg",msg);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    public void destroy() {
    }
}