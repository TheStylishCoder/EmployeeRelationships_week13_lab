package com.example.codecan.demo;

import com.example.codecan.demo.models.Department;
import com.example.codecan.demo.models.Employee;
import com.example.codecan.demo.repositories.DepartmentRepository;
import com.example.codecan.demo.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeRelationshipsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department = new Department("HR");
		departmentRepository.save(department);

		Employee employee = new Employee("Bob", "Bobberson", department);
		employeeRepository.save(employee);

	}

}
