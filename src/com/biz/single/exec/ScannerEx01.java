package com.biz.single.exec;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		Scanner scan3=new Scanner(System.in);
		
		System.out.print("아무문자나 입력>> ");
		String str1=scan1.nextLine();
		scan1.close();
		
		System.out.print("아무문자나 입력>> ");
		String str2=scan1.nextLine();
		
		System.out.print("아무문자나 입력>> ");
		String str3=scan1.nextLine();
		
		System.out.printf("str1:%s\tstr2:%s\tstr3:%s\n",str1,str2,str3);
	}

}
