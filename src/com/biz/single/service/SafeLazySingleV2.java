package com.biz.single.service;
/*
 * thread에 안전하고 초기화 과정을 좀더 빠르게
 * 개선한 싱글톤 코드
 */
public class SafeLazySingleV2 {
	/*
	 * volatile:= 휘발성있는, 잘 관리하지 않으면 날아간다.
	 * JVM영역에 저장하지 않고, 하드웨어 memory 영역에 저장해서 운영체재가 관리하도록 하라.
	 */
	private volatile static SafeLazySingleV2 instance;

	private SafeLazySingleV2() {
		// TODO Auto-generated constructor stub
	}
	public static SafeLazySingleV2 getInstance() {
		if(instance==null) {
			synchronized (SafeLazySingleV2.class) {
				instance=new SafeLazySingleV2();	
			}
		}
		return instance;
	}
	
}
