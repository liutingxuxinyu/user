package com.java;

import java.util.Date;

/**
 * ���Դ�ӡBOOk
 * @author Administrator
 *
 */
public class Book2 {


	private String name;
	private String book;
	private Date date;
	private Book webbook;

	public Book2() {
		
	}
	
	public void printee(){
		webbook.print();
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

	
	
	public String getBook() {
		return book;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setBook(String book) {
		this.book = book;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	
	
	public Date getDate() {
		return date;
	}
	
	

	public Book getWebbook() {
		return webbook;
	}


	public void setWebbook(Book webbook) {
		this.webbook = webbook;
	}


	@Override
	public String toString() {
		return "Book2 [name=" + name + ", book=" + book + ", date=" + date + ", webbook=" + webbook + "]";
	}
	
	
	
}
