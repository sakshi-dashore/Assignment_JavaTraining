package com.interfaceassignment;

public class User {

	public static void main(String[] args) {

		Printable printableList[] = { new Employee(101, "Nayan", 900000), new Account(001, "Savings", 230900),
				new Date(27,03,2021) };

		Utility.printAll(printableList);
	}

}
