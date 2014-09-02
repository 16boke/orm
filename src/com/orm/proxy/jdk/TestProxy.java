package com.orm.proxy.jdk;

public class TestProxy {
	public static void main(String[] args) {
		BookFacade bookProxy = (BookFacade) BookFacadeProxy.bind(new BookFacadeImpl());
		//bookProxy.addBook();
		
		LoggerProxy proxy = new LoggerProxy();
		BookFacade bookProxy1 = (BookFacade) proxy.bind(new BookFacadeImpl());
		bookProxy1.addBook();
		bookProxy1.deleteBook(1);
	}
}
