package com.jg.assignment.pizza.vo;

public class Pizza {

	private String type;
	private String size;
	private int number;
	private boolean cheeseCrust;
	private boolean delivery;
	
	public Pizza() {}
	
	public Pizza(String type, String size, int number
			   , boolean cheeseCrust, boolean delivery ) {
		this.type = type;
		this.size = size;
		this.number = number;
		this.cheeseCrust = cheeseCrust;
		this.delivery = delivery;
	}
	
	//getter
	public String getType() {
		return type;
	}
	public String getSize() {
		return size;
	}
	public int getNumber() {
		return number;
	}
	public boolean getCheeseCrust() {
		return cheeseCrust;
	}
	public boolean getDelivery() {
		return delivery;
	}
	
	//setter
	public void setType(String type) {
		this.type = type;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setCheeseCrust(boolean cheeseCrust) {
		this.cheeseCrust = cheeseCrust;
	}
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
	
	public String info() {
		String info = "피자 종류 : " + type + ", 피자 사이즈 : " + size + ", 피자 갯수 : " + number 
				    + ", 치즈 크러스트 여부 : " + (cheeseCrust? "예" : "아니오")
				    + ", 배달 여부 : " + (delivery? "예" : "아니오");
		return info;
	}
	
	
	public void addCheeseCrust() {
		if(!cheeseCrust) {
			cheeseCrust = true;
			System.out.println("치즈 크러스트를 추가했습니다. ");
		} else {
			System.out.println("이미 치즈 크러스트가 추가되었습니다. ");
		}
	}
	
	public void requestDelivery() {
		if (!delivery) {
			delivery = true;
			System.out.println("배달 요청을 완료했습니다.");
		} else {
			System.out.println("배달주문이 이미 처리되었습니다.");
		}
	}

}

