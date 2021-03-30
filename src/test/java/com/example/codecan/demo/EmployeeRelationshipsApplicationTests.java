package com.example.codecan.demo;

import com.example.codecan.demo.models.Employee;
import com.example.codecan.demo.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeRelationshipsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee = new Employee("Bob", "Bobberson");
		employeeRepository.save(employee);

	}

}
