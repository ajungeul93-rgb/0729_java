package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {

	// ĸ��ȭ (encapsulation)
	// �Ӽ�(������)�� �ش� �����͸� �����ϴ� �ൿ(�޼ҵ�)�� �ϳ��� ������ ���� ��
	// ��������(information hiding)

	// ���������� (�����) ��ȯ�� �޼ҵ�ĺ���(�Ű�����) {     }
	public static void main(String[] args) {
            
		// ���� ����   ���Կ�����  ��ü ���� == �޸𸮿� ����
		Cafe cafe = new Cafe();
		
		/*
		cafe.name = "KHī��";
		System.out.println(cafe.name);
		cafe.signatureMenu = "KHĿ��";
		cafe.signatureMenuPrice = -500;
		System.out.println(cafe.signatureMenu);
		System.out.println(cafe.signatureMenuPrice);
		*/
		
		// �ʵ尡 ������ �ʾƼ�(�ܺο��� ������ �Ұ����ؼ�) ���� �߻�!
		// ���������ڸ� public���� private���� �����߱� ������ ���� ������ �Ұ���
		// ���� ������ �Ұ����ϱ� ������ ���������� ������ �� �ִ� ����� ������־�� ��
        // Cafe��� Ŭ������ getter / setter��� �޼ҵ� �����
		//cafe.signatureMenuPrice = -500;
		
		// *** ��ü�� ������ ���� / �ܺ��� ����
		
		//cafe.dishWash();
		//cafe.cleaning();
		//cafe.windowCleaning();
		//cafe.open();
		// 5000
		// �޼ҵ� ȣ�� �ο����� ������ ���� �ѱ� �� ����
		//System.out.println("���� �޼ҵ忡�� �� cafe�� �ּ� : " + cafe);
		cafe.setSignatureMenuPrice(5000);
		cafe.setName("KHī��");
		cafe.setAdderss("����� �߱� ���빮�� 120 2��");
		//System.out.println(cafe.name);
		
		String cafeName = cafe.getName();
		System.out.println(cafeName);
		
		String cafeAddress = cafe.getAddress();
		System.out.println(cafeAddress);
		
		int price = cafe.getSignatureMenuPrice();
		System.out.println(price);
		
		String info = cafe.info();
		System.out.println(info);
		
	}
	
	

}
