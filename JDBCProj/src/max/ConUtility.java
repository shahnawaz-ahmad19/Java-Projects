package max;

import java.sql.Connection; 
import java.sql.DriverManager;

public class ConUtility {
private static Connection con = null;
  private ConUtility()
{
	
}
	static
	{
		try {
			Class.forName("org.postgresql.Driver"); // Register the driver class
			String url = "jdbc:postgresql://localhost:5432/26sep";
 con = DriverManager.getConnection(url, "postgres", "0596");// Creating the connection object
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static Connection getConnn()
	{
		return con;
		
	}
}
