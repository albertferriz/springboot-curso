package com.privalia.condiciones.integration.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.privalia.condiciones.config.EmployeeConfig;
import com.privalia.condiciones.config.EmployeeDataSourceConfig;
import com.privalia.condiciones.service.EmployeeService;
import com.privalia.condiciones.model.Employee;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		classes={EmployeeConfig.class,
				EmployeeDataSourceConfig.class},
			loader=AnnotationConfigContextLoader.class)
public class Spring4ProdConditionalIntegrationTest {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void testDevDataSource() {
		EmployeeService service = (EmployeeService) 
				applicationContext
				.getBean("employeeService");
		
		assertNotNull(service);
		List<Employee> employeeDetails = service.getEmployeeDetails();
		
		assertEquals(3, employeeDetails.size());
		assertEquals("Ramu", employeeDetails.get(0).getName());
		assertEquals("Charan", employeeDetails.get(1).getName());
		assertEquals("Joe", employeeDetails.get(2).getName());
	}
	
}
