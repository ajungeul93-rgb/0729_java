package com.kh.chap01.model.vo;

public class Parent {
	
	// �ʵ��
	private int x;
	private int y;
	
	//�����ں�
	public Parent() {}
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public void printParent() {
		System.out.println("�ȴ� ���� �θ�Ŭ������~");
	}
	
	public void print() {
		System.out.println("���� �θ�~");
	}

}
