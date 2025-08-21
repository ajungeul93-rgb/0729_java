package com.kh.chap04.run;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {

	public static void main(String[] args) {
		
        System.out.println(StaticController.str);
        
		 //     (1)                 (2)
		FieldController fc = new FieldController();
		// 1. FieldController �ڷ������� fc��� �̸��� ���������� ����
		// 2. ��ü ���� (newŰ���带 ������ ��) global ������� �Ҵ�
		// 3. �ּҰ��� ����
		
		System.out.println(fc.global);
		
		fc.checkVariavle(50);
		// checkVariable ȣ�� == parameter(�Ű�����) �Ҵ� �� �ʱ�ȭ
		
		// checkVariable ȣ�� ���� ��
		// parameter, local �������� �Ҹ�
		
		System.out.println(fc.global);
		fc = null; //global ��� �Ұ���
		
		// ��ǥ : str ����ϱ�
		/*
		StaticController sc = new StaticController();
		System.out.print(sc.str);
		*/
		System.out.println(StaticController.str);
		//System.out.println(StaticController.JAVA_VERSION);
		
		// System.out.println(Arrays.toString(new int[2]));
		// System.out.println(Math.random()); // 0.0 ~ 0.999999~
		System.out.println(Math.PI);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.nextLine();
		
		/*
		 * AccessModifier(���������� / ����������)
		 * 
		 * (+)public => ��𼭵�(���� ��Ű��, �ٸ� ��Ű��, Ŭ���� ��/�ܺ� ���� ����) ���� ����
		 * 
		 * (#)protected => ���� ��Ű����� ������ ���� ����!
		 *           => �ٸ� ��Ű����� ��ӱ����� Ŭ���������� ���� ����
		 *           => ����̶�� ������ 05_Object / 06_ObjectArray ������ 7������ ���
		 *           
		 * (~)default(package friendly) => ������ ���� ��Ű�������� ���� ����          
		 * 
		 * 
		 * (-)private => ���� Ŭ���� ���ο����� ���� ����
		 * 
		 */
	}

}
