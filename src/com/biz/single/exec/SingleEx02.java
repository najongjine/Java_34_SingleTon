package com.biz.single.exec;

import com.biz.single.service.SafeSingleClassV1;

public class SingleEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeSingleClassV1 ssc=SafeSingleClassV1.getInstance();
		
		ssc.setName("홍길동");
		ssc.setNation("ROK");
		
		SafeSingleClassV1 ssc1=SafeSingleClassV1.getInstance();
		System.out.println("너는 누구냐?>> "+ssc1.getName());
		System.out.println("고향이 어디냐>> "+ssc1.getNation());
	}

}
