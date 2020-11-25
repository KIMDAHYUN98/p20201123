package com.yedam.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {

	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체 조회

	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select * FROM emp1 order by 1"; // id 기준으로 정렬
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) { // 한개씩 가져와라
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setPhoneNumber(rs.getString("phone_number"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setSalary(rs.getInt("salary"));
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 한건 조회

	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "select * FROM emp1 Where employee_id = ?";
		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			int i = 0;
			if (rs.next()) {

				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setSalary(rs.getInt("salary"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;

	}

	// 한건 입력

	public void insertEmp(EmployeeVO vo) {

		sql = "INSERT INTO emp1(first_name, employee_id, last_name, email, hire_date, job_id)"
				+ "VALUES(?, ?, ?, ?, ?, ?)";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getFirstName());
			pstmt.setInt(2, vo.getEmployeeId());
			pstmt.setString(3, vo.getLastName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getHireDate());
			pstmt.setString(6, vo.getJobId());

			int r = pstmt.executeUpdate();

			System.out.println(r + " 건이 입력됨");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 한건 수정

	public void updateEmp(EmployeeVO vo) {
		if (vo.getSalary() != 0) {
			sql = "UPDATE emp1" + " SET email = nvl('" + vo.getEmail() + "', email)" + "  , phone_number = nvl('"
					+ vo.getPhoneNumber() + "', phone_number)" + "  , salary = nvl(" + vo.getSalary() + ", salary)"
					+ "WHERE employee_id = " + vo.getEmployeeId();
		} else { // salary 항목의 값을 바꾸지 않기 때문에 salary 컬럼을 빼버림
			sql = "UPDATE emp1" + " SET email = nvl('" + vo.getEmail() + "', email)" + "  , phone_number = nvl('"
					+ vo.getPhoneNumber() + "', phone_number)" + "WHERE employee_id = " + vo.getEmployeeId();
		}

		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 한건 삭제

	public void deleteEmp(int empId) {
		sql = "delete from emp1 where employee_id = ?";

		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();

			System.out.println(r + "건 삭제됨.");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
