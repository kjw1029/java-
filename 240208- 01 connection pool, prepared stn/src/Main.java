import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Main {
	public static void main(String[] args) {
		// Person 테이블에서 이름으로 검색하여 행 조회
		MyDBCP dbcp = new MyDBCP();
		Connection conn = null;
		PreparedStatement stmt = null; // statement 자식
		ResultSet rs = null;
		
		try {
			conn = dbcp.getConnection();
			
			String sql = "SELECT * FROM person WHERE name = ?";
			stmt = conn.prepareStatement(sql); // 명령어 실행 불가능
			stmt.setString(1, "둘리");
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.printf("%s %d\n", name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
