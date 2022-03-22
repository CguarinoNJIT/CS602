import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/Deposit")
public class Deposit extends HttpServlet{
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String amount=request.getParameter("Dep");
        int iamount=Integer.parseInt(amount);
        String userId=request.getParameter("userId");
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8081/ATM?user=root&password=Sakthi@0722");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from accountInfo ");
            int balance=0;
            while(rs.next()){
                int s1=rs.getInt(3);
                balance=s1-iamount;
                if(balance<=0){
                    out.println("Please pay atleast the minimum amount");
                }
                else{
                    out.println("The amount is credited to your account");
                }
            }

        PreparedStatement pstmt=con.prepareStatement("update ATM set balance=?where userId=" + userId);
        pstmt.setInt(3,balance);
        int i = pstmt.executeUpdate();
        }
        catch(Exception e){ 
            out.println("ERROR: "+e);
        }
    }
}