package com.example.employee;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@SpringBootTest
@RunWith(SpringRunner.class)
class EmployeeApplicationTests {
    @Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}
	@Test
	void saveEmployee()
	{
		Employee employee = new Employee();
		employee.setId(1);
		employee.setDesignation("Senior Software Engineer");
		employee.setName("Anwar mulla");
		employee.setSalary(50000);
		Employee save = employeeRepository.save(employee);
		Assertions.assertNotNull(save);

	}

}
