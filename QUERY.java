
import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

public class QUERY extends frameDemo {
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
String input = s.nextLine();
Connection c = null;
Statement stmt = null;
try {
Class.forName("org.sqlite.JDBC");
c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db");
System.out.println("Opened database successfully");
JOptionPane.showMessageDialog(null, "Opened database successfully");

stmt = c.createStatement();
stmt.executeUpdate(input);
stmt.close();
c.commit();		 
c.close();
} catch ( Exception e ) {
System.err.println( e.getClass().getName() + ": " + e.getMessage() );
System.exit(0);
}

}
}
