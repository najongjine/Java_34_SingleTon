package com.biz.single.service;

public class SafeSingleClassV1 {
	private static SafeSingleClassV1 myObject;
	private String name;
	private String nation;
	
	private SafeSingleClassV1() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * getInstance() method에 sync 키워드를 추가함으로써
	 * 이 싱글톤은 thread safe 상태가 된다.
	 * 게으른 초기화 코드다. 속도가 느리다.
	 */
	public static synchronized SafeSingleClassV1 getInstance() {
		if(myObject==null) myObject=new SafeSingleClassV1();
		return myObject;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setNation(String nation) {
		this.nation=nation;
	}
	public String getNation() {
		return nation;
	}
}
