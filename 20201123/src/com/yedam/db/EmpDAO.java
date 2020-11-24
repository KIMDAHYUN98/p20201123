package com.yedam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = getConnection();

	public void insertEmployee(Employee emp) { //
		String sql = "INSERT INTO emp1(last_name, email, job_id, hire_date)" + "VALUES(?, ?, ?, ?)"; // 쿼리를 생성

		try {
			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, emp.getLastName());
			psmt.setString(2, emp.getEmail());
			psmt.setString(3, emp.getJobId());
			psmt.setString(4, emp.getHireDate());

			int r = psmt.executeUpdate(); // insert, update, delete
			System.out.println(r + " 건이 입력됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Employee[] getEmpList() {
		String sql = "select * from emp1";
		Employee[] emps = new Employee[100];

		try {

			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("employee_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setPhoneNumber(rs.getString("Phone_Number"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setJobId(rs.getString("job_id"));
				emps[i++] = emp; // 배열 i번째에 위치해서 출력

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return emps;
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}

}
