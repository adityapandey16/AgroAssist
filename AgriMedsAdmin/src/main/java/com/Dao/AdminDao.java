package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.Model.Admin;

public class AdminDao {

	Connection con;
	PreparedStatement pstat;
	ResultSet rs;
	
	public int savedata(List<Admin> lst) {
		con = MyConnection.getConnection();
		int i=0;
		Admin ad=null;
			Iterator<Admin> itr=lst.iterator();
			try {
				while(itr.hasNext())
				{
					ad=itr.next();
					PreparedStatement pstat=con.prepareStatement("insert into Admin values(?,?)");
					pstat.setString(1, ad.getUname());
					pstat.setString(2, ad.getPass());
				//	pstat.setString(3, ad.getUtype());
					i=pstat.executeUpdate();
				}
				if(i>0)
					{
						System.out.println("Record Saved..");
						return 1;
					}
					else 
					{
						System.out.println("Record not saved..");
						return 0;
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return i;
		
	}
	
	public List<Admin> getAllData() {
		List<Admin> lst=new LinkedList<Admin>();
		con = MyConnection.getConnection();
		try {
			Statement s=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=s.executeQuery("select * from Admin");
			while (rs.next()) 
			{
				Admin ad=new Admin();
				ad.setUname(rs.getString(1));
				ad.setPass(rs.getString(2));
				lst.add(ad);
				System.out.println("add");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	
	public boolean validateData(Admin ad) {
		System.out.println("Enter username and password");
		
		con = MyConnection.getConnection();
		List<Admin> lst = getAllData();
		Boolean b=false; 
		System.out.println(lst);
		for (Admin temp : lst) {
			if (temp.getUname().equals(ad.getUname())) 
			{
				if (temp.getPass().equals(ad.getPass()))
				{
					b=true;
					break;
				}
			}
		}
		return b;
	}
}
