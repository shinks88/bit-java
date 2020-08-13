package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
			Point p1 = new Point(); 	// 인스턴스화
			p1.setX(10);
			p1.setY(20);
			
			Point p2 = new Point(20,30);
			
			Point p3 = new Point(50);
			
			p1.draw();
			p2.draw();
			p3.draw();
	}

}
