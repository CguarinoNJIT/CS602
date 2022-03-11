import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main") 

public class Main extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
    static final long serialVersionUID = 1L;
    
    public Main() {
        super();
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        
        //Initialize Get Data
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int radio_button = -1;
        String gender = "";
        String first_name = request.getParameter("First");
        String last_name = request.getParameter("Last");
        String title = "Welcome to My Store";

        //Error Handling
        try {
            if (!first_name.matches("[a-zA-Z]+")) {
                throw new IOException();
            }
        }
        catch (IOException e){
            out.println("<script type='text/javascript'>\n");
            out.println("alert('Please enter valid FirstName')");
            out.println("</script>\n");
            return;
        }
        try {
            if (!last_name.matches("[a-zA-Z]+")) {
                throw new IOException();
            }
        }
        catch (IOException e){
            out.println("<script type='text/javascript'>\n");
            out.println("alert('Please enter valid LastName')");
            out.println("</script>\n");
            return;
        }
        try {
            radio_button = Integer.parseInt(request.getParameter("rd"));
        }
        catch (Exception e){
            out.println("<script type='text/javascript'>\n");
            out.println("alert('Please choose Gender')");
            out.println("</script>\n");
            return;
        } 

        //Radio Switch
        switch(radio_button) {
            case 0: gender = "Mr."; break;
            case 1: gender = "Ms."; break;
            case 2: gender = ""; break;
        }

        //HTML
        out.println(
            "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor=\"#90EE90\">\n" +
            "<h1 align=\"center\">" + title + "</h1>\n" +
            "<ul>\n" +
            "Thank You " + " " + gender + " " + first_name + " " +
            last_name +
            "</ul>\n" +
            "</body></html>");
        }
}    