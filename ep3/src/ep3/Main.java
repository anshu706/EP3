package ep3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main (String[] args) throws SQLException{
		// step 2
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		// step 3
		String url="jdbc:mysql://localhost:3306/parul";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parul","root","ansh2712");
				
		Statement st = conn.createStatement();
		st.executeUpdate("Insert into Students values(1, 'ansu','u')");
			
		//step 4
//		PreparedStatement st= conn.prepareStatement("insert into students values(20, 'Nitya','mumbai')");
//		PreparedStatement st1= conn.prepareStatement("insert into students values(12, 'Arjun','Daman')");
//		PreparedStatement st11= conn.prepareStatement("insert into students values(65, 'Rohit','Nimbahera')");
		
		//step 5
//		int count=st.executeUpdate();
//		
//		System.out.println(count +" rows affected");
		
		//step 4
		PreparedStatement st1 = conn.prepareStatement("select * from students ");
				
		ResultSet set= st1.executeQuery();
		
		while (set.next()) {
			System.out.println(set.getString("name"));
		}
	}
}

// To get Connected in MYSQL Shell => "\connect root@localhost:3306"
