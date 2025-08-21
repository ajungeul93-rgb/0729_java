package com.jg.assignment.energyDrink;

public class EnergyDrink {
	
	private String drinkFlavor;  // 음료맛
	private int size;            // 음료 용량(사이즈) ex)355ml, 500ml       
	private int number;          // 갯수
	private boolean iceCup;      // 아이스컵 여부
	private boolean plasticBag;   // 봉투 여부
	
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
		String info = "고른 맛은 : " + drinkFlavor + ", 음료 사이즈 : " + size + ", 갯수 : "
				     + number + ", 아이스컵 여부 : " + iceCup + ", 봉투 필요 : " + plasticBag;
		return info;
	}
	
	public void bag() {
		if(number > 4) {
			System.out.println("음료 갯수가" + number + " 개 입니다.봉투 필요하세요? ");
		} else {
			System.out.println("직접 들고가시나요? ");
		}
	}
	public void cup() {
		if(iceCup == true) {
			System.out.println("아이스컵에 담아드릴까요? ");
		} else {
			System.out.println("아이스컵은 필요하지 않으실까요? ");
		}
	}

}
