import java.sql.*;

public class Main {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost/test?user=root&password=root");
      Statement stmt = con.createStatement();
      try{
    	  String SQL = "DROP TABLE simple";
    	  stmt.execute(SQL);
      }catch(Exception e){
      }
      stmt.execute("CREATE TABLE IF NOT EXISTS simple( name char(30))");
      stmt.execute("Insert into simple values('John Doe')");
	stmt.execute("Insert into simple values('Jane Doe')");
      ResultSet rs = stmt.executeQuery("Select * from simple");
      while ( rs.next())
        System.out.println(rs.getString(1));
    } catch (Exception ex) {
      System.out.println("Message: " + ex.getMessage());
      System.exit(0);
    }
    System.out.println("Program terminated with no error.");
  }
}
