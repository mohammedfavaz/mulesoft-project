package com.Actions;

import java.sql.*;

public class Myclass{
	public Connection Letconnect(){
		Connection conn=null;
		string url,username=null,password=null:
		url='mysql://localhost:3306/my_db';
		username='root';
		password='';
		try{
			class.forName('com.mysql.jdbc.driver');
			DriverManager.getconnection(url,username,password);
		}   catch(SQLException | ClassNotFoundExecption e) {
			e.printStackTrace();
		}
		return conn;
		}
		public void fetchData(){
			connection conn=letconnect();
			string sql='select * from cars'
		try{
			statement sy=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				System.err.println(rs.getString(1)+' '+rs.getString(2));
		   }
		public	insertData(){
		 try { 
            		String url = "jdbc:msql:"; 
            		Connection conn = DriverManager.getConnection(url,"",""); 
            		Statement st = conn.createStatement(); 
			connection conn=letconnect();
			statement.executeUpdate('inser into customers"+"VALUES (1001, 'wagnor',123)");
		     }
		catch (Exception e) { 
            		System.err.println("Got an exception! "); 
            		System.err.println(e.getMessage()); 
        	     }	 		 
		public static void main(String[] args){
			MyClass.letConnect();
		}
}