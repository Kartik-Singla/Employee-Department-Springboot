package com.springboot.paytm.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.springboot.paytm.department.Department;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String sex;
	
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;
	
	public Employee() {
		
	}
	public Employee(int id, String name, Department dept_id, int age, String sex) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.department = dept_id;
//		this.department = new Department(dept_id, "");
	}
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	

}

