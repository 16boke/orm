package com.orm.proxy.jdk;

public class BookFacadeImpl implements BookFacade {

	public void addBook() {
		System.out.println("����ͼ�鷽��������");
	}

	public String deleteBook(Integer id) {
		System.out.println("ɾ��ͼ�鷽��������");
		return "delete book";
	}

}
