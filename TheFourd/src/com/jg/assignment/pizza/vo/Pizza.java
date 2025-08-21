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
		String info = "���� ���� : " + type + ", ���� ������ : " + size + ", ���� ���� : " + number 
				    + ", ġ�� ũ����Ʈ ���� : " + (cheeseCrust? "��" : "�ƴϿ�")
				    + ", ��� ���� : " + (delivery? "��" : "�ƴϿ�");
		return info;
	}
	
	
	public void addCheeseCrust() {
		if(!cheeseCrust) {
			cheeseCrust = true;
			System.out.println("ġ�� ũ����Ʈ�� �߰��߽��ϴ�. ");
		} else {
			System.out.println("�̹� ġ�� ũ����Ʈ�� �߰��Ǿ����ϴ�. ");
		}
	}
	
	public void requestDelivery() {
		if (!delivery) {
			delivery = true;
			System.out.println("��� ��û�� �Ϸ��߽��ϴ�.");
		} else {
			System.out.println("����ֹ��� �̹� ó���Ǿ����ϴ�.");
		}
	}

}

