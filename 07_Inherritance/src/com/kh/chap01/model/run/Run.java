package com.kh.chap01.model.run;

import com.kh.chap01.model.vo.ItalyFood;
import com.kh.chap01.model.vo.JapanFood;
import com.kh.chap01.model.vo.KoreaFood;

public class Run {

	public static void main(String[] args) {

		// foodName, material, cookingTime, spicy
		KoreaFood kf = new KoreaFood("�����", "��", 5, 2);
		// foodName, material, cookingTime, oil
		ItalyFood yf = new ItalyFood("�⸧�Ľ�Ÿ", "�⸧", 15, 5);
		// foodName, material, cookingTime, fresh
		JapanFood jf = new JapanFood("����", "��", 10, 10);
		
		System.out.println(kf.information());
		System.out.println(yf.information());
		System.out.println(jf.information());
		
		/*
		 * �� Ŭ�������� �ߺ��� �ڵ���� �ϳ��ϳ� ����ϴٺ���
		 * �ڵ��� �߰� �Ǵ� ������ ���� �������� �� ���� ã�Ƽ� ���ľ��ϴ� ���ŷο��� ����
		 * 
		 * ����̶�� ������ �����ؼ�
		 * �� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ����
		 * �� �ϳ��� Ŭ����(�θ�Ŭ����)�� ����� ����, ���Ǹ� �صΰ�
		 * �ش� �θ�Ŭ������ ������ �ִ� ��Ҹ� ��ӹ޾Ƽ� ����ϴ� ���·� ����
		 */
		
		
	}

}
