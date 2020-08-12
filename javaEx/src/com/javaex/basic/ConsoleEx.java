package com.javaex.basic;

import java.util.Scanner;

//이 부분에서 필요한 클래스를 불러와야함


public class ConsoleEx {

	public static void main(String[] args) {

//		consoleOutput();
//		consoleInput();
		nameOut();
	}
	public static void nameOut() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt();
		System.out.printf("당신의 이름은 %s, 나이는 %d입니다.%n", name, age);
		System.out.println("당신의 이름은 " + name + ", 나이는 "+ age + "입니다.");
	}
	
	// 콘솔 입력(System.in)
	// Scanner 클래스를 이용하면 다양한 입력 소스로부터
	// 데이터를 입력 받을 수 있다
	public static void consoleInput() {
		// Tip 1. Ctrl + Shift + O -> 자동 import(이클립스기능)
		// Tip 2. Ctrl + Space -> Code Assist
		Scanner scanner = new Scanner(System.in); //new -> 객체를 만들어서 메모리에 적재해라(Java 표준 API임, 문법이 아님)
		 										//표준입력(System.in)으로 데이터 입력 받음
		// 이름은? -> 문자열 데이터 입력
		// 나이는? 이라고 묻고 정수데이터 입력
		// 출력 -> 이름, 나이는 O세
		System.out.print("이름은? ");
		String name = scanner.next();
		System.out.print("나이는?");
		int age = scanner.nextInt();
		
		System.out.println("이름은 "+name + ", 나이는 " +age);
		// 시스템 자원을 사용하는 기능을 이용한 후에는
		// 반드시 닫아주자 : 중요!
		scanner.close();
	}
	
	// 콘솔 출력
	public static void consoleOutput() {
		// 	System.out.print  -> 출력 후 개행 없음
		//	System.out.println	-> 출력 후 개행
		// 	System.out.printf	-> 형식화된 출력 : String 할때 정리(To-Do)
		System.out.print("Hello ");
		System.out.println("Java");
		
		// 이스케이프 문자(시퀀스)
		// \n : 개행
		// \t : 탭
		// \" : 쌍따옴표
		// \\ : \
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		
		String message = "Hello, \"Java\""; // 쌍따옴표
		System.out.println(message);
		
		// 파일을 다뤄야 하는데
		// C:\mydir/myfile.txt
		String dir ="C:\\mydir/myfile.txt";
		// \\ -> \ : 역슬래시
		System.out.println(dir);
	}
	

}
