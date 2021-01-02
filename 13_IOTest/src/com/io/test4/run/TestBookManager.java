package com.io.test4.run;

import com.io.test4.controller.BookManager;

public class TestBookManager {

	public static void main(String[] args) {
		
		BookManager bookmgr = new BookManager();
		
		bookmgr.fileSave();
		bookmgr.fileRead();

	}

}
