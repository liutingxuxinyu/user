package com.java;

import java.util.Date;

/**
 * ���Դ�ӡBOOk
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
	 * ��ʼ������
	 */
	private void init() {
		System.out.println("���Ѿ�������");
	}
	
	/**
	 * ���ٷ���
	 */
	private void destroy() {
		System.out.println("���Ѿ�����");
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
		System.out.println("��ӡ");
	}
	

	@Override
	public String toString() {
		return "Book [name=" + name + ", book=" + book + ", date=" + date + "]";
	}
	
	
	
}
