package com.javaex.thread.v1;

//	Process : 실행 중인 하나의 프로그램
//	Thread : 하나의 프로세스 내에서 실행되는 하나의 작업 흐름
//	하나의 Process가 실행되면 MainThread가 하나 생성
public class MainThread {

	public static void main(String[] args) {
		//	메인 스레드와 별도로 다른 작업흐름이 필요
		//	Thread 생성하여 실행
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		//	쓰레드의 시작 : Runnable -> Running
		thread1.start();// thread 내부의 run 메서드는 직접 호출하지 않음
		
		//	Runnable을 이용한 작업 Thread
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.start();
		
		//	메인 스레드가 종료되면 working 스레드를 통제할 수 없게 되므로
		//	작업 스레드의 흐름을 메인 스레드의 흐름에 합류 필요
		
		try {
			thread1.join(); //메인 메서드 흐름에 합류
			thread2.join(); //메인 메서드 흐름에 합류
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 메인 스레드의 로직
		System.out.println("메인스레드 종료");
		
				
		//	메인 스레드의 로직
		//	A부터 Z까지 0.3초 간격으로 출력
		/*
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread:" + ch);
			//	0.3초 대기
//			Thread.sleep(300);	//	예외 많이 발생함
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		*/
	}

}
