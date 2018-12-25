import org.omg.CORBA.Request;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoPerson extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        PrintWriter pw  = response.getWriter();
        String name = request.getParameter("login");
        String pas = request.getParameter("password");
        RequestDispatcher dispatcher;
        if(name.equals("faworit") && pas.equals("asd")){
            dispatcher = request.getRequestDispatcher("/faworit");
            dispatcher.forward(request, response);
        } else if(name.equals("user") && pas.equals("123")){
            dispatcher = request.getRequestDispatcher("/user.jsp");
            dispatcher.forward(request, response);
        }
        else {
            pw.println("You enter not correct password or login");
        }
    }
}
