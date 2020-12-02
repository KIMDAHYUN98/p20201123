package TEST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class LibraryDAO {

	Connection conn = null;
	String sql;
	PreparedStatement pstmt;
	ResultSet rs;

	public void insertlibrary(LibraryVO vo) {
		conn = DAO.getConnection();
		sql = "INSERT INTO library(memberNo, name, passwd, age)" + "VALUES(?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getMemberNo());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getPasswd());
			pstmt.setInt(4, vo.getAge());

			int r = pstmt.executeUpdate();

			System.out.println(r + "건이 입력됨");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}


