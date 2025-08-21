package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	public static final int SIZE = 3;
	private Student[] s = new Student[SIZE];
	
	public static final int CNT = 10;
	private Employee[] e = new Employee[CNT];
	
	// 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
	public int personCount() {
		
		int student = 0;
		
		for(int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				student++;
			}
		}
		return student;
	}
	
	public int personCount2() {
		
		int employee = 0;
		
		for(int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				employee++;
			}
		}
		return employee;		
	}
	
	
	//매개변수로 받아온 데이터를 학생 객체 배열 중 빈곳에 저장하는 메소드
	public void insertStudent(String name, int age, double height
			                , double weight, int grade, String major) {
		
		for (int i = 0; i < s.length; i++) {
			if(s[i] == null) {
			s[i] = new Student(name, age, height, weight, grade, major);
			return;
			}
		}
		
	}
	
	// 학생 객체 배열의 주소를 반환하는 메소드
	public Student[] printStudent() {
		return s;
	}
	
	
	// 매개변수로 받아온 데이터를 사원 객체 배열 중 빈곳에 저장되는 매소드
	public void insertEmployee(String name, int age, double height
			                 , double weight, int salary, String dept) {
		
		for (int i = 0; i < e.length; i++) {
			if(e[i] == null) {
			e[i] = new Employee(name, age, height, weight, salary, dept);
			return;
			}
		}
		
		
		
	}
	
	
	// 사원 객체 배열의 주소를 반환하는 매소드
	public Employee[] printEmployee() {
		return e;
		
	}
	
	
	
		
	
	

}
