package com.yedam.address;

import java.util.Scanner;

public class FriendAddress {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];
//	public void exam(){
//		friends[0] = new Friend("test", "test");			
//  		}

	// 주소록 생성 프로그램...
	public static void main(String[] args) {

//		Friend [] friends = null; => 초기값, 안하면 에러
//		Friend[] friends = new Friend[100];

//		Scanner scn = new Scanner(System.in); // 입력값을 받아와서 scan이 처리함

		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.종료 6.조회");
			System.out.println("----------------------------------------------");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
//				System.out.println("친구이름 > ");
//				String name = scn.nextLine(); // name 이란 변수에다가 사용자가 입력한 값을 넣겠다
//				System.out.println("전화번호 > ");
//				String phone = scn.nextLine();
//
				Friend frnd = new Friend(name, phone); // 인스턴스를 만들어서 friend frnd 에다가 할당하겠다
//
//				for (int i = 0; i < friends.length; i++) {
//					if (friends[i] == null) {
//						friends[i] = frnd;
//						break;
//					}
//				}

				addFriend();
				insertFriend(frnd);

			} else if (selectNo == 2) {
//				System.out.println("친구이름 > ");
//				String name = scn.nextLine();
//				System.out.println("전화번호 > ");
//				String phone = scn.nextLine();
//				System.out.println("학교이름 > ");
//				String univ = scn.nextLine();
//				System.out.println("전공 > ");
//				String major = scn.nextLine();
//
//				UnivFriend frnd = new UnivFriend(name, phone);
//				frnd.setUniv(univ);
//				frnd.setMajor(major);
//
//				for (int i = 0; i < friends.length; i++) {
//					if (friends[i] == null) {
//						friends[i] = frnd;
//						break;
//					}
//				}

				addUnivFriend();

			} else if (selectNo == 3) {

//				System.out.println("친구이름 > ");
//				String name = scn.nextLine();
//				System.out.println("전화번호 > ");
//				String phone = scn.nextLine();
//				System.out.println("회사이름 > ");
//				String univ = scn.nextLine();
//				System.out.println("부서정보 > ");
//				String major = scn.nextLine();
//
//				CompFriend frnd = new CompFriend(name, phone);
//				frnd.setCompany(univ);
//				frnd.setDepartment(major);
//
//				for (int i = 0; i < friends.length; i++) {
//					if (friends[i] == null) {
//						friends[i] = frnd;
//						break;
//					}
//				}
				addCompFriend();

			} else if (selectNo == 4) {

//				for (int i = 0; i < friends.length; i++) {
//					if (friends[i] != null) {
//						friends[i].showFriendInfo();
//					}
//				}

				showFriendList();

			} else if (selectNo == 5) {

				break;
			} else if (selectNo == 6) {
//				System.out.println("전화번호 검색 > ");
//				String serachphone = scn.nextLine();
//				for (int i = 0; i < friends.length; i++) {
//					if (friends[i] != null) {
//						if (serachphone.equals(friends[i].getPhone())) {
//
//							friends[i].showFriendInfo();
//							break;
//
//						}
//					}
//				}
				serachFriend();
				
			}

		} // end of while()
		System.out.println("프로그램 종료.");
	}// end of main()

	// 1. 친구등록.
	public static void addFriend() {

		System.out.println("친구이름 > ");
		String name = scn.nextLine(); // name 이란 변수에다가 사용자가 입력한 값을 넣겠다
		System.out.println("전화번호 > ");
		String phone = scn.nextLine();

		Friend frnd = new Friend(name, phone); // 인스턴스를 만들어서 friend frnd 에다가 할당하겠다

//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] == null) {
//				friends[i] = frnd;
//				
//				
//
//			}
//
//		}
		insertFriend(frnd);
	
	}
	

	// 2.학교친구
	public static void addUnivFriend() {

		System.out.println("친구이름 > ");
		String name = scn.nextLine();
		System.out.println("전화번호 > ");
		String phone = scn.nextLine();
		System.out.println("학교이름 > ");
		String univ = scn.nextLine();
		System.out.println("전공 > ");
		String major = scn.nextLine();

		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);

		insertFriend(frnd);
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] == null) {
//				friends[i] = frnd;
				break;
			}
		}

	}

	// 3.회사친구
	public static void addCompFriend() {

		System.out.println("친구이름 > ");
		String name = scn.nextLine();
		System.out.println("전화번호 > ");
		String phone = scn.nextLine();
		System.out.println("회사이름 > ");
		String univ = scn.nextLine();
		System.out.println("부서정보 > ");
		String major = scn.nextLine();

		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(univ);
		frnd.setDepartment(major);

//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] == null) {
//				friends[i] = frnd;
		insertFriend(frnd);
				break;
			}
		}
	}

	// 4.리스트
	public static void showFriendList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo();
			}
		}

	}

	// 6.한건 조회
	public static void serachFriend() {
		System.out.println("전화번호 검색 > ");
		String serachphone = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (serachphone.equals(friends[i].getPhone())) {
					friends[i].showFriendInfo();
					break;

				}
			}
		}

	}
	// 7. 한건 입력

	public static void insertFriend(Friend friend) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;

			}
		}
	}
}// end of class
