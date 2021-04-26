package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.User;
import com.vs.DBConnection;

public class UserDao {

	public static int login_check(String email, String password) {
		// TODO Auto-generated method stub
		Connection con= DBConnection.getConnection();
		int id=0;
		try {
			String sql ="select id from usertable where email='"+email+"' and password='"+password+"'";
			Statement st = DBConnection.getStatement();
			ResultSet rs= st.executeQuery(sql);
			while(rs.next()) {
				id=rs.getInt("id");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return id;
	}

	public static boolean addUser(User user) {
		// TODO Auto-generated method stub
		String firstname =user.getFirstname();
	    String lastname = user.getLastname();
	    String email = user.getEmail();
	    String password = user.getPassword();
	    
	    boolean flag=true;
	    
	    try {
	    	Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO usertable (firstname, lastname, email, password) values (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, email);
            ps.setString(4, password);
            
    		flag=ps.execute();


	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
        return flag;
		
	}

	public static List<User> getAllEmployees(){
		List<User> list=new ArrayList<User>();
		
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from usertable");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				User user=new User();
				user.setId(rs.getInt(1));
				user.setFirstname(rs.getString(2));
				user.setLastname(rs.getString(3));
				user.setPassword(rs.getString(5));
				user.setEmail(rs.getString(4));
				
				list.add(user);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}

	public static int delete(int id) {
		// TODO Auto-generated method stub
		int i=0;
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from usertable where id=?");
			ps.setInt(1,id);
			i=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return i;
		
	}



	
}
