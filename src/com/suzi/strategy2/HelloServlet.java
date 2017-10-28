package com.suzi.strategy2;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/strategy2.do")
public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String type=request.getParameter("type");
        String money=request.getParameter("money");

        System.out.println(type+"---------"+money);

        Double realmoney=0d;
        CashContext cashContext=new CashContext(type);
        realmoney=cashContext.getResult(Double.valueOf(money));
        System.out.println(realmoney);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter pw = response.getWriter();
//        pw.write("<h1> hello first servlet!</h1>");
    }
}
