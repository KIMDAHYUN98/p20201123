package com.yedam.db2;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// 1. 전체조회, 2. 한건조회, 3. 입력, 4. 수정, 5. 삭제

		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImp1();

		while (true) {
			System.out.println("==============================================");
			System.out.println("1. 전체조회 2. 검색 3. 입력 4. 수정 5. 삭제 6. 종료"); //
			System.out.println("==============================================");
			System.out.println("선택 > ");
			int selectNO = scn.nextInt(); scn.nextLine();
			
			if (selectNO == 1) {
				List list = service.getEmpList();
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpInfo();

				}

			} else if (selectNO == 2) {

				System.out.println("조회할 사원번호 입력 : ");
				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpInfo();

			} else if (selectNO == 3) {

//				EmployeeVO vo = new EmployeeVO();
//				service.insertEmp(vo);
				addEmployeeVO();

			} else if (selectNO == 4) {
				System.out.println("수정할 사원 번호 : ");
				int empId = scn.nextInt(); scn.nextLine();
				System.out.println("수정할 이메일 : ");
				String email = scn.nextLine();
				System.out.println("수정할 전화번호 : ");
				String phoneNumber = scn.nextLine();
				System.out.println("수정할 급여 : ");
				String salary = scn.nextLine();
				if(salary == null || salary.equals(""))
					salary = "0";
				int sal = Integer.parseInt(salary); //문자열인 숫자를 읽어서 숫자로 바꿔눔
				
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNumber);
				vo.setSalary(sal);
				
				service.updateEmp(vo);

			} else if (selectNO == 5) {
				
				System.out.println("삭제할 사원번호 입력 : ");
				int empId = scn.nextInt();
				service.deleteEmp(empId);

			} else if (selectNO == 6) {

				break;

			}
		} // end of while

	} // end of main

	public static void addEmployeeVO() {
		System.out.println("퍼스트 네임을 입력하세요 > ");
		String firstName = scn.nextLine();
		System.out.println("라스트 네임을 입력하세요 > ");
		String lastName = scn.nextLine();
		System.out.println("사원번호를 입력하세요 > ");
		int employeeId = scn.nextInt(); scn.nextLine();
		System.out.println("이메일을 입력하세요 > ");
		String email = scn.nextLine();
		System.out.println("입사한 날짜를 입력하세요 > ");
		String hireDate = scn.nextLine();
		System.out.println("직업을 입력하세요 > ");
		String jobId = scn.nextLine();

		EmployeeVO vo = new EmployeeVO(firstName, lastName, employeeId, email, hireDate, jobId);
		EmpDAO dao = new EmpDAO();
		dao.insertEmp(vo);

	}
} // end of class
