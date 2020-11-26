package com.yedam.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BoardDAO {

	Connection conn = null;
	String sql;
	PreparedStatement pstmt;
	ResultSet rs;

	public List getBoardList() {
		conn = DAO.getConnection();
		sql = "select * FROM board order by 1";
		List<BoardVO> list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreationDate(rs.getString("creation_Date"));

				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void  insertBoard(BoardVO boardVO) {
	
		conn = DAO.getConnection();
		sql =  "INSERT INTO board(board_no, title, CONTENT, writer, creation_date)" + "VALUES(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardVO.getBoardNo());
			pstmt.setString(2, boardVO.getTitle());
			pstmt.setString(3, boardVO.getContent());
			pstmt.setString(4, boardVO.getWriter());
			pstmt.setString(5, boardVO.getCreationDate());
			
			int r = pstmt.executeUpdate();
			
			System.out.println(r + " 건이 입력됨");
		} catch (SQLException e) {
			e.printStackTrace();
	}
	}

		
	public void updateBoard(BoardVO vo) {
		sql = "UPDATE board SET board_no = ?, title = ?, content =?, writer = ?, creation_date = ?";
	
		conn = DAO.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBoardNo());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getWriter());
			pstmt.setString(5, vo.getCreationDate());
			
			pstmt.executeUpdate();
						
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 수정됨.");
		} catch(SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	public void deleteBoard(int boardNo) {
		sql = "delete from board where board_no = ?";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			int r = pstmt.executeUpdate();

			System.out.println(r + "건 삭제됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

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
