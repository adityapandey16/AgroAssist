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
import com.Model.Library;


public class LibraryDao {
	
	Connection con=MyConnection.getConnection();
	PreparedStatement pstat;
	ResultSet rs;
	
	public int savedata(List<Library> lst) {
		int i=0;
		Library lib=null;
			Iterator<Library> itr=lst.iterator();
			try {
				while(itr.hasNext())
				{
					lib=itr.next();
					PreparedStatement pstat=con.prepareStatement("insert into Library values(?,?,?,?,?,?)");
					pstat.setInt(1, lib.getCropId());
					pstat.setString(2,lib.getCropName());
					pstat.setInt(3, lib.getPathId());
					pstat.setString(4, lib.getPathName());
					pstat.setString(5, lib.getCropPart());
					pstat.setString(6, lib.getCropDesc());
					
					i=pstat.executeUpdate();
				}
				if(i>0)
					{
						System.out.println("Record Saved in Library..");
						return 1;
					}
					else 
					{
						System.out.println("Record not saved in library..");
						return 0;
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return i;
		
	}
	
	public int deleteData(Library lib)
	{
		int i=0;
		try {
			pstat=con.prepareStatement("Delete from Library where CropId=? and CropPart=? and PathId=?");
			pstat.setInt(1, lib.getCropId());
			pstat.setString(2,lib.getCropPart());
			pstat.setInt(3,lib.getPathId());
			i=pstat.executeUpdate();
			if(i>0)
			{
				System.out.println("Record Deleted from Library..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public List<Library> getAllData() {
		List<Library> lst=new LinkedList<Library>();
		try {
			Statement s=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=s.executeQuery("select * from linkcodebank");
			while (rs.next()) 
			{
				Library lib=new Library();
				lib.setCropId(rs.getInt(1));
				lib.setCropName(rs.getString(2));
				lib.setPathId(rs.getInt(3));
				lib.setPathName(rs.getString(4));
				lib.setCropPart(rs.getString(5));
				lib.setCropDesc(rs.getString(6));
				lst.add(lib);
				System.out.println("add");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}


}
