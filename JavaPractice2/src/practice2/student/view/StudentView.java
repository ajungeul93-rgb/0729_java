package practice2.student.view;

import java.util.List;
import java.util.Scanner;

import practice2.modle.vo.Student;
import practice2.student.controller.StudentController;

public class StudentView {
	
	Scanner sc = new Scanner(System.in);
	StudentController stuControl = new StudentController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("========= 메인 메뉴 ==========");
			System.out.println("1. 학생 정보 입력 ");
			System.out.println("2. 전체 학생 목록 조회 ");
			System.out.println("3. 학생 성적 조회 ");
			System.out.println("4. 프로그램 종료 ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : addStudent();break;
			case 2 : getAllStudents(); break;
			case 3 : getStudentScore(); break;
			case 4 : System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	


	public void addStudent() {
		
		System.out.println("===== 학생 정보 추가 =====");
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		
		
		if(stuControl.addStudent(name, kor, eng, math)) {
			System.out.println("학생 이름과 점수가 정상적으로 등록되었습니다.");
		} else {
			System.out.println("학생 정보등록에 실패하였습니다.");
		}
		
	}
	
	public void getAllStudents() {

		System.out.println();
		System.out.println("====== 전체 학생정보 목록 ======");
	    List<Student> students = stuControl.getAllStudents();
	    
	    if(students.isEmpty()) {
	    	System.out.println("등록된 학생 정보가 없습니다.");
	    } else {
	    	for(Student s : students) {
	    		System.out.println(s.toString());
	    	}
	    }
		
	}
	

	public void getStudentScore() {
		
		System.out.println();
		System.out.println("==== 학생 정보 찾기 ====");
		System.out.print("성적을 조회할 학생의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
        String scoreInfo = stuControl.getStudentScore(name);
		
		if(scoreInfo == null) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			System.out.println(scoreInfo);
			}
		
		}
		

		
		
}


