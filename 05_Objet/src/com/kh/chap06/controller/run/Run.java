package com.kh.chap06.controller.run;

import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
		//Human human1 = new Human();
		//human1.hi();
		//Human human2 = new Human();
		//human2.hi();
		/*
		MethodController mc = new MethodController();
		int a = mc.add(1, 2);
		int b = mc.add(2, 3);
		int c = mc.add(5, 6);
		int d = mc.add(a, b);
		int e = mc.add(c, d);
		System.out.println("���� : " + e);
        */
		MethodController mc = new MethodController();
		//int[] dd = new int[3];
		//mc.method1();
		//String returnValue = mc.method2();
		//System.out.println(returnValue);
		//System.out.println(mc.method2());
		//System.out.println("method3 ȣ�� ��� : " + mc.method3());
		//mc.method4(3);
		
		//int result = mc.method5(3);
		//System.out.println(result);
		//mc.a();
		
		//MethodController mc = mc;
		// �ڡڡڡڡھ��� ����ڡڡڡڡڡڡ� (���� �ּҰ��� ����Ų��.)
		// mc.test(mc);
		
		Math.random();
		int[] arr = {2, 3};
		//System.out.println(Arrays.toString(arr));
		
		//MethodController.staticMethod();
		
		// mc.haha();
		/*
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("���?");
		System.out.println(mc);
		System.out.println();
		*/
		
		OverloadingController oc = new OverloadingController();
		
		// ���� ���ε�(Static Binding)
		// �������� ���� ���� � �޼ҵ尡 ȣ����� ����
		// �����Ϸ��� �˾Ƽ� �ڵ带 �м��Ͽ� �޼ҵ� ȣ�� ����
		oc.test();
		oc.test(1/*���ڰ�*/);
		oc.test("eeeeeeeeeeeeeeee");
		oc.test(1,2);
	
	}

	

}
