package com.sd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	String title;
	String author;
	String price;
	String genre;
	
	
	public Book(int id, String title, String author, String price, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.genre = genre;
	}
	public Book( String title, String author, String price, String genre) {
		super();
	
		this.title = title;
		this.author = author;
		this.price = price;
		this.genre = genre;
	}
	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", genre=" + genre
				+ "]";
	}
	
	
	
	

}
