package com.interfaceassignment;

public class Date implements Printable {

	private int dd;
	private int mm;
	private int yyyy;

	public Date(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYyyy() {
		return yyyy;
	}

	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}

	@Override
	public void print() {

		System.out.println("Printing Date:- " + this.dd + "-" + this.mm + "-" + this.yyyy);
	}

}
