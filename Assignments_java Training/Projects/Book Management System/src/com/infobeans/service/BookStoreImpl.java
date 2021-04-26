package com.infobeans.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

import com.infobeans.controller.Admin;
import com.infobeans.pojo.Book;

public class BookStoreImpl implements BookStore {

	static TreeSet<Book> books = new TreeSet<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void viewAllBooks() {

		System.out.println("\t\t\t <<<==| BOOKS DETAILS |==>>>");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("%7s %17s %24s %17s  %18s ", "BOOK ID", "BOOK TITLE", "AUTHOR NAME", "PRICE", "PUBLISH DATE");
		System.out.println();
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		String pattern = "dd-MM-yyyy";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		for (Book book : books) {
			// String pattern = "yyyy-MM-dd";

			String date = simpleDateFormat.format(book.getPublishDate());

			System.out.format("%7s %20s %22s %18s     %18S ", book.getBookId(), book.getTitle(), book.getAuthor(),
					book.getPrice(), date);
			System.out.println();
		}

		System.out.println(
				"-----------------------------------------------------------------------------------------------------");

		Admin.start();
	}

	@Override
	public void searchBooks() {

		boolean result = true;
		while (result) {
			System.out.println("\t\t\t\t\t\t\t--------------------");
			System.out.println("\t\t\t\t\t\t\t SEARCH-BOOK-MENU");
			System.out.println("\t\t\t\t\t\t\t--------------------\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("\t\t\t\t\t____________________________________________________");
			System.out.println(
					"\n\t\t\t\t\t\t\t1.SEARCH BOOK BY ID\n\t\t\t\t\t\t\t2.SEARCH BOOK BY NAME\n\t\t\t\t\t\t\t3.SEARCH BOOK BY AUTHOR\n\t\t\t\t\t\t\t4.SEARCH BOOK BY PRICE\n\t\t\t\t\t\t\t5.Exit");
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
				System.out.println("Enter the ID");
				int id = 0;
				try {
					id = Integer.parseInt(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
				int count = 1;
				List<Book> booksIdList = new ArrayList<>();
				for (Book book : books) {

					if (book.getBookId() == id) {
						booksIdList.add(book);
						count++;
					}

					if (count == 1) {
						System.out.println("No search found");

					} else {
						printSearch(booksIdList);

					}
				}

				break;

			case 2:
				System.out.println("Enter the Title");
				String title = "";
				try {
					title = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				List<Book> booksList = new ArrayList<>();
				for (Book book : books) {

					if (book.getTitle().contains(title)) {
						booksList.add(book);
					}
				}

				if (booksList.isEmpty()) {
					System.out.println("No search Found");
				} else {
					printSearch(booksList);

				}

				break;
			case 3:
				System.out.println("Enter the Author Name");
				String authorName = "";
				try {
					authorName = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				List<Book> booksAuthorList = new ArrayList<>();
				for (Book book : books) {

					if (book.getAuthor().contains(authorName)) {
						booksAuthorList.add(book);
					}
				}

				if (booksAuthorList.isEmpty()) {
					System.out.println("No search Found");
				} else {
					printSearch(booksAuthorList);

				}

				break;

			case 4:
				System.out.println("Enter the Price");
				int price = 0;
				try {
					price = Integer.parseInt(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}

				List<Book> booksPriceList = new ArrayList<>();
				for (Book book : books) {

					if (book.getPrice() == price) {
						booksPriceList.add(book);
					}
				}

				if (booksPriceList.isEmpty()) {
					System.out.println("No search Found");
				} else {

					printSearch(booksPriceList);
					// System.out.println();
				}

				break;
			case 5:
				result = false;
				Admin.start();
				break;
			default:
				System.out.println("Invalid Pressed keys");
				break;
			}
		}

	}

	private void printSearch(List<Book> booksPriceList) {
		System.out.println("\t\t\t <<<==| BOOKS DETAILS |==>>>");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.printf("%7s %17s %24s %17s  %18s ", "BOOK ID", "BOOK TITLE", "AUTHOR NAME", "PRICE", "PUBLISH DATE");
		System.out.println();
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");

		String pattern = "dd-MM-yyyy";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		for (Book book : booksPriceList) {
			String date = simpleDateFormat.format(book.getPublishDate());
			System.out.format("%7s %20s %22s %18s     %18S ", book.getBookId(), book.getTitle(), book.getAuthor(),
					book.getPrice(), date);
			System.out.println();
		}

		System.out.println(
				"-----------------------------------------------------------------------------------------------------");

	}

	@Override
	public void add() {
		System.out.println("Enter the book ID");
		int bookId = 0;
		try {
			bookId = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Enter the Book Title");
		String title = "";
		try {
			title = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter the Book Author");
		String author = "";
		try {
			author = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter the Book Price");
		Double price = 0d;
		try {
			price = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Enter the Publish Date(dd/mm/yyyy )");
		SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy");
		df.setLenient(false);
		Date publishDate = null;
		try {
			String dateString = br.readLine();

			publishDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
			// Parse the date
			// publishDate = df.parse(dateString);

		} catch (Exception e) {

		}

		books.add(new Book(bookId, title, author, price, publishDate));
		System.out.println("Added Successfully!!!");
		Admin.start();
		;
	}

	@Override
	public void delete() {

		System.out.println("Enter the id which you want to delete: ");
		int id = 0;
		try {
			id = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Book book : books) {

			if (book.getBookId() == id) {
				books.remove(book);
				System.out.println("Deleted Successfully!!");
			} else {
				System.out.println("Invalid ID");
			}
		}
		Admin.start();

	}

	@Override
	public void update() {
		System.out.println("Enter the Book Id which you want to update??");
		int bookId = 0;
		try {
			bookId = Integer.parseInt(br.readLine());
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		System.out.println(
				"\t\t\t\t\t\tEnter the choice which you want to Update?\n\t\t\t\t\t\t\t 1.Price\n\t\t\t\t\t\t\t 2.Exit");
		System.out.println("\t\t\t\t\t Enter Choice:");
		int choice = 0;
		try {
			choice = Integer.parseInt(br.readLine());
		} catch (Exception e2) {
			System.out.println("Invalid Choice Pless Valid Key");
		}

		switch (choice) {
		case 1:
			int ch = 1;
			for (Book book : books) {
				if (book.getBookId() == bookId) {
					System.out.println("Enter the updated price");
					Double price = 0d;
					try {
						price = Double.parseDouble(br.readLine());
						book.setPrice(price);
						ch++;
						System.out.println("Price Updated Successfully!!!");

					} catch (NumberFormatException | IOException e) {

						e.printStackTrace();
					}
					if (ch == 1) {
						System.out.println("Invalid ID");
					}
				}
			}
			break;
		case 2:
			Admin.start();
			break;

		default:
			Admin.start();
			break;
		}

		Admin.start();
	}

}
