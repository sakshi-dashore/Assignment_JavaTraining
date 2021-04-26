package com.interfaceassignment;

public class Employee implements Printable {

	private int id;
	private String name;
	private double b_salary;

	public Employee(int id, String name, double b_salary) {
		super();
		this.id = id;
		this.name = name;
		this.b_salary = b_salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public double getB_salary() {
		return b_salary;
	}

	public void setB_salary(double b_salary) {
		this.b_salary = b_salary;
	}

	@Override
	public void print() {

		System.out.println("Printing Employee:- " + this.id + "  " + this.name + "  " + this.b_salary);

	}

}
