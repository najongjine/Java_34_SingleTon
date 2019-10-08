package com.biz.single.service;
/*
 * 이 싱글톤 클래스는 thread 환경에서 매우 불안전한 상태로 존재한다.
 */
public class SingleClassV1 {
	/*
	 * 프로젝트가 시작될때 자신(SingleClassV1)을 myObject라는 인스턴스로
	 * 생성해 두어라.
	 */
	private static SingleClassV1 myObject=new SingleClassV1();
	/*
	 * new SingleClassV1() 생성자 코드를 사용할수 없도록한다.
	 */
	private SingleClassV1() {
		//myObject
	}
	public static SingleClassV1 getInstance() {
		return myObject;
	}
}
