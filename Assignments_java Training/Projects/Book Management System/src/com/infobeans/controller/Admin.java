package com.infobeans.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.infobeans.service.BookStoreImpl;

public class Admin {

	public static void main(String[] args) {

		System.out.println(
				"\t\t\t*****************************************************************************************");
		for (int i = 0; i < 4; i++) {
			System.out.println("\t\t\t* \t\t\t\t\t\t\t\t\t\t\t*");
		}
		System.out.println("\t\t\t*\t\t <<<<<<==|WELCOME! TO BOOK MANAGEMENT SYSTEM|==>>>>>>\t\t\t*");
		System.out.println("\t\t\t*\t\t\t __________________________________________\t\t\t*");
		for (int i = 0; i < 4; i++) {
			System.out.println("\t\t\t* \t\t\t\t\t\t\t\t\t\t\t*");
		}
		System.out.println(
				"\t\t\t*****************************************************************************************\n");
		System.out.println("\t\t\t\t________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\tBOOK MANAGEMENT SYSTEM");
		System.out.println("\t\t\t\t________________________________________________________________________\n\n");

		Admin.start();
	}

	public static void start() {
		BookStoreImpl bookStoreImpl = new BookStoreImpl();
		System.out.println("\t\t\t\t\t\t\t----------");
		System.out.println("\t\t\t\t\t\t\t MAIN-MENU");
		System.out.println("\t\t\t\t\t\t\t----------\n");
		System.out.println("\t\t\t\t\t____________________________________________________");
		System.out.println(
				"\t\t\t\t\t\t\t 1.View All Books\n\t\t\t\t\t\t\t 2.Search a Book\n\t\t\t\t\t\t\t 3.Add a Book \n\t\t\t\t\t\t\t 4.Delete a Book \n\t\t\t\t\t\t\t 5.Update a Book \n\t\t\t\t\t\t\t 6.Exit");
		System.out.println("\t\t\t\t\t____________________________________________________\n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\t\t\t\t\tEnter Choice:");
		int choice = 0;
		try {
			choice = Integer.parseInt(reader.readLine());
		} catch (Exception e) {
			System.out.println("Please enter Valid key");
		}
		switch (choice) {
		case 1:
			bookStoreImpl.viewAllBooks();
			break;
		case 2:
			bookStoreImpl.searchBooks();
			break;
		case 3:
			bookStoreImpl.add();
			break;
		case 4:
			bookStoreImpl.delete();
			break;
		case 5:
			bookStoreImpl.update();
			break;
		case 6:
			System.out.println("\n\t\t\t\t======>THANK YOU FOR VISITING<======");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice!!!");
			start();
			break;
		}
	}
}
