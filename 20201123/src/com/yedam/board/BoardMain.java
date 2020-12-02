package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServicelmpl();

		while (true) {
			System.out.println("========================================");
			System.out.println("1. 전체조회 2. 입력 3. 수정 4. 삭제 5. 종료 6.한건조회");
			System.out.println("========================================");
			System.out.println("선택 > ");

			
			int selectNo = scn.nextInt();scn.nextLine();
			
			if (selectNo == 1) {
				List list = service.getBoardList();
				for (Object vo : list) {
					BoardVO board = (BoardVO) vo;
					board.showBoardInfo();
				}

			} else if (selectNo == 2) {
				addBoardVO();
			} else if (selectNo == 3) {
				System.out.println("update board_no > ");
				int boardNo = scn.nextInt(); scn.nextLine();
				System.out.println("update title > ");
				String title = scn.nextLine();
				System.out.println("update content > ");
				String content = scn.nextLine();
				System.out.println("update writer > ");
				String writer = scn.nextLine();
				System.out.println("update creation_date > ");
				String creationDate = scn.nextLine();

				BoardVO vo = new BoardVO();
				vo.setBoardNo(boardNo);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
				vo.setCreationDate(creationDate);

				service.updateBoard(vo);
				
			} else if (selectNo == 4) {
				System.out.println("delete board_no > ");
				int boardNo = scn.nextInt();
				service.deleteBoard(boardNo);
			} else if (selectNo == 5) {
				break;
			} else if (selectNo == 6) {
				System.out.println("select board_no > ");
				int boardNo = scn.nextInt();
				BoardVO vo = service.getBoard(boardNo);
				vo.showBoardInfo();
			}
		} // end of while

	}// end of main

	public static void addBoardVO() {
		System.out.println("board_no insert > ");
		int boardNo = scn.nextInt(); scn.nextLine(); 
		System.out.println("title insert > ");
		String title = scn.nextLine(); 
		System.out.println("content insert > ");
		String content = scn.nextLine();
		System.out.println("writer insert > ");
		String writer = scn.nextLine();
		System.out.println("creation_date insert > ");
		String creationDate = scn.nextLine();

		BoardVO vo = new BoardVO(boardNo, title, content, writer, creationDate);
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(vo);
	}
}// end of class
