package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	public static final int SIZE = 3;
	private Student[] s = new Student[SIZE];
	
	public static final int CNT = 10;
	private Employee[] e = new Employee[CNT];
	
	// �� ��ü�迭�� ����� ��ü�� ���� �����迭�� ��� ��ȯ�ϴ� �޼ҵ�
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
	
	
	//�Ű������� �޾ƿ� �����͸� �л� ��ü �迭 �� ����� �����ϴ� �޼ҵ�
	public void insertStudent(String name, int age, double height
			                , double weight, int grade, String major) {
		
		for (int i = 0; i < s.length; i++) {
			if(s[i] == null) {
			s[i] = new Student(name, age, height, weight, grade, major);
			return;
			}
		}
		
	}
	
	// �л� ��ü �迭�� �ּҸ� ��ȯ�ϴ� �޼ҵ�
	public Student[] printStudent() {
		return s;
	}
	
	
	// �Ű������� �޾ƿ� �����͸� ��� ��ü �迭 �� ����� ����Ǵ� �żҵ�
	public void insertEmployee(String name, int age, double height
			                 , double weight, int salary, String dept) {
		
		for (int i = 0; i < e.length; i++) {
			if(e[i] == null) {
			e[i] = new Employee(name, age, height, weight, salary, dept);
			return;
			}
		}
		
		
		
	}
	
	
	// ��� ��ü �迭�� �ּҸ� ��ȯ�ϴ� �żҵ�
	public Employee[] printEmployee() {
		return e;
		
	}
	
	
	
		
	
	

}
