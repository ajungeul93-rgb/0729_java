package com.kh.practice.list.library.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	private static final int String = 0;
	BookController bc = new BookController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		System.out.println("==== Welcom KH Library ====");
		while (true) {
			System.out.println();
			System.out.println("=====*****메인 메뉴*****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 종료");

			System.out.print("메뉴 번호 입력 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:	insertBook(); break;
			case 2:	selectList(); break;
			case 3:	searchBook(); break;
			case 4:	deleteBook(); break;
			case 5: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertBook() {
		
		System.out.println("===== 새 도서 추가 =====");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		
		
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		
		  
		// 장르를 번호로 사용자에게 입력 받아서 입력받은 장르를 category에 문자열로 변환 하여
		// 반환해야함
		System.out.print("장르(1. 인문 / 2. 자연과학 / 3.의료 / 4.기타) : " );
		int categorynum = sc.nextInt();
		
	    String category = "";
		switch(categorynum) {
		case 1 : category = "인문"; break;
		case 2 : category = "자연과학"; break;
		case 3 : category = "의료"; break;
		case 4 : category = "기타"; break;
		default : 
			if(categorynum < 1 || 4 < categorynum ) {
				System.out.println();
				System.out.println("잘못된 입력입니다. 1~4번 숫자로 입력해주세요.");
			} return; // 장르로 돌려보내기는 어떻게 ??
		}
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		bc.insertBook(title, author, category, price);

	}

	public void selectList() {
		
		System.out.println();
		System.out.println("===== 도서 전체 조회 =====");
		List<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			
			for(Book b : bookList) {
				System.out.println("도서 명 : " + b.getTitle() + ", 저자 명 : " + b.getAuthor()
				                  +", 장르 : " + b.getCategory() + ", 가격 : " + b.getPrice());
			}
		}
	}

	public void searchBook() {
		
		System.out.println();
		
		System.out.println("도서 검색 서비스입니다.");
		System.out.print("검색어를 입력해주세요 > ");
		String keyword = sc.nextLine();
		
		List<Book> searched = bc.searchBook(keyword);
		
		if(searched.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			
			System.out.println("조회 결과가 총 " + searched.size() +"건 존재합니다.");
			
			for(Book b : searched) {
				System.out.println("============================");
				System.out.println("도서 명 : " + b.getTitle() + ", 저자 명 : " + b.getAuthor()
				                 + ", 장르 : " + b.getCategory() + ", 가격 : " + b.getPrice());
				
			}
			
		}

	}

	public void deleteBook() {
		
		System.out.println();
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.println();
		System.out.print("삭제할 도서의 저자 명 : ");
		String author = sc.nextLine();
		System.out.println();
		
		int count = bc.deleteBook(title, author);
		
		if(count > 0) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		System.out.println();

	}

}
