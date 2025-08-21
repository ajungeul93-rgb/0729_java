package com.kh.student.abstraction.vo;

public class Americano {
	
	private String type;    // ���̽� or ��
	private String size;     // S, M, L
	private int temperature; // �µ�
	private boolean hasShot; // �� �߰� ����
	private int strength;    // �� (1 ~ 10)
	
	public Americano() {}
	
	public Americano(String type, String size, int temperature
			        , boolean hasShot, int strength) {
		this.type = type;
		this.size = size;
		this.temperature = temperature;
		this.hasShot = hasShot;
		this.strength = strength;
	}
	
	public String getType() {
		return type;
	}
	public String getSize() {
		return size;
	}
	public int getTemperature() {
		return temperature;
	}
	public boolean getHasShot() {
		return hasShot;
	}
	public int getStrength() {
		return strength;
	}
	
	
	public void setType(String type) {
		this.type = type;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public void setHasShot(boolean hasShot) {
		this.hasShot = hasShot;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	
	public String info() {
 		String info = "���̽� or �� : " + type + ", ������(S/M/L) : " + size + ", Ŀ�� �µ� : " + temperature
 				    + ", ���߰� : " + (hasShot? "�߰���" : "�߰� ����") 
 				    + ", Ŀ�� �� : " + strength; 
 		return info;
	}
	
	public void stir() {
		System.out.println("Ŀ�Ǹ� ���� �ֽ��ϴ�.");
		strength++;
	}
	
	public void coolDown() {
		if(temperature > 5) {
			temperature -= 5;
			System.out.println("Ŀ�ǰ� �İ� �ֽ��ϴ�. ���� �µ�: " + temperature + "��");
		} else {
			System.out.println("�̹� ����� �ľ����.");
		}
	}

}
