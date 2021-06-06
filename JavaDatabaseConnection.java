import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaDatabaseConnection {
	
	public static String dbURL = "jdbc:mysql://localhost:3306/";
	public static String dbName = "agms";
	public static String userName = "root";
	public static String password = "root";
	
	public static String userTable = "user";
	public static String userAccountTable = "useraccount";
	public static String artistTable = "artist";
	public static String customerTable = "customer";
	public static String staffTable = "staff";
	public static String artTable = "art";
	public static String eventTable = "event";
	public static String eventRegistrationsTable = "eventregistrations";
	
	public static String countryTable = "country";
	public static String userTypeTable = "usertype";
	public static String userRoleTable = "userrole";
	public static String artisticStyleTable = "artisticstyle";
	public static String artistToStyleTable = "artistTostyle";
	public static String StatusTypeTable = "statustype";
	public static String eventTypeTable = "eventtype";
	public static String specializationTypeTable = "specializationtype";
	
	public static class DBConnection
	{

		public static int ExecuteQuery(String _query)
		{
			int x = 0;
			try {
                Connection connection = DriverManager.getConnection(dbURL + dbName, userName, password);
                String query = _query;
                Statement sta = connection.createStatement();
                x = sta.executeUpdate(query);
                ResultSet resultSet = sta.executeQuery(query);
                connection.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
			return x;
		}
	}
}
