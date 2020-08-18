package com.javaex.oop.casting;

public class Animal {
	//	필드
	protected String name;	//	물려줬을때 자식도 사용할 수 있게
	
	//	생성자
	public Animal(String name) {
		this.name = name;
	}
	
	//	메서드
	public void eat() {
		System.out.println(name + "이 먹고 있다.");
	}
	
	public void walk() {
		System.out.println(name + "이 걷고 있다.");
	}
}
