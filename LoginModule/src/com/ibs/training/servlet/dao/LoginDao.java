package com.ibs.training.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDao {
	
	public boolean check(String username, String pass) throws SQLException{
		
		String sql="SELECT * FROM details where username=? and password=?";
		String url="jdbc:postgresql://localhost:5432/login";
        String user="postgres";
        String password="manager123";
		
		try {
			Class.forName("org.postgresql.Driver");
			 Connection con=DriverManager.getConnection(url, user, password);
		     PreparedStatement st=con.prepareStatement(sql);
		     st.setString(1, username);
		     st.setString(2, pass);
		     ResultSet rs = st.executeQuery();
		     if(rs.next()){
		    	 return true;
		     }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		return false;
		
		
	}

}
