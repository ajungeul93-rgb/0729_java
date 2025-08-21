package com.kh.chap02.model.vo;

public class JapanFood extends Food {
	
	// �ʵ��
	// �θ�κ��� ��ӹ��� �κ��� ������� �ʴ´�.
	public int fresh;
	
	// �����ں�
	public JapanFood() {}
	
	
	// �Ű����� ������
	// foodName, material, cookingTime : �θ�Ŭ������ �ʵ忡 �����ؾ���
	// fresh : �� �ʵ忡 ����
	public JapanFood(String foodName, String material, int cookingTime, int fresh) {
		
		super(foodName, material, cookingTime);
		this.fresh = fresh;
	}
	
	// �޼ҵ��
	public int setFresh() {
		return fresh;
	}
	
	public void getFresh(int fresh) {
		this.fresh = fresh;
	}
	
	// �޼ҵ带 ��ӹ޾Ҵµ� ������ �ȵ�� ������Ű�� �;�
	// �ٽ� �� �� ���� ==> ������
	public String information() {
		/*
		return "���ĸ� : " + super.getFoodName() 
		      +", ����� : " + super.getMaterial()
		      +", �����ð� : " + super.getCookingTime()
		      +", �ż��� : " + fresh;
		*/
		return super.information() + ", �ż��� : " + fresh;
	}

}
