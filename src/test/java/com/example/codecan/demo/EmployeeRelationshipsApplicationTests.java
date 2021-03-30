package com.example.codecan.demo;

import com.example.codecan.demo.models.Department;
import com.example.codecan.demo.models.Employee;
import com.example.codecan.demo.models.Project;
import com.example.codecan.demo.repositories.DepartmentRepository;
import com.example.codecan.demo.repositories.EmployeeRepository;
import com.example.codecan.demo.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeRelationshipsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department = new Department("HR");
		departmentRepository.save(department);

		Employee employee = new Employee("Bob", "Bobberson", department);
		employeeRepository.save(employee);

		Project project = new Project("Java Project", 2);
		projectRepository.save(project);

		project.addEmployeeToProject(employee);
		projectRepository.save(project);

	}

}
