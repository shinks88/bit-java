package com.javaex.api.objectclass.v2;


//  v2. equals의 재정의
//	두 포인트 객체의 x값과 y값이 모두 같다면
//		값이 같다고 하자
public class Point {

	
	/*
	private int x, y;
	*/
	
	//	상속받은 클래스에서도 접근할 수 있도록 제한을 낮춤
	protected int x;
	protected int y;
	
	// 사용자 정의 생서자가 있을 경우
	// JVM은 기본 생성자를 만들지 않는다
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("ColorPoint 생성자");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다. %n",x, y);
	}
	
	// 메서드 오버로딩
	// 같은 리턴타입과 같은 이름을 가졌지만
	// 매개변수의 종류, 갯수, 순서만 다른 메서드
	public void draw(boolean show) {
		// show : true -> 그렸습니다.
		// show : false -> 지웠습니다.
		String message = show ? "그렸습니다." : "지웠습니다.";
		// TODO : -> if문 버전으로 해보기
		
		System.out.printf("점[x=%d, y=%d]을 %s %n",x, y, message);
	}

	//	toString : print 혹은 문자열과 연결될 때 호출되어서
	//			내용을 문자열로 변환
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// equals : 내부 값이 같은지 점검 로직 작성
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) { //	클래스 체크
			// 다운캐스트 가능
			Point other = (Point)obj;
			return this.x == other.x && this.y == other.y;
		}
		return super.equals(obj);
	}
	
	

	
	
}