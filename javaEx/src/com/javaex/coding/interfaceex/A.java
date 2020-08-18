package com.javaex.coding.interfaceex;

interface I{
    public void z();
}
 
class A implements I{	// 인터페이스 I를 구현한다
    public void z(){}	// <-없으면 에러남
}