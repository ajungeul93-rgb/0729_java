package com.kh.chap02.model.vo;

public class RiceWineDrinker extends Drinker{
	
	private int age;
	
	public RiceWineDrinker() {}
	public RiceWineDrinker(int age) {
		this.age = age;
	}
	
	public int setAge() {
		return age;
	}
	public void getAge(int age) {
		this.age = age;
	}
	
	@Override
	public void drink() {
		System.out.println("���ɸ��� ���� ���ź��ƿ�.");
	}
	
	@Override
	public void eat() {
		System.out.println("������ ��ź�����~");
	}

}
