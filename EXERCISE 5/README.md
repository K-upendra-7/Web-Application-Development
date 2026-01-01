 ## 5. Develop a java standalone application that connects with the database (Oracle / mySql) and perform the CRUD operation on the database tables. 


Steps to Connect with the Database:
1. To Connect with the Database we need to use the JDBC (Java Database Connectivity)
2. First we need to load the Oracle JDBC driver using the Class.forName() method
3. Then we need to establish the connection using the DriverManager.getConnection() method
4. Then we need to create the statement using the Connection.createStatement() method
5. Then we need to execute the query using the Statement.executeQuery() method
6. Then we need to close the statement using the Statement.close() method
7. Then we need to close the connection using the Connection.close() method

URL : upendra/12345@localhost:1521/XEPDB1