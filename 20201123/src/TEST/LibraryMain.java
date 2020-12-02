package TEST;

import java.util.List;
import java.util.Scanner;

public class LibraryMain {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		LibraryService service = new LibraryServicelmpl();

		while (true) {
			System.out.println("========================================");
			System.out.println("1. 등록 2. 수정. 3. 삭제 4. 전체목록 5. 종료");
			System.out.println("========================================");
			System.out.println("선택 > ");

			
			int selectNo = scn.nextInt();scn.nextLine();
			
			if (selectNo == 1) {
				addLibraryVO();

			} else if (selectNo == 2) {
				
			} else if (selectNo == 3) {
				
			} else if (selectNo == 4) {
				
			} else if (selectNo == 5) {
				break;
			} 
		} // end of while
		
	}// end of main
	
	public static void addLibraryVO() {
		System.out.println("도서번호 > ");
		int number = scn.nextInt(); scn.nextLine();
		System.out.println("이름 > ");
		String name = scn.nextLine();
		System.out.println("비밀번호 > ");
		int passwd = scn.nextInt();
		System.out.println("나이 > ");
		int age = scn.nextInt();
		
		LibraryVO vo = new LibraryVO(number, name, passwd, age);
		LibraryDAO dao = new LibraryDAO();
		dao.insertlibrary(vo);
	}
}// end of class
