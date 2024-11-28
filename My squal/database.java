import java.io.*; 
import java.sql.*; 

public class database { 

	static final String url 
		= "jdbc:mysql://localhost:3306/db"; 

	public static void main(String[] args) 
		throws ClassNotFoundException 
	{ 
		try { 
			
			Class.forName("com.mysql.jdbc.Driver"); 

			Connection conn = DriverManager.getConnection( 
				url, "root", "1234"); 

			Statement stmt = conn.createStatement(); 

			int result = stmt.executeUpdate( 
				"insert into emp_detail(empcode,empname,empage,empsalary) values('101','Jenny','25','10000'),('102','Jacky','30','20000'),('103','Joe','20','40000'),('104','John','40','80000'),('105','Shameer','25','90000')"); 

			if (result > 0) 
				System.out.println("successfully inserted"); 

			else
				System.out.println( 
					"unsucessful insertion "); 
			conn.close(); 
		} 

		catch (SQLException e) { 
			System.out.println(e); 
		} 
	} 
}
