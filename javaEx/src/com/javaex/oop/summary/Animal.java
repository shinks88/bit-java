package com.javaex.oop.summary;

//	실체화 되지 않은 클래스
//	추상 클래스는 종적 확장
public abstract class Animal {
	// 필드
	protected String name;
	protected int age;
	
	//	생성자
	public Animal(String name) {
		this.name = name;
	}
	
	// 	생성자2
	public Animal(String name, int age) {
		this(name);
		// 	추가 필드 초기화
		this.age = age;
	}
	
	//	추상 클래스 내에는 실체 클래스, 추상 클래스 모두 올 수 있따.
	// 추상 클래스는 자식 실체 클래스에서 반드시 오버라이드 해줘야 한다.
	
	public abstract void say();	//	반드시 오버라이드
	public void eat() {	// 실체 클래스 (추상 클래스 내에 실체 클래스 올수있다)
		System.out.printf("%s is eating...%n", name);
	}
	
}
