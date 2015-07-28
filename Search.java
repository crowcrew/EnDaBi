
import java.sql.*;

import javax.swing.JOptionPane;
public class Search
{
    String name;
    public String result;
    public String Search_Values(String x, char a)
    {
        name=x;
        Connection c = null;
        Statement stmt = null;
        result ="";
        switch (a)
        {
        case '1':
            try
            {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db");
                stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM  STUDENTS where NAME LIKE'"+name+"%';");
                while ( rs.next() )
                {
                	result +=rs.getString("EMP_ID")+"   "+rs.getString("NAT_ID")+"   "+rs.getString("NAME")+"   "+rs.getString("A1")+"   "+rs.getString("A2")+"   "+rs.getString("A3")+ "\n";
                }
                rs.close();
                stmt.close();
                c.close();
            }
            catch ( Exception e )
            {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }JOptionPane.showMessageDialog(null, "Search Complete !");
            
            break;
        case '2':
            try
            {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db");
                stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM  EMPLOYEES where NAME LIKE'"+name+"%';");
                while ( rs.next() )
                {
                	result +=rs.getString("EMP_ID")+"   "+rs.getString("NAT_ID")+"   "+rs.getString("NAME")+"   "+rs.getString("A1")+"   "+rs.getString("A2")+"   "+rs.getString("A3")+ "\n";
                    }
                rs.close();
                stmt.close();
                c.close();
            }
            catch ( Exception e )
            {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }JOptionPane.showMessageDialog(null, "Search Complete !");
           
            break;
        case '3':
            try
            {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:sqldb2.db");
                stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM  GUARDS where NAME LIKE'"+name+"%';");
                while ( rs.next() )
                {
                	result +=rs.getString("EMP_ID")+"   "+rs.getString("NAT_ID")+"   "+rs.getString("NAME")+"   "+rs.getString("A1")+"   "+rs.getString("A2")+"   "+rs.getString("A3")+ "\n";
              
             }
                rs.close();
                stmt.close();
                c.close();
            }
            catch ( Exception e )
            {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            } JOptionPane.showMessageDialog(null, "Search Complete !"); 
           
            break;
            
        } 
        return result ;
    } public String EnDaBiReport()
    {
    	int num1=0,num2=0,num3=0;
        Connection c = null;
        Statement stmt = null;
        result ="";
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db"); 		//Connect to the database
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(NAT_ID) FROM  STUDENTS;");
            num1=rs.getInt("COUNT(NAT_ID)");
            rs = stmt.executeQuery("SELECT COUNT(NAT_ID) FROM  EMPLOYEES;");
            num2=rs.getInt("COUNT(NAT_ID)");
            c.close();
            c = DriverManager.getConnection("jdbc:sqlite:sqldb2.db"); 		//Connect to the database
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT COUNT(NAT_ID) FROM  GUARDS;");
            num3=rs.getInt("COUNT(NAT_ID)");
            rs.close();
            stmt.close();
            c.close();
        }
        catch ( Exception e )
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        result="Number of students: "+num1+"\nNumber of employees: "+num2+"\nNumber of guards: "+num3;
        return result;
    }

}
