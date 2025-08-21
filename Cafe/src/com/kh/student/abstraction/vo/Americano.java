package com.kh.student.abstraction.vo;

public class Americano {
	
	private String type;    // 아이스 or 핫
	private String size;     // S, M, L
	private int temperature; // 온도
	private boolean hasShot; // 샷 추가 여부
	private int strength;    // 농도 (1 ~ 10)
	
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
 		String info = "아이스 or 핫 : " + type + ", 사이즈(S/M/L) : " + size + ", 커피 온도 : " + temperature
 				    + ", 샷추가 : " + (hasShot? "추가함" : "추가 안함") 
 				    + ", 커피 농도 : " + strength; 
 		return info;
	}
	
	public void stir() {
		System.out.println("커피를 젓고 있습니다.");
		strength++;
	}
	
	public void coolDown() {
		if(temperature > 5) {
			temperature -= 5;
			System.out.println("커피가 식고 있습니다. 현재 온도: " + temperature + "도");
		} else {
			System.out.println("이미 충분히 식었어요.");
		}
	}

}
