package com.javaex.oop.staticmembers;

public class StaticExApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		//	첫번째 로딩 : static 블록 수행
		//	refCount는 static -> 인스턴스 생성 없이 접근 가능
		System.out.println("RefCount:" + StaticEx.refCount);

		StaticEx s2 = new StaticEx();
		//	앞에서 static 초기화 완료 : static 블록 수행 없이 -> 생성자
		System.out.println("RefCount:" + StaticEx.refCount);
		
		s1 = null;	// 	참조 해제
		System.out.println("s1 해제");
		System.out.println("RefCount:" + StaticEx.refCount);
		
		//	가비지 콜렉터 강제 수행
		//	주의 : 직접 가비지 콜렉터를 호출하지 않도록 하자
		// 	작동 원리 이해를 위한 코드이니 이 코드는 사용하지 않도록 하자
		System.gc();  // 즉시 수행되는 것은 아님, 우선순위를 높이는 코드
		// 잠시 대기
		try {
			Thread.sleep(3000); //	?ms 대기
			System.out.println("RefCount:" + StaticEx.refCount);
		} catch (Exception e) {
		}
	}

}
