package com.jg.assignment.energyDrink;

public class EnergyDrink {
	
	private String drinkFlavor;  // �����
	private int size;            // ���� �뷮(������) ex)355ml, 500ml       
	private int number;          // ����
	private boolean iceCup;      // ���̽��� ����
	private boolean plasticBag;   // ���� ����
	
	public EnergyDrink() {}
	
	public EnergyDrink(String drinkFlavor, int size, int number,
			          boolean iceCup, boolean plasticBag) {
		this.drinkFlavor = drinkFlavor;
		this.size = size;
		this.number = number;
		this.iceCup = iceCup;
		this.plasticBag = plasticBag;
	}
	
	public String getDrinkFlavor() {
		return drinkFlavor;
	}
	public int getSize() {
		return size;
	}
	public int getNumber() {
		return number;
	}
	public boolean getIceCup() {
		return iceCup;
	}
	public boolean getPlasticBag() {
		return plasticBag;
	}
	
	public void setDrinkFlavor(String drinkFlavor) {
		this.drinkFlavor = drinkFlavor;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setIceCup(boolean iceCup) {
		this.iceCup = iceCup;
	}
	public void setPlasticBag(boolean plasticBag) {
		this.plasticBag = plasticBag;
	}
	
	public String info() {
		String info = "�� ���� : " + drinkFlavor + ", ���� ������ : " + size + ", ���� : "
				     + number + ", ���̽��� ���� : " + iceCup + ", ���� �ʿ� : " + plasticBag;
		return info;
	}
	
	public void bag() {
		if(number > 4) {
			System.out.println("���� ������" + number + " �� �Դϴ�.���� �ʿ��ϼ���? ");
		} else {
			System.out.println("���� ����ó���? ");
		}
	}
	public void cup() {
		if(iceCup == true) {
			System.out.println("���̽��ſ� ��Ƶ帱���? ");
		} else {
			System.out.println("���̽����� �ʿ����� �����Ǳ��? ");
		}
	}

}
