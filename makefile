#This is the makefile used by the make utility to compile the EnDaBi Demos
SQLITEDEMO : CREATE_TABLE.java frameDemo.java QUERY.java Search.java
	javac -cp ".:sqlite-jdbc-3.8.7.jar" *.java
	java -cp ".:sqlite-jdbc-3.8.7.jar" CREATE_TABLE
	@echo to run the demo input java -cp '"'.:sqlite-jdbc-3.8.7.jar'"' frameDemo
