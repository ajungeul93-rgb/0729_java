package com.jg.assignment.chicken.vo;

public class Chicken {

	private String flavor;
	private int pieces;
	private boolean sideMenu;
	private boolean delivery;
	private String address;
	
	
	//�⺻ ������
	public Chicken() {}
	
	// ��ü �ʵ� �ʱ�ȭ ������
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
		String info = "ġŲ �� : " + flavor + ", ���� �� : " + pieces 
				    + ", ���̵� �޴� : " + (sideMenu? "��" : "�ƴϿ�") 
				    + ", ��� ���� : " + (delivery? "��" : "�ƴϿ�" );
				    if(delivery) {
				    	info += ", ��� ������ �ּ� : " + address;
				    } 
		 	return info;
	}
	
	public void addSideMenu() {
		if(!sideMenu) {
			sideMenu = true;
			System.out.println("���̵� �޴��� �߰��߽��ϴ�.");
		} else {
			System.out.println("�̹� ���̵� �޴��� �����ϼ̽��ϴ�.");
		}
	}
	
	public void requestDelivery() {
		if(!delivery) {
			delivery = true;
			System.out.println("��� ��û�� �Ϸ��߽��ϴ�.");
		} else {
			System.out.println("����ֹ��� �̹� ó���Ǿ����ϴ�.");
		}
	}

}

