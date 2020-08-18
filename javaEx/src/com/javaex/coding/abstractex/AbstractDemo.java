package com.javaex.coding.abstractex;

abstract class A{	// 추상클래스이다. 실체가 없고 형식만 갖고있다. 구현은 자식에게 강제함. 멤버중하나라도 abstract이면 클래스도 abstract
    public abstract int b();	// {}가 없다. 본체가 없다. 추상메소드는 꼭 오버라이딩해서 사용해야함.
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")} // 추상 메소드는 {}를 갖고있으면 안됨
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");
    }
}

class B extends A{
	public int b() { // {} 필수! -> 상속을 강제하고 있다
		return 1;
	}
}


public class AbstractDemo {
    public static void main(String[] args) {
      //  A obj = new A();
    	B obj = new B();
    	System.out.println(obj.b());
    	obj.d();
    }
}