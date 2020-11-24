package com.yedam.db;

import java.util.Scanner;

public class EmpMain {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// 사원정보, 부서정보

		while (true) {
			System.out.println("=============================================");
			System.out.println("1. 사원정보 2. 부서정보 3. 종료 4. 사원입력");
			System.out.println("=============================================");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt(); scn.nextLine();
			if (selectNo == 1) {

				EmpDAO dao = new EmpDAO();
				Employee[] employees = dao.getEmpList();
				for (Employee emp : employees) {
					if (emp != null) {
						emp.showEmpInfo();
					}

				}
			} else if (selectNo == 2) {

			DeptDAO dao2 = new DeptDAO();
			Department[] departments = dao2.getDeptList();
			for (Department dept : departments) {
				if(dept != null) {
					dept.showDeptInfo();
				}
			}

			} else if (selectNo == 3) {

				System.out.println("종료합니다.");
				break;
			
			} else if(selectNo == 4) {
				addEmployee();
			}
			
			
		}
		
		System.out.println("end of prog");
	}//end of main()

	public static void addEmployee() {
		System.out.println("이름을 입력하세요 > ");
		String name = scn.nextLine();
		System.out.println("이메일을 입력하세요 > ");
		String email = scn.nextLine();
		System.out.println("직무를 입력하세요 > ");
		String jobId = scn.nextLine();
		System.out.println("입사일자를 입력하세요 > ");
		String hireDate = scn.nextLine();
		
		Employee emp = new Employee(name, email, hireDate, jobId);
		EmpDAO dao = new EmpDAO();
		dao.insertEmployee(emp);
		
	}
	
}//end of class
