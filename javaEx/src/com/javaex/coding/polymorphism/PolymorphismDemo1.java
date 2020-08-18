package com.javaex.coding.polymorphism;

//class A{}
//class B extends A{}
//public class PolymorphismDemo1 {
//    public static void main(String[] args) {
//        A obj = new B(); // 클래스 B로 객체를 만드는데 객체가 담겨있는 데이터 타입이 A이다. B로 인스턴스 obj를 만들었는데 A클래스 행세를 한다.
//    }
//}


/*
class A{
    public String x(){return "x";}
}
class B extends A{
    public String y(){return "y";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.x();
//      obj.y(); // obj 변수는 데이터타입이 클래스 A이기 때문에 에러
    }
}
*/

/*
class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.x());  // 클래스 B로 변수 obj에 담아 인스턴스 생성하는데 데이터타입이 A라면
        							  // A에 정의된 메소드만 가능하다. 단, A클래스 내에 정의된 메소드를 하위 클래스 B가 Overriding하고있다면
                                      // 클래스 B에 메소드를 호출한다.
    }
}
*/


class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();	// 클래스 B를 인스턴스화한 오브젝트 obj가 있따
        A obj2 = new B2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
        // 같은 A행세를 하는 인스턴스가 여러개 있더라도 각 인스턴스에 오버라이딩된 부모클래스의 메소드를 사용함으로써 다른 기능을 수행한다. 다형성!
    }
}
