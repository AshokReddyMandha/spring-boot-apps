package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Employee;
import com.ashokit.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepo empRepo;
	public void saveEmp(){
		Employee emp1 = new Employee();	
		emp1.setEmpId(101);
		emp1.setEmpName("OneZeroOne");
		emp1.setEmpSalary(100.10);
		Employee savedEmp = empRepo.save(emp1);
		
		System.out.println("Employee is stored in H2 DB successfully :"+savedEmp.toString());
	}
	
}
