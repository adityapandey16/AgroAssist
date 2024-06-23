package communityDao;

import java.sql.Connection;
import java.sql.DriverManager;

public class CommunityMyConnection
{
	static Connection con=null;
    public static Connection myConnection() {
    	
    	try {
    		Class.forName("oracle.jdbc.OracleDriver");
    		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","innovation");
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    		System.out.println(e);
    	}
		return con;
    }
}
