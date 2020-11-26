package com.yedam.board;

import java.util.List;

public class BoardServicelmpl implements BoardService {

	BoardDAO dao = new BoardDAO();

	public void insertBoard(BoardVO boardVO) {
		dao.insertBoard(boardVO);

	}


	public void deleteBoard(int boardNo) {
		dao.deleteBoard(boardNo);

	}


	@Override
	public void updateBoard(BoardVO boardVO) {
		dao.updateBoard(boardVO);
		
	}


	@Override
	public List getBoardList() {
		
		return dao.getBoardList();
	}

}
