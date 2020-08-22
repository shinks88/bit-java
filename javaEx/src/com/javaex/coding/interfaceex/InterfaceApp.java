package com.javaex.coding.interfaceex;

interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable{
	void print();
}

class RealCal implements Calculable, Printable{

	@Override
	public void print() {
		System.out.println("This is RealCal!!");
		
	}

	@Override
	public int sum(int v1, int v2) {
		// TODO Auto-generated method stub
		return v1+v2;
	}
}

class DummyCal {	// 가짜 클래스
	public int sum(int v1, int v2) {
		return 3;
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		// 더하기 기능이 있는 클래스를 만들어주세요.
		RealCal c = new RealCal();

		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
		
		Calculable c2 = new RealCal(); // RealCal클래스가 c2 객체로 생성되고 데이터타입이 Calculable이면 printable의 메소드 및 변수 접근X
										// RealCal의 기능이 아주 많다면 경우에 따라 기능을 제한하여 객체 생성하여 활용
										// 어떤 클래스가 데이터타입을 무엇을 할지에 따라 다양한 얼굴을 갖게됨 -> 다형성
		
//		System.out.println(c2.sum(2, 1));
//		c2.print();
//		System.out.println(c2.PI);
//		
		
	}

}
