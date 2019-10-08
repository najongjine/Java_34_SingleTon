package com.biz.single.exec;

import com.biz.single.service.SingleClassV1;

public class SingleEx01 {

	public static void main(String[] args) {
		/*
		 * 싱글톤 패턴으로 설정된 클래스는 new 생성자로 객체(인스턴스)를
		 * 만들지 않고
		 * 별도의 method
		 * 
		 * 프로젝트 전체에서 공유해야할 어떤 데이터들
		 * 예) 사용자 정보, 시스템 설정값.
		 * 메모리에 저장해 두고, 여러 클래스에 공유해서 사용하고자 할때
		 * 사용하는 방법.
		 * 
		 * 일반적인 static class와의 차이:
		 * multi thread 환경에서 안전하게 사용할수 있도록 설정 가능.
		 * multi thread 환경에서는 여러곳의 method에서 동시에 한곳의 기억장소 값을 동시에 변경하는 경우가 발생한다.
		 */
		SingleClassV1 sc1=SingleClassV1.getInstance();
		SingleClassV1 sc2=SingleClassV1.getInstance();
		SingleClassV1 sc3=SingleClassV1.getInstance();
		
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
	}

}
