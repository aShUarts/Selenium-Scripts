import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


public class DBConnection {

	public static String email_id;
	public static String company_name;
	
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
		    ResultSet rs = stmt.executeQuery("SELECT crm_cudtomer_email_id,company_name FROM am_crm WHERE COMMENT='The Account Manager has been selected' ORDER BY created_date DESC LIMIT 1;");
		    while (rs.next()) 
		    {
		    x = rs.getString("crm_cudtomer_email_id");
		   email_id = x;
		   company_name = rs.getString("company_name");
		    System.out.println(email_id+" "+company_name);
		    }
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
		return x;
		}
}

