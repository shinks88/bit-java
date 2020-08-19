package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10,20);
		
		// 	Java의 최상위 클래스는 Object
		//	모든 클래스는 Object 클래스의 모든 기능을 물려 받는다.
		//	Object로부터 물려받은 내용들
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode());	// 객체 식별자 (주소값)
		System.out.println(p.toString()); 	// 그냥 출력과 동일
		System.out.println(p);
		
		//	부모 정보의 확인
		System.out.println(p.getClass().getSuperclass().getName());

	}



}
