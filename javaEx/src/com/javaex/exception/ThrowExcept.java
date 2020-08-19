package com.javaex.exception;

import java.io.IOException;

//	메서드에서 강제 예외 발생
public class ThrowExcept {
	public void executeCheckedException() throws IOException {
		System.err.println("체크드 예외 발생!");
		//	강제 예외 발생
		throw new IOException("강제 IO 예외");
	}
	
	public void executeUncheckedException() throws RuntimeException{
		System.out.println("언체크드 예외 발생!");
		//	언체크드 예외는 대부분 RuntimeException의 자식 클래스
		throw new RuntimeException("강제 RuntimeException");
	}
	
	public double divide(int num1, int num2) throws CustomArithmeticException{
		double result;
		
		try {
		result = num1 / num2;
		} catch(ArithmeticException e) {
			// 일반적인 예외가 발생했을때 
			// 보다 구체적인 사용자 정의 예외로 전환하여 throw하는 것이
			// 가독성, 코드 디버그 작업 유리
			throw new CustomArithmeticException("사용자 정의 예외", 
					num1, num2);
		}
		return result;
	}
}




