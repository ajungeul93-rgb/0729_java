package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	
	public void mainMenu() {
		
		while(true) {
			int m = pc.personCount();
			int emp = pc.personCount2();
		System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� �л��� " + m + "���Դϴ�.");
		System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� ����� " + emp +"�� �Դϴ�.");
		
		System.out.println("");
		System.out.println("1. �л� �޴�");
		System.out.println("2. ��� �޴�");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : studentMenu();  break;
		case 2 : employeeMenu(); break;
		case 9 : System.out.println("�����մϴ�."); return;
		default :System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
		
		} 
	}
	
	// �л� �޴��� ����ϴ� �޼ҵ�
	public void studentMenu() {
		
		while(true) {
			
		int student = pc.printStudent().length;
		int count = pc.personCount();
		
		if(count >= student) {
		    System.out.println("�л��� �ִ� ��ϼ��� �� ��ϵǾ� �Ϻθ޴��� �����ϴ�.");
		    System.out.println("2. �л� ����");
		    System.out.println("9. ��������");
		} else {
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
		}	
		System.out.print("�޴� ��ȣ : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : insertStudent(); break;
		case 2 : printStudent(); break;
		case 9 : System.out.println("�������� ���ư��ϴ�.");
		         mainMenu(); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");         
		  }
		}
	}
	
	// ��� �޴��� ����ϴ� �޼ҵ�
	public void employeeMenu() {
		while(true) {
			
			int emp = pc.printEmployee().length;
			int count2 = pc.personCount2();
			
			if(count2 >= emp) {
			System.out.println("����� �ִ� ��ϼ��� �� ��ϵǾ� �Ϻθ޴��� �����ϴ�.");	
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			} else {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			}
			
			System.out.print("�޴� ��ȣ : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : insertEmployee(); break;
			case 2 : printEmployee(); break;
			case 9 : System.out.println("�������� ���ư��ϴ�.");
			mainMenu(); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");         
			}
		}
		
	}
	
	
	//����ڿ��� ��ü�迭�� ������ �л� �����͸� �޴� �޼ҵ�
	public void insertStudent() {
		
		int student = pc.printStudent().length;
		int count = pc.personCount();
		
		while(true) {
			
			
			if(count >= student) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
				studentMenu(); return;
			}
				System.out.println("�л� ������ �Է��ϴ� �� �Դϴ�.");                  //
				System.out.print("�׸��Ͻ÷��� N(�Ǵ�)n, �̾��Ͻ÷��� �ƹ� Ű�� ��������.");  //
				String choice = sc.nextLine();                                 //
		    if (choice.equalsIgnoreCase("n")) {                                // gpt���� ����
		       System.out.print("�л� �߰��� �����մϴ�.");
		       return;
		    }
			System.out.print("�л� �̸� : ");
			String name = sc.nextLine();
			
			System.out.print("�л� ���� : ");
			int age = sc.nextInt();
			
			System.out.print("�л� Ű : ");
			double height = sc.nextDouble();
			
			System.out.print("�л� ������ : ");
			double weight = sc.nextDouble();
			
			System.out.print("�л� �г� : ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�л� ���� : ");
			String major = sc.nextLine();
			
			
				
		pc.insertStudent(name, age, height, weight, grade, major); 
		System.out.println("�л����� ����� �Ϸ�Ǿ����ϴ�.");
		
		count++;
		}
    }
	
	
	// ��ü�迭�� ����� �л� �����͸� ����ϴ� �޼ҵ�
	public void printStudent() {
		
		System.out.println();
		System.out.println("�л����� ������ ����մϴ�.");
		
		Student[] student = pc.printStudent();
		int count = pc.personCount();
		
		if(count > 0) {
			for(int i = 0; i <student.length; i ++) {
				if(student[i] != null) {
					System.out.println("�̸� : " + student[i].getName());
					System.out.println("���� : " + student[i].getAge());
					System.out.println("Ű : " + student[i].getHeight());
					System.out.println("������ : " + student[i].getWeight());
					System.out.println("�г� : " + student[i].getGrade());
					System.out.println("���� : " + student[i].getMajor());
				}
			}
		} else {
			System.out.println("�л� ������ ��ϵǾ� �����ʽ��ϴ�.");
		}
		
		
	}
	
	
	// ����ڿ��� ��ü�迭�� ������ ��� �����͸� �޴� �޼ҵ�
	public void insertEmployee() {
		
		int emp = pc.printEmployee().length;
		int count = pc.personCount2();
		
		while(true) {
			
			
			if(count >= emp) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
				employeeMenu(); return;
			}
				System.out.println("��� ������ �Է��ϴ� �� �Դϴ�.");                  //
				System.out.print("�׸��Ͻ÷��� N(�Ǵ�)n, �̾��Ͻ÷��� �ƹ� Ű�� ��������.");  //
				String choice = sc.nextLine();                                 //
		    if (choice.equalsIgnoreCase("n")) {                                // gpt���� ����
		       System.out.print("��� �߰��� �����մϴ�.");
		       return;
		    }
			System.out.print("��� �̸� : ");
			String name = sc.nextLine();
			
			System.out.print("��� ���� : ");
			int age = sc.nextInt();
			
			System.out.print("��� Ű : ");
			double height = sc.nextDouble();
			
			System.out.print("��� ������ : ");
			double weight = sc.nextDouble();
			
			System.out.print("��� �޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();
			
			
				
		pc.insertEmployee(name, age, height, weight, salary, dept); 
		System.out.println("������� ����� �Ϸ�Ǿ����ϴ�.");
		
		count++;
		}
	}
	
	
	// ��ü�迭�� ����� ��� �����͸� ����ϴ� �޼ҵ�
	public void printEmployee() {
		
		System.out.println();
		System.out.println("������� ������ ����մϴ�.");
		
		Employee[] emp = pc.printEmployee();
		int count = pc.personCount2();
		
		if(count > 0) {
			for(int i = 0; i <emp.length; i ++) {
				if(emp[i] != null) {
					System.out.println("===============================");
					System.out.println("�̸� : " + emp[i].getName());
					System.out.println("���� : " + emp[i].getAge());
					System.out.println("Ű : " + emp[i].getHeight());
					System.out.println("������ : " + emp[i].getWeight());
					System.out.println("�޿� : " + emp[i].getSalary());
					System.out.println("�μ� : " + emp[i].getDept());
					System.out.println("===============================");
				}
			}
		} else {
			System.out.println("��� ������ ��ϵǾ� �����ʽ��ϴ�.");
		}
		
	}

}
