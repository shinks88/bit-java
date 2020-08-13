package com.javaex.oop.goods.v3;

// v3
// ������ ����
public class Goods {

	private String name;
	private int price;
	
	// �����ڴ� �ݵ�� 1�� �̻� �־�� �Ѵ�
	// �ڵ�� ������ �ڵ尡 �ϳ��� ������ �⺻ �����ڸ� ������ �߰��Ѵ�
	
	
	public Goods(String name, int price) {
		// ����Ÿ���� ����
		// Ŭ���� �̸��� ������ �̸�
		this.name = name;
		this.price = price;
		
	}
	
	
	
	// Getter / Setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	public void showInfo() {
		System.out.printf("%s, ���� : %d%n", name, price);
	}
	
	
	
	
}


