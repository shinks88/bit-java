package com.javaex.oop.goods.v4;

// v4
// ������ ����
public class Goods {

	private String name;
	private int price;
	
	// ������1 : �Ϻθ� �ʱ�ȭ
	public Goods(String name) {
		this.name = name;
		System.out.println("������ 1");
	}
	
	
	
	public Goods(String name, int price) {
		// �̹� �Ϻ��� ������ �ʱ�ȭ�ϴ� �����ڰ� ���� ��
		// this()�� ȣ���ϰ� ������ ������ �ʱ�ȭ
		// ���������� ������ ���, �ڵ��� �ߺ��� ���� �� ����
	
		this(name); // �����ڰ� ���� ȣ��ǰ� ������ ����Ʈ�� �� �� ����. ���� �߿�
		System.out.println("������ 2");
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


