package com.javaex.coding;

class Accounting{
    public double valueOfSupply;
    public static double vatRate = 0.1; // 모든 인스턴스에 동일, 메모리 사용 절약
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
       return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
     public static void main(String[] args) {
    	 Accounting a1 = new Accounting(10000.0);
    //	 a1.valueOfSupply = 10000.0;
    	 
    	 Accounting a2 = new Accounting(20000.0);
    //	 a2.valueOfSupply = 20000.0;
    	 
    	 System.out.println("Value of supply : " + a1.valueOfSupply);
    	 System.out.println("Value of supply : " + a2.valueOfSupply);
    	 
    	 System.out.println("VAT : " + a1.getVAT());
    	 System.out.println("VAT : " + a2.getVAT());
    	 
    	 System.out.println("Total : " + a1.getTotal());
    	 System.out.println("Total : " + a2.getTotal());
    	 
//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//    	Accounting.valueOfSupply = 20000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        
//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("VAT : " + Accounting.getVAT());
//        Accounting.valueOfSupply = 20000.0;
//        System.out.println("VAT : " + Accounting.getVAT());
//        
//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("Total : " + Accounting.getTotal());
//        Accounting.valueOfSupply = 20000.0;
//        System.out.println("Total : " + Accounting.getTotal());
        
        //	클래스의 상황이 계속해서 변한다면? 인스턴스화
    }
 
}