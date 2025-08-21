package com.kh.hw.member.model.vo;

public class Member {
	
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
	
	//기본 생성자
	public Member() {}
	//6개의 초기값을 받는 매개변수 있는 생성자
	public Member(String id, String name, String password
			    , String email, char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	//필드의 값을 리턴하는 메소드
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	
	//필드의 초기화/변경하는 메소드
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//Member 클래스의 모든 필드 값들을 합쳐 변환
	public String information() {
		return "회원 정보 [ ID : " + id + ", 이름 : " + name + ", 비밀 번호 : " + password
	         + ", Email : " + email + ", 성별 : " + gender + ", 나이 : " + age + "]";
	}
	
	
}
	
	


