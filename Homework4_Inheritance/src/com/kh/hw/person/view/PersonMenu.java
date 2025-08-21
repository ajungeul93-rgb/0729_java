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
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + m + "명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + emp +"명 입니다.");
		
		System.out.println("");
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : studentMenu();  break;
		case 2 : employeeMenu(); break;
		case 9 : System.out.println("종료합니다."); return;
		default :System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
		} 
	}
	
	// 학생 메뉴를 출력하는 메소드
	public void studentMenu() {
		
		while(true) {
			
		int student = pc.printStudent().length;
		int count = pc.personCount();
		
		if(count >= student) {
		    System.out.println("학생수 최대 등록수가 다 등록되어 일부메뉴만 열립니다.");
		    System.out.println("2. 학생 보기");
		    System.out.println("9. 메인으로");
		} else {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
		}	
		System.out.print("메뉴 번호 : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : insertStudent(); break;
		case 2 : printStudent(); break;
		case 9 : System.out.println("메인으로 돌아갑니다.");
		         mainMenu(); break;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");         
		  }
		}
	}
	
	// 사원 메뉴를 출력하는 메소드
	public void employeeMenu() {
		while(true) {
			
			int emp = pc.printEmployee().length;
			int count2 = pc.personCount2();
			
			if(count2 >= emp) {
			System.out.println("사원수 최대 등록수가 다 등록되어 일부메뉴만 열립니다.");	
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			} else {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			}
			
			System.out.print("메뉴 번호 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : insertEmployee(); break;
			case 2 : printEmployee(); break;
			case 9 : System.out.println("메인으로 돌아갑니다.");
			mainMenu(); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");         
			}
		}
		
	}
	
	
	//사용자에게 객체배열에 저장할 학생 데이터를 받는 메소드
	public void insertStudent() {
		
		int student = pc.printStudent().length;
		int count = pc.personCount();
		
		while(true) {
			
			
			if(count >= student) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				studentMenu(); return;
			}
				System.out.println("학생 정보를 입력하는 곳 입니다.");                  //
				System.out.print("그만하시려면 N(또는)n, 이어하시려면 아무 키나 누르세요.");  //
				String choice = sc.nextLine();                                 //
		    if (choice.equalsIgnoreCase("n")) {                                // gpt도움 구문
		       System.out.print("학생 추가를 종료합니다.");
		       return;
		    }
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			
			
				
		pc.insertStudent(name, age, height, weight, grade, major); 
		System.out.println("학생정보 등록이 완료되었습니다.");
		
		count++;
		}
    }
	
	
	// 객체배열에 저장된 학생 데이터를 출력하는 메소드
	public void printStudent() {
		
		System.out.println();
		System.out.println("학생들의 정보를 출력합니다.");
		
		Student[] student = pc.printStudent();
		int count = pc.personCount();
		
		if(count > 0) {
			for(int i = 0; i <student.length; i ++) {
				if(student[i] != null) {
					System.out.println("이름 : " + student[i].getName());
					System.out.println("나이 : " + student[i].getAge());
					System.out.println("키 : " + student[i].getHeight());
					System.out.println("몸무게 : " + student[i].getWeight());
					System.out.println("학년 : " + student[i].getGrade());
					System.out.println("전공 : " + student[i].getMajor());
				}
			}
		} else {
			System.out.println("학생 정보가 등록되어 있지않습니다.");
		}
		
		
	}
	
	
	// 사용자에게 객체배열에 저장할 사원 데이터를 받는 메소드
	public void insertEmployee() {
		
		int emp = pc.printEmployee().length;
		int count = pc.personCount2();
		
		while(true) {
			
			
			if(count >= emp) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				employeeMenu(); return;
			}
				System.out.println("사원 정보를 입력하는 곳 입니다.");                  //
				System.out.print("그만하시려면 N(또는)n, 이어하시려면 아무 키나 누르세요.");  //
				String choice = sc.nextLine();                                 //
		    if (choice.equalsIgnoreCase("n")) {                                // gpt도움 구문
		       System.out.print("사원 추가를 종료합니다.");
		       return;
		    }
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			
			System.out.print("사원 나이 : ");
			int age = sc.nextInt();
			
			System.out.print("사원 키 : ");
			double height = sc.nextDouble();
			
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
			
				
		pc.insertEmployee(name, age, height, weight, salary, dept); 
		System.out.println("사원정보 등록이 완료되었습니다.");
		
		count++;
		}
	}
	
	
	// 객체배열에 저장된 사원 데이터를 출력하는 메소드
	public void printEmployee() {
		
		System.out.println();
		System.out.println("사원들의 정보를 출력합니다.");
		
		Employee[] emp = pc.printEmployee();
		int count = pc.personCount2();
		
		if(count > 0) {
			for(int i = 0; i <emp.length; i ++) {
				if(emp[i] != null) {
					System.out.println("===============================");
					System.out.println("이름 : " + emp[i].getName());
					System.out.println("나이 : " + emp[i].getAge());
					System.out.println("키 : " + emp[i].getHeight());
					System.out.println("몸무게 : " + emp[i].getWeight());
					System.out.println("급여 : " + emp[i].getSalary());
					System.out.println("부서 : " + emp[i].getDept());
					System.out.println("===============================");
				}
			}
		} else {
			System.out.println("사원 정보가 등록되어 있지않습니다.");
		}
		
	}

}
