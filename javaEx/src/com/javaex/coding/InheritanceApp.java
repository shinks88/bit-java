package com.javaex.coding;

class Cal{
	int v1, v2;
	Cal(int v1, int v2){
		System.out.println("Cal init!!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+v2;}
}

class Cal3 extends Cal{		//	자식클래스에 생성자가 없다면 부모클래스 생성자를 반드시 호출하게 되어있다. 
							//	생성자가 있는 클래스를 상속 받았다면 생성자를 반드시 만들어서 부모클래스를 호출해야한다.
	
	Cal3(int v1, int v2){
		super(v1, v2);
		System.out.println("Cal3 init!!");
	}
	public int minus() {return this.v1-v2;}
	
}

public class InheritanceApp{	
	public static void main(String[] args) {
		Cal c = new Cal(2,1);
		Cal c3 = new Cal3(2,1);
		System.out.println(c3.sum());	// 3
//		System.out.println(c3.minus());	// 1
	}
}

/*
class Cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	//	Overloading은 상속과 상관없음, 메소드일뿐, 자식이 가질 수 있음
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1,v2)+v3;
	}
}

class Cal3 extends Cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	// 	Overloading+Overriding
	public int sum(int v1, int v2, int v3) {
		return v1+v2+v3;
	}

	//	Overriding : 부모클래스가 갖고있는 메소드를 재정의, 부모가 가지고 있는 기능을 덮어씌웠다 올라탔다 
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return super.sum(v1,v2); 	// 	부모클래스의 sum 메소드 호출
	}
	
}


public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2,1));
		System.out.println(c.sum(2,1,1));
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2,1));
		System.out.println(c3.minus(2,1));
		System.out.println(c3.sum(2,1));
	}

}


class Cal2{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int minus(int v1, int v2) {
		return v1-v2;
	}
}
*/