package com.thinkitive;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int id;
	private String name;
	private int sal;
	private Set <String> skills;
	private Address a;

	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", skills=" + skills + ", a=" + a + "]";
	}
	
	private Employee() {
		super();
		
	}
	
	
	public Employee(int id, String name, int sal, Set<String> skills, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.skills = skills;
		this.a = a;
	}
	
	public Employee(Address a) {
		super();
		this.a = a;
	}
	public static Employee getEmployee()
	{
		Employee ex=new Employee();
		System.out.println("default conctructor called");
		return ex;
	}
			
}
