package com.javaex.coding;

class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar);
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //ok
//		System.out.println(Foo.instanceVar); // error
		Foo.classMethod();	// 클래스에서 클래스 메소드 호출 가능
//		Foo.instanceMethod(); // 클래스에서 인스턴스 메소드 호출 불가

		Foo f1 = new Foo();	// instance f1 생성 , 인스턴스 내에서 클래스 변수 변경하면 원본 클래스에서 변수도 바뀜, 인스턴스내에서 인스턴스 바꿔도 클래스의 인스턴스 변수 변하지 않음
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);	// I class var
		System.out.println(f1.instanceVar);	// I instance var
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); 	// changed by f1
		System.out.println(f2.classVar); 	// changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var
	}

}
//	클래스 변수는 클래스 메소드 및 인스턴스 메소드에서 접근 가능
//	클래스 메소드는 클래스 변수 접근 가능, 인스턴스 변수 접근 불가
// 	static이 붙어있으면 클래스 변수 또는 클래스 메소드 (static==클래스 소속이다)
//	static이 없으면 인스턴스 변수 또는 인스턴스 메소드 (static 없으면 인스턴스 소속이다)