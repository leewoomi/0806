import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement call = null;
		try {
			// �����ͺ��̽� ����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// �����ͺ��̽� ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

			// System.out.println("����");

			// //������ Statement ��ü �����
			// call = conn.prepareCall("{call insertDeptProc(?,?,?)}");

			call = conn.prepareCall("{call deleteDeptProc(?)}");
			// //����ǥ�� ���� �� ���ε�
			// call.setInt(1, 11);
			// call.setString(2, "ȸ��");
			// call.setString(3, "����");
			//
			call.setInt(1, 11);
			// //���� ���� ����
			// int r = call.executeUpdate();
			// if(r > 0) {
			// System.out.println("���� ����");
			// }else {
			// System.out.println("���� ����");
			// }

			int r = call.executeUpdate();
			if (r > 0) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
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
