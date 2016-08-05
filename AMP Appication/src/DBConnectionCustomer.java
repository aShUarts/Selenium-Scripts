import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DBConnectionCustomer {
	public static String email;
	public static String name;
	
	static String x;
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static String dbconnection() 
	{
		// TODO Auto-generated method stub
		try
		
		{
			MysqlDataSource dataSource = new MysqlDataSource();
		    dataSource.setDatabaseName("amp_dev_v2");
		    dataSource.setUser("amp_admin_new");
		    dataSource.setPassword("maLu2Ec8");
		    dataSource.setServerName("192.168.101.38");
		    
		    java.sql.Connection conn = dataSource.getConnection();
		    java.sql.Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery("SELECT email FROM amp_dev_v2.`ua_user_customer` WHERE username LIKE '%JimGor%'ORDER BY createdate DESC LIMIT 1");
		    while (rs.next()) 
		    {
		    x = rs.getString("email");
		   email = x;
		   name = rs.getString("name");
		    System.out.println(email+" "+name);
		    }
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
		return x;
		}
}


