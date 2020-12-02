package com.yedam.db2;

import java.util.List;

public class EmpServiceImp1 implements EmpService {

	EmpDAO dao = new EmpDAO();
	
	@Override
	public List getEmpList() {
		
		return dao.getEmpList();
	}

	@Override
	public EmployeeVO getEmp(int empId) {
		
		return dao.getEmp(empId);
	}

	@Override
	public void insertEmp(EmployeeVO empVO) {
		dao.insertEmp(empVO);
		
	}

	@Override
	public void updateEmp(EmployeeVO empVO) {
		dao.updateEmp(empVO);
		
	}

	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);
		
	}

	@Override
	public List<EmployeeVO> getDeptList(String dept) {
		return dao.getDeptList(dept);
	}

}
