import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement call = null;
		try {
			// 데이터베이스 드라이버 클래스 로드
			Class.forName("oracle.jdbc.OracleDriver");
			// 데이터베이스 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

			// System.out.println("성공");

			// //실행할 Statement 객체 만들기
			// call = conn.prepareCall("{call insertDeptProc(?,?,?)}");

			call = conn.prepareCall("{call deleteDeptProc(?)}");
			// //물음표에 실제 값 바인딩
			// call.setInt(1, 11);
			// call.setString(2, "회계");
			// call.setString(3, "서울");
			//
			call.setInt(1, 11);
			// //삽입 구문 실행
			// int r = call.executeUpdate();
			// if(r > 0) {
			// System.out.println("삽입 성공");
			// }else {
			// System.out.println("삽입 실패");
			// }

			int r = call.executeUpdate();
			if (r > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}

	}

}
