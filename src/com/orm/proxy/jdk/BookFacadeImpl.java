package com.orm.proxy.jdk;

public class BookFacadeImpl implements BookFacade {

	public void addBook() {
		System.out.println("增加图书方法。。。");
	}

	public String deleteBook(Integer id) {
		System.out.println("删除图书方法。。。");
		return "delete book";
	}

}
