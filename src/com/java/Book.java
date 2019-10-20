package com.java;

import java.util.Date;

/**
 * 测试打印BOOk
 * @author Administrator
 *
 */
public class Book {


	private String name;
	private String book;
	private Date date;

	public Book() {
		
	}
	
	public Book(String name) {
		super();
		this.name = name;
	}
	
	
	public Book(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}
	
	
	public Book(String name, String book, Date date) {
		super();
		this.name = name;
		this.book = book;
		this.date = date;
	}
	
	/**
	 * 初始化方法
	 */
	private void init() {
		System.out.println("我已经创建了");
	}
	
	/**
	 * 销毁方法
	 */
	private void destroy() {
		System.out.println("我已经销毁");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getBook() {
		System.out.println(book);
		return book;
	}
	
	public void setBook(String book) {
		this.book = book;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void print(){
		System.out.println("打印");
	}
	

	@Override
	public String toString() {
		return "Book [name=" + name + ", book=" + book + ", date=" + date + "]";
	}
	
	
	
}
