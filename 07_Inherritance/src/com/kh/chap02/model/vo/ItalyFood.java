package com.kh.chap02.model.vo;

public class ItalyFood extends Food {
	
	// �ʵ��
	public int oil;
	
	// �����ں�
	public ItalyFood() {
		super();
	}
	
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		//this.foodName = foodName;
		//super.foodName = foodName;
		// ���������ڰ� private�̱� ������ ã������
		// �ذ���
		// 1. �θ�Ŭ������ ���������ڸ� �ٲ����
		// ĸ��ȭ ��Ģ x => ������ ����� �ƴ�
		
		// 2. �θ�Ŭ������ ���������� public�� setter�޼ҵ带 ȣ��
		/*
		super.setFoodName(foodName);
		super.setMaterial(material);
		super.setCookingTime(cookingTime);
		*/
		
		// 3. �θ�Ŭ������ ������ �ִ� �Ű����� �����ڸ� ȣ��
		super(foodName, material, cookingTime); // �θ� ��ü�� ���� �����ؾ���.
		this.oil = oil;
	}
	
	// �޼ҵ��
	public int setOil() {
		return oil;
	}
	public void getOil(int oil) {
		this.oil = oil;
	}

}
