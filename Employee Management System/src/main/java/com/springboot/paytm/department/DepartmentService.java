package com.springboot.paytm.department;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.paytm.exception.IllegalIdException;

@Service
@Transactional
public class DepartmentService {
	
//	@Autowired
	DepartmentRepository departmentrepository;
	
	
	public List<Department> getDepartments()
	{
		List<Department> dptlist = new ArrayList<>();
		Iterable<Department> d = departmentrepository.findAll();
		
		for(Department d1:d) {
			dptlist.add(d1);
		}
		return dptlist;
	}
	
	public Department getDepartment(int id)
	{
		return departmentrepository.findById(id).orElse(null);
	}
	public void addDepartments(List<Department> dpt)
	{
		for(Department d:dpt) {
			
			if(d.getDept_id() >0)
			departmentrepository.save(d);
			else
			{
				throw new IllegalIdException("Illegal Id Entered");
			}	
		}
	}
	
	public void addDepartment(Department dpt) {
		if(dpt.getDept_id()>0)
		departmentrepository.save(dpt);
		else throw new IllegalIdException("Illegal id entered");
	}

	public void updateDepartment(Department dpt, int id) {
		
		departmentrepository.save(dpt);
		
	}
	public void deleteDepartment(int id)
	{
		departmentrepository.deleteById(id);
	}
	
}
