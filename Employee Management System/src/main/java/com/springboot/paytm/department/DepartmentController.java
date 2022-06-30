package com.springboot.paytm.department;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.dao.EmptyResultDataAccessException;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentService departmentservice;
	
	@RequestMapping("/department")
	public List<Department> getDepartments() {
		return departmentservice.getDepartments();
	}
	
	@Cacheable(key="#id", value="Department")
	@RequestMapping("/department/{id}")
	public Department getDepartment(@PathVariable int id) {
		return departmentservice.getDepartment(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/department")
	public void addDepartment(@RequestBody Department emp)
	{
		departmentservice.addDepartment(emp);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/departments")
	public void addDepartment(@RequestBody List<Department> emp)
	{
		departmentservice.addDepartments(emp);
	}
	@CachePut(key="#id", value="Department")
	@RequestMapping(method = RequestMethod.PUT, value = "department/{id}")
	public void updateDepartment(@RequestBody Department emp,@PathVariable int id)
	{
		
		try {
			departmentservice.updateDepartment(emp,id);
			}
			catch(EmptyResultDataAccessException e)
			{
				System.out.println("Department" + id +"doesnot exist");
			}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "department/{id}")
	@CacheEvict(key="#id", value = "Department")
	public void deleteDepartment(@PathVariable int id)
	{
		try {
		departmentservice.deleteDepartment(id);
		}
		catch(EmptyResultDataAccessException e)
		{
			System.out.println("Department" + id +"doesnot exist");
		}
	}
	
	
	

}
