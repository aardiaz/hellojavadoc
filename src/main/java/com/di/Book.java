package com.di;

public class Book {
	
	private int id;
	private String name;
	private int price;
	private String author;
	
	public Book(int id, String name, int price, String author) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
}
