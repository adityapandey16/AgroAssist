package communityDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import community.model.*;

public class communityDao 
{

		Connection con;
		PreparedStatement ps;
		ResultSet rs;



		public int savedata(List<community> comlst)
		{
			community com=null;
			con = CommunityMyConnection.myConnection();
			int i=0;

			Iterator<community> itr = comlst.iterator();

			while(itr.hasNext())
			{
				com=itr.next();
				{
					try {
						ps=con.prepareStatement("insert into community2 values(?,?,?,?)");
						ps.setInt(1,com.getQuestion_id());
						ps.setString(2,com.getQuestion());
						ps.setInt(3,com.getAnswer_id());
						ps.setString(4,com.getAnswer());
						i=ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally {
						try {
							con.close();
						}catch(SQLException e) {
							e.printStackTrace();
						}
					}
					return i;

				}
			}
			return i;
		}
		public List<community> getAllData()
		{
			List<community> lst=new LinkedList<community>();
			con=CommunityMyConnection.myConnection();

			try {
				Statement s=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
				rs=s.executeQuery("select * from community2");

				community c=new community();
				c.setQuestion_id(rs.getInt(1));
				c.setQuestion(rs.getString(2));
				c.setAnswer_id(rs.getInt(3));
				c.setAnswer(rs.getString(4));
				lst.add(c);
				System.out.print("cnt");

			} catch (Exception e) {

				System.out.print(e);
			}
			return lst;

		}
		public boolean validate(community c)
		{
			List<community> lst=getAllData();
			boolean b= false;
			for(community cl: lst)
			{
				if(cl.getQuestion_id()==c.getQuestion_id())
				{
					if(cl.getAnswer_id()==(c.getAnswer_id()))
					{
						b=true;
						break;
					}
				}
			}
			return b;

		}

	}



