package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
//		arithmeticExceptionEx();
//		indexOutofBoundEx();
		nullPointerExceptionEx();
	}
	
	//	가장 흔히 발생하는 예외
	private static void nullPointerExceptionEx() {
		String s = "Hello"; //	참조 객체
		
		s = null;	// 	참조 해제
		
		try {
		//	예외 가능 블록
		System.out.println(s.toUpperCase());
		} catch (NullPointerException e){
			System.err.println("예외 메시지:" + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("End of code");
	}
	
	private static void indexOutofBoundEx() {
		int[] intArray = new int[] {3,6,9};
		
		System.out.println("배열의 길이:" + intArray.length);
		//	*가장 마지막 인덱스 == length - 1
		try {
		//	예외 가능 코드 블럭
		System.out.println(intArray[3]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("예외 메시지:" + e.getMessage());
		}
		//	finally 생략 가능
		System.out.println("End of code");
	}

	private static void arithmeticExceptionEx() {
		// 	스캐너로부터 정수 하나를 입력
		//	0으로 나눠 보자
		Scanner scanner = new Scanner(System.in);
		double result = 0;
		int num;
		
		System.out.print("정수를 입력하세요:");
		
		try {
		//	예외가 발생할 수 있는 영역 -> try
		num = scanner.nextInt(); 	// 문자 입력 시 에러
		result = 100 / num;
		} catch (ArithmeticException e){	//	산술 에러 캐치
			//	메시지가 담겨 있다.
			System.err.println("예외 메시지:" + e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("정수만 입력해주세요!");
			//	예외 상황 전체를 확인하고자 한다면
			e.printStackTrace(); //	스택정보를 모두 출력
		} catch (Exception e) {	// 일반적인 예외, 위쪽은 구체적인 예외
			//	catch문의 마지막에는 Exception 객체로 나아있을지 모를 예외를 처리
			e.printStackTrace();
		} finally {
			//	예외 유무 관계 없이 항상 마지막에 수행
			//	자원 정리 작업 등에 활용
			System.out.println("Finally");
		}
		System.out.println("결과:" + result);
		scanner.close();
	}
}
