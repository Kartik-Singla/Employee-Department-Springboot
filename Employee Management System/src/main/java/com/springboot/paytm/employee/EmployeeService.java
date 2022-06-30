package com.springboot.paytm.employee;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import com.springboot.paytm.exception.IllegalAgeException;
import com.springboot.paytm.exception.IllegalIdException;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	public List<Employee> getEmployees()
	{
		List<Employee> emplist = new ArrayList<>();
		Iterable<Employee> e = employeerepository.findAll();
		
		for(Employee e1:e) {
			emplist.add(e1);
		}
		return emplist;
	}	
	public Employee getEmployee(int id)
	{
		System.out.println("called getEmployee() from db");
		return employeerepository.findById(id).orElse(null);
	}
	public void addEmployee(Employee emp)
	{
		if(emp.getAge()>0 && emp.getId()>0)
		employeerepository.save(emp);
		else if(emp.getAge()<0)
			throw new IllegalAgeException("Illegal age entered");
		else if(emp.getId()<0)
			throw new IllegalIdException("Illegal id entered");

	}
	public void updateEmployee(Employee emp, int id) {
		
		employeerepository.save(emp);	
	}
	public void deleteEmployee(int id)
	{
		employeerepository.deleteById(id);
	}

	public void addEmployees(List<Employee> emp) {
		// 
		for(Employee e:emp) {
			if(e.getAge()>0 && e.getId()>0)
			{
				try {
					employeerepository.save(e);
				}
				catch(JpaObjectRetrievalFailureException ex) {
					System.out.println("Department not found");
				}
			}
			else if(e.getAge()<=0) {
				throw new IllegalAgeException("Illegal Age Entered");
			}
			else if(e.getId()<=0) {
				throw new IllegalIdException("Illegal Id Entered");
			}
				
		}
		
	}
	
}
