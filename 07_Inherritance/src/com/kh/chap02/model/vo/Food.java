package com.kh.chap02.model.vo;
/*
 * ���(Inheritance)
 * 
 * ������ Ŭ������ �̿��ؼ� ���ο� Ŭ������ ����� ��� == ���
 * 
 * �� Ŭ�������� �ߺ��� �ʵ�,  �޼ҵ���� �ϳ��� Ŭ������
 * �����ص� �� �ش� Ŭ������ ����� ������ ����ϴ� ����
 */
public class Food /*extends Objet(������)*/ {
	// ���������� ������ �ִ� �ʵ�
	// �ʵ�� : foodName, material, cookingTime
	protected String foodName;
	private String material;
	private int cookingTime;
	
	// �����ں�
	public Food() {
		System.out.println("�ȳ��ϼ���. �θ��Դϴ�.");
	}
	public Food(String foodName, String material, int cookingTime) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
	}
	
	// �޼ҵ��
	//getter
	public String getFoodName() {
		return foodName;
	}
	public String getMaterial() {
		return material;
	}
	public int getCookingTime() {
		return cookingTime;
	}
	
	//setter
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	//info
	public String information() {
		return "���ĸ� : " + foodName + ", ����� : " + material
			 + ", �����ð� : " + cookingTime;	
	}

	
	
	
}
