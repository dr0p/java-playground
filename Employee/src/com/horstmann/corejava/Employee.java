package com.horstmann.corejava;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee
{
	private int id;
	private static int nextId = 1;
	private final String name;
	private double salary;
	private final Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
		hireDay = calendar.getTime();
		setId();
	}
	
	public String getName() { return name; }
	public double getSalary() { return salary; }
	public Date getHireDay() { return hireDay; }
	
	public void raiseSalary(double byPercent)
	{
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}
	
	public void setId()
	{
		id = nextId;
		nextId++;
	}
	public int getId()
	{
		return id;
	}
	
	public static int getNextID()
	{
		return nextId;
	}
}