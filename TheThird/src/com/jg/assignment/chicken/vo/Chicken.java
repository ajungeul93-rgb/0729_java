package com.jg.assignment.chicken.vo;

public class Chicken {

	private String flavor;
	private int pieces;
	private boolean sideMenu;
	private boolean delivery;
	private String address;
	
	
	//기본 생성자
	public Chicken() {}
	
	// 전체 필드 초기화 생성자
	public Chicken(String flavor, int pieces, boolean sideMenu
			     , boolean delivery, String address) {
		this.flavor = flavor;
		this.pieces = pieces;
		this.sideMenu = sideMenu;
		this.delivery = delivery;
		this.address = address;
	}
	
	//getter
	
	public String getFlavor() {
		return flavor;
	}
	public int getPieces() {
		return pieces;
	}
	public boolean getSideMenu() {
		return sideMenu;
	}
	public boolean getDelivery() {
		return delivery;
	}
	public String getAddress() {
		return address;
	}
	
	
	//setter
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public void setSideMenu(boolean sideMenu) {
		this.sideMenu = sideMenu;
	}
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String info() {
		String info = "치킨 맛 : " + flavor + ", 조각 수 : " + pieces 
				    + ", 사이드 메뉴 : " + (sideMenu? "예" : "아니오") 
				    + ", 배달 여부 : " + (delivery? "예" : "아니오" );
				    if(delivery) {
				    	info += ", 배달 받으실 주소 : " + address;
				    } 
		 	return info;
	}
	
	public void addSideMenu() {
		if(!sideMenu) {
			sideMenu = true;
			System.out.println("사이드 메뉴를 추가했습니다.");
		} else {
			System.out.println("이미 사이드 메뉴를 선택하셨습니다.");
		}
	}
	
	public void requestDelivery() {
		if(!delivery) {
			delivery = true;
			System.out.println("배달 요청을 완료했습니다.");
		} else {
			System.out.println("배달주문이 이미 처리되었습니다.");
		}
	}

}

