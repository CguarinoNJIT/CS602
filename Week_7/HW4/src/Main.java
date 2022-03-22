import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class login
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
  protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out=response.getWriter();
    String userId=request.getParameter("userId");

    try{
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8080/ATM?user=root&password=Sakthi@2207");
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("Select * from accountInfo ");
      while(rs.next())
      if(Integer.valueOf(userId).intValue()==101 | Integer.valueOf(userId).intValue()==102 ){
        out.println("Your Authentication has failed,please try again");
        RequestDispatcher
        rd=request.getRequestDispatcher("User.html");
        rd.forward(request,response);
      }
      else{
        out.println("Your Authentication has failed,please try again");
        RequestDispatcher
        rd=request.getRequestDispatcher("Main.html");
        rd.forward(request,response);
      }
    } 
    catch(Exception e){
      out.println("ERROR: "+e);
    }
  }
}