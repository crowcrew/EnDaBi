
/*
Copyright 2015 ALYA SALMAN . 
This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Lesser General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 See the 
GNU Lesser General Public License for more details.
You should have received a copy of the GNU Lesser General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

import java.sql.*;

import javax.swing.JOptionPane;


public class EDIT_VALUE {
	private String name;
	private String nat_id;
	private String a1,a2,a3;
	 
	
	public void Insert(String n_id,String n, String a_1, String a_2, String a_3, char a)
	{
		
		name=n;
		nat_id=n_id;
		a1=a_1;
		a2=a_2;
		a3=a_3;
		

	    Connection c = null;
	    Statement stmt = null;
	    switch(a)
	    {
	    case '1':
	    	try {
	  	      Class.forName("org.sqlite.JDBC");
	  	      c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db");
	  	      c.setAutoCommit(false);
	  	      //System.out.println("Opened database successfully");
	  	      stmt = c.createStatement();
	  	      String sql = "INSERT INTO STUDENTS (EMP_ID,NAT_ID,NAME,A1,A2,A3) " +
	  	                   "VALUES (null,"+nat_id+", '"+name+"', "+a1+", "+a2+", "+a3+" );"; 
	  	      stmt.executeUpdate(sql);
	  	      stmt.close();
	  	      c.commit();		 
	  	      c.close();
	  	    } catch ( Exception e ) {
	  	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	  	      System.exit(0);
	  	    }
	  	    //System.out.println("Records created successfully");
	  	    JOptionPane.showMessageDialog(null, "Records created successfully");
	    	break;
	    case '2':
	    	try {
		  	      Class.forName("org.sqlite.JDBC");
		  	      c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db");
		  	      c.setAutoCommit(false);
		  	    //  System.out.println("Opened database successfully");
		  	      stmt = c.createStatement();
		  	      String sql = "INSERT INTO EMPLOYEES (EMP_ID,NAT_ID,NAME,A1,A2,A3) " +
		  	                   "VALUES (null,"+nat_id+", '"+name+"', "+a1+", "+a2+", "+a3+" );"; 
		  	      stmt.executeUpdate(sql);
		  	      stmt.close();
		  	      c.commit();		 
		  	      c.close();
		  	    } catch ( Exception e ) {
		  	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		  	      System.exit(0);
		  	    }
		  	    //System.out.println("Records created successfully");
		  	  JOptionPane.showMessageDialog(null, "Records created successfully");
	    	break;
	    case '3':
	    	try {
		  	      Class.forName("org.sqlite.JDBC");
		  	      c = DriverManager.getConnection("jdbc:sqlite:sqldb2.db");
		  	      c.setAutoCommit(false);
		  	      //System.out.println("Opened database successfully");
		  	      stmt = c.createStatement();
		  	      String sql = "INSERT INTO GUARDS (EMP_ID,NAT_ID,NAME,A1,A2,A3) " +
		  	                   "VALUES (null,"+nat_id+", '"+name+"', "+a1+", "+a2+", "+a3+" );"; 
		  	      stmt.executeUpdate(sql);
		  	      stmt.close();
		  	      c.commit();		 
		  	      c.close();
		  	    } catch ( Exception e ) {
		  	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		  	      System.exit(0);
		  	    }
		  	    //System.out.println("Records created successfully");
		  	  JOptionPane.showMessageDialog(null, "Records created successfully");
	    	break;
	    }
}
	   public void Delete(String n, String n_id, char a)
	    {
	    	name =n;
	    	nat_id=n_id;
	    	a=frameDemo.w;
		    Connection c = null;
		    Statement stmt = null;
		    switch(a)
		    {
		    case '1':
		    	try {
		    		 Class.forName("org.sqlite.JDBC");
			  	      c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db");
			  	      c.setAutoCommit(false);
			  	      //System.out.println("Opened database successfully");
			  	      stmt = c.createStatement();
			  	      String sql = "DELETE FROM STUDENTS " +
			  	    		  		"WHERE NAME = '"+name+"' AND NAT_ID ="+n_id+";"; 			  	      
			  	      stmt.executeUpdate(sql);
			  	      stmt.close();
			  	      c.commit();		 
			  	      c.close();
			  	    } catch ( Exception e ) {
			  	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			  	      System.exit(0);
			  	    }
			  	    //System.out.println("Records deleted");
			  	  JOptionPane.showMessageDialog(null, "Records deleted");
		    	break;
		    case '2':
		    	try {
			  	      Class.forName("org.sqlite.JDBC");
			  	      c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db");
			  	      c.setAutoCommit(false);
			  	    //  System.out.println("Opened database successfully");
			  	      stmt = c.createStatement();
			  	      String sql = "DELETE FROM EMPLOYEES" +
		  	    		  		"WHERE NAME = '"+name+"' AND NAT_ID ="+n_id+";"; 			  	      
			  	      stmt.executeUpdate(sql);
			  	      stmt.close();
			  	      c.commit();		 
			  	      c.close();
			  	    } catch ( Exception e ) {
			  	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			  	      System.exit(0);
			  	    }
			  	    //System.out.println("Records deleted");
			  	  JOptionPane.showMessageDialog(null, "Records deleted");
		    	break;
		    case '3':
		    	try {
			  	      Class.forName("org.sqlite.JDBC");
			  	      c = DriverManager.getConnection("jdbc:sqlite:sqldb2.db");
			  	      c.setAutoCommit(false);
			  	      //System.out.println("Opened database successfully");
			  	      stmt = c.createStatement();
			  	      String sql = "DELETE FROM GUARDS " +
		  	    		  		"WHERE NAME = '"+name+"' AND NAT_ID ="+n_id+";"; 			  	      
			  	      stmt.executeUpdate(sql);
			  	      stmt.close();
			  	      c.commit();		 
			  	      c.close();
			  	    } catch ( Exception e ) {
			  	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			  	      System.exit(0);
			  	    }
			  	    //System.out.println("Records deleted");
			  	  JOptionPane.showMessageDialog(null, "Records deleted");
		    	break;
		    }	    	
	    	
	    }
}
