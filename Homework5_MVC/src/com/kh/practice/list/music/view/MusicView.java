package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;

public class MusicView {
	
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		while(true) {
		System.out.println();
		System.out.println("=====***** 메인 메뉴 *****=====");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 수정");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호 입력 : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		  case 1 : addList(); break;
		  case 2 : addAtZero(); break;
		  case 3 : printAll(); break;
		  case 4 : searchMusic(); break;
		  case 5 : removeMusic(); break;
		  case 6 : setMusic(); break;
		  case 7 : System.out.println("프로그램을 종료합니다."); return;
		  default : System.out.println("잘못입력 하였습니다. 다시 입력해주세요.");
  		  }
		
		}
		
	}
	
	public void addList() {
		
		System.out.println("***** 마지막 위치에 곡 추가 *****");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		
		
		System.out.println("추가 성공");
		
	}
	
	public void addAtZero() {
		
	}
	
	public void printAll() {
		
		
	}
	
	public void searchMusic() {
		
	}
	
	public void removeMusic() {
		
		
	}
	
	public void setMusic() {
		
	}
	

}
