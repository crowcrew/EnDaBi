
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CREATE_TABLE {
	 public static void main( String [] args )
	  {
		    Connection c = null;
		    Statement stmt = null;
	   try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db");
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql =   "CREATE TABLE STUDENTS " +
		                 "(EMP_ID INTEGER PRIMARY KEY   AUTOINCREMENT," +
		                 " NAT_ID	INTEGER			NOT NULL,"+
		                 " NAME		CHAR(50)    	NOT NULL, " + 
		                 " A1		INTEGER     	NOT NULL, " + 
		                 " A2     	INTEGER			NOT NULL, " + 
		                 " A3		INTEGER 		NOT NULL)"; 
	      
	      stmt.executeUpdate(sql);
	      stmt.close();
	      stmt = c.createStatement();
	      sql =   "CREATE TABLE EMPLOYEES " +
		                 "(EMP_ID INTEGER PRIMARY KEY   AUTOINCREMENT," +
		                 " NAT_ID	INTEGER			NOT NULL,"+
		                 " NAME		CHAR(50)    	NOT NULL, " + 
		                 " A1		INTEGER     	NOT NULL, " + 
		                 " A2     	INTEGER			NOT NULL, " + 
		                 " A3		INTEGER 		NOT NULL)"; 
	      
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    
	    //Now the second table
	
	    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:sqldb1.db");
		      System.out.println("Opened database successfully");

		      stmt = c.createStatement();
		      String sql = "CREATE TABLE REGESTERATION " +
		                   "(ID		INT	      NOT NULL REFERENCES EMPLOYEES(EMP_ID) ," +
		                   " REG_TIME 	TEXT	NOT NULL)"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    try {
			      Class.forName("org.sqlite.JDBC");
			      c = DriverManager.getConnection("jdbc:sqlite:sqldb2.db");
			      System.out.println("Opened database successfully");

			      stmt = c.createStatement();
			      String sql =   "CREATE TABLE GUARDS " +
				                 "(EMP_ID INTEGER PRIMARY KEY   AUTOINCREMENT," +
				                 " NAT_ID	INTEGER			NOT NULL,"+
				                 " NAME		CHAR(50)    	NOT NULL, " + 
				                 " A1		INTEGER     	NOT NULL, " + 
				                 " A2     	INTEGER			NOT NULL, " + 
				                 " A3		INTEGER 		NOT NULL)"; 
			      
			      stmt.executeUpdate(sql);
			      stmt.close();
			      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);}
	    System.out.println("Table created successfully");
	  
	 

	 //TO DROP A TABLE
		    
/*	 	    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:C:/Users/HP/workspace/PDemo/database/sqldb.db");
		      System.out.println("Opened database successfully");

		      stmt = c.createStatement();
		      String sql = "DROP TABLE REGESTERATION"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
	    System.out.println("Table dropped successfully");*/
	  }}
	
