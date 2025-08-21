package com.kh.model.vo;

public class Restaurant {
	
	// ��ȣ, �ּ�, ���θ޴�
	private String storeName;
	private String address;
	private String mainMenu;
	
	public Restaurant() {}
	
	public Restaurant(String storeName, String address, String mainMenu) {
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
	}
	
	public String getStoreName() {
		return storeName;
	}
	public String getAddress() {
		return address;
	}
	public String getMainMenu() {
		return mainMenu;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	public String information() {
		return "�Ĵ� ���� [��ȣ�� : " + storeName + ", �ּ� : " + address
				     +", ���� �޴� : " + mainMenu +"]";
		
	}

}
