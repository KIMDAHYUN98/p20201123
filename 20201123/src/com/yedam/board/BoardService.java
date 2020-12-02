package com.yedam.board;

import java.util.List;

public interface BoardService {
	
	public void insertBoard(BoardVO boardVO);
	public void updateBoard(BoardVO boardVO);
	public void deleteBoard(int boardNo);
	public List getBoardList();
	public BoardVO getBoard(int boardNo);

}
