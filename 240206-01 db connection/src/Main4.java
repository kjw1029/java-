import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main4 {
	public static void main(String[] args) {
		String query = "SELECT 100 AS NUM, \"my line\" AS STR;";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				int num =rs.getInt("NUM");
				String str = rs.getString("STR");
				
				System.out.println("값확인 : " + num);
				System.out.println("값확인 : " + str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if( rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
