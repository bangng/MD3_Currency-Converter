package rikkei.academy.currencyconverter;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Currency-Converter", value = "/convert")
public class HelloServlet extends HttpServlet {




    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));
        float vnd = rate * usd;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: " + rate + "</h1>");

        writer.println("<h1>Usd: " + usd + "</h1>");
        writer.println("<h1>Vnd: " + vnd + "</h1>");
        writer.println("</html>");
    }

    public void destroy() {
    }
}