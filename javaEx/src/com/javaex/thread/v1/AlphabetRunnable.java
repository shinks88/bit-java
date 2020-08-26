package com.javaex.thread.v1;

//	Thread 생성 두번째 방법 : Runnable 인터페이스 구현
public class AlphabetRunnable implements Runnable { //	상속이 아니기 때문에 getName기능 등을 쓸 수없음

	@Override
	public void run() {
		// Thread 내부의 start 메서드에서 호출될 쓰레드의 로직
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread:" + ch);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
