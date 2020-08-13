package com.javaex.oop.goods.v4;

// v4
public class GoodApp {

	public static void main(String[] args) {

		// ������ Ȱ��
		Goods notebook = new Goods("LG Gram", 1500000);
		// �̹� �ʱ�ȭ�� �Ǿ .set�Լ��� �ʿ����
		
		//Goods notebook = new Goods();
		//notebook.setName("LG Gram");
		//notebook.setPrice(1500000);
	
		Goods smartphone = new Goods("iPhone SE", 600000);
	
		//Goods smartphone = new Goods();
		//smartphone.setName("iPhone SE");
		//smartphone.setPrice(600000);
				
		notebook.showInfo();
		smartphone.showInfo();
	}

}
