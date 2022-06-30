package com.springboot.paytm.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	
	@RequestMapping("/employee")
	public List<Employee> getEmployees() {
		return employeeservice.getEmployees();
	}
	
	@RequestMapping("/employee/{id}")
	@Cacheable(key="#id", value="Employee")
	public Employee getEmployee(@PathVariable int id) {
		return employeeservice.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public void addEmployee(@RequestBody Employee emp)
	{
		
		try {
			employeeservice.addEmployee(emp);
		}
		catch(JpaObjectRetrievalFailureException e){
			System.out.println("Department "+ emp.getDepartment().dept_id + " not found");
		}	
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void addEmployees(@RequestBody List<Employee> emp)
	{
			employeeservice.addEmployees(emp);	
	}
	@CachePut(key="#id", value="Employee")
	@RequestMapping(method = RequestMethod.PUT, value = "employee/{id}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable int id)
	{
		
		try {
			employeeservice.updateEmployee(emp,id);
		}
		catch(EmptyResultDataAccessException e)
		{
			System.out.println("Employee" + id +"doesnot exist");
		}
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "employee/{id}")
	@CacheEvict(key="#id", value = "Employee")
	public void deleteEmployee(@PathVariable int id)
	{
		try {
			employeeservice.deleteEmployee(id);
		}
		catch(EmptyResultDataAccessException e)
		{
			System.out.println("Employee" + id +"doesnot exist");
		}
	}
	
	
	

}
