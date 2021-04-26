package com.infobeans.pojo;

import java.util.Date;

//pojo bean
public class Book implements Comparable<Book> {

	private int bookId;
	private String title;
	private String author;
	private Double price;
	private Date publishDate;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String title, String author, Double price, Date publishDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishDate = publishDate;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", publishDate=" + publishDate + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.bookId - o.bookId;
	}

}
