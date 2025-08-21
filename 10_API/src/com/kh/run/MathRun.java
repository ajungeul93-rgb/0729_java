package com.kh.run;

// import java.lang.*;

public class MathRun {

	public static void main(String[] args) {

		//Java API 
		
		//Math Ŭ����(����) 
		/*
		 * - ��� �ʵ�� �޼ҵ尡 ���� �� static
		 * - ��ü�� ������ �ʿ䰡 �����Ƿ� �⺻�������� ���������ڰ� private
		 * - java.lang
		 */
		// �ʵ�
		// ���� => MathŬ���� ���� ����ʵ�� ���ǵǾ�����
		System.out.println(Math.PI);
		
		// �޼ҵ�
		// 1. ���� => Math.pow()
		System.out.println("2�� 10���� : " + Math.pow(2, 10));
		
		// 2. ���밪 => Math.abs(int, double, long, float)
		System.out.println("���밪 : " + Math.abs(-33));
		
		double num = 8.141414;
		
		// 1. �ø� => Math.ceil(double) : double
		System.out.println("�ø� : " + Math.ceil(num));
		
		// 2. ���� => Math.floor(double) : double
		System.out.println("���� : " + Math.floor(num));
		
		// 3. �ݿø� => Math.round(double) : long
		System.out.println("�ݿø� : " + Math.round(num));
		
		
		
		
	}

}
