package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import com.Model.Blog;
public class BlogDao {
	
	Connection con=MyConnection.getConnection();
	PreparedStatement pstat;
	ResultSet rs;
	
	public int savedata(List<Blog> lst) {
		int i=0;
		Blog b=null;
			Iterator<Blog> itr=lst.iterator();
			try {
				while(itr.hasNext())
				{
					b=itr.next();
					PreparedStatement pstat=con.prepareStatement("insert into Blog values(?,?)");
					pstat.setString(1, b.getBlogTitle());
					pstat.setString(2, b.getBlogDesc());
					i=pstat.executeUpdate();
				}
				if(i>0)
					{
						System.out.println("New Blog Added..");
						return 1;
					}
					else 
					{
						System.out.println("Blog is not added..");
						return 0;
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return i;
	}

}
