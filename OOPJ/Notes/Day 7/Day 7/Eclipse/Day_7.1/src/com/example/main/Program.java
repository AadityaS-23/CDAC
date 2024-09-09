package com.example.main;

import com.example.util.EmployeeUtil;

public class Program {
	public static void main(String[] args) {
		int choice;
		EmployeeUtil util = new EmployeeUtil();
		while( ( choice = EmployeeUtil.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				util.acceptRecord();
				break;
			case 2:
				util.printRecord();
				break;
			}
		}
		EmployeeUtil.releaseResource();
	}
}
