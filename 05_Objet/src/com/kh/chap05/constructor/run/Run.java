package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
   
		Member member = new Member();
		
		Member member2 = new Member("��������");
		
		Member member3 = new Member("user01", "1234");
		System.out.println(member3.info());
		
		Member member4 = new Member("user02", "pass02", "ȫ�浿");
	    System.out.println(member4.info());
	}

}
