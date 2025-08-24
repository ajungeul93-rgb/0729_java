package practice.view;

import java.util.List;
import java.util.Scanner;

import practice.controller.CustomerController;
import practice.model.vo.Customer;

public class CustomerView {

	CustomerController cc = new CustomerController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("===========메인 메뉴===========");
			System.out.println("1. 고객 추가 ");
			System.out.println("2. 전체 고객 보기");
			System.out.println("3. 특정 고객 찾기");
			System.out.println("4. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : customerAdd(); break; 
			case 2 : customerAll(); break;
			case 3 : findCustomer(); break;
			case 4 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		    }
		}
	}
	public void customerAdd() {

		System.out.println("== 고객 추가 ==");
		System.out.print("고객 이름 : ");
		String name = sc.nextLine();
		System.out.print("고객 나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("고객 아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("고객 등급 : ");
		String grade = sc.nextLine();
		
		if(cc.customerAdd(name, age, userId, grade)) {
		
		    System.out.println("고객 등록이 정상적으로 등록되었습니다.");
		} else {
			System.out.println("고객 등록에 실패 했습니다.");
		}
	}

	public void customerAll() {
		
		System.out.println();
		System.out.println("==== 전체 고객 목록 ====");
		List<Customer> userList = cc.customerAll();
		
		if(userList.isEmpty()) {
			System.out.println("등록된 고객 정보가 없습니다.");
		} else {
			for(Customer c : userList) {
				System.out.println("고객 이름 : " + c.getName() + ", 고객 나이 : " + c.getAge() + ", 고객 아이디 : " + c.getUserId() + ", 고객 등급 : " + c.getGrade());
			}
		}

	}

	public void findCustomer() {
		
		System.out.println();
		System.out.println("==== 고객 찾기 ====");
		System.out.println("찾을 고객의 이름 또는 ID를 입력하세요 : ");
		String keyword = sc.nextLine();
		
		List<Customer> find = cc.findCustomer(keyword);
		
		if(find.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			System.out.println("조회 결과 총 " + find.size() + "건 존재합니다.");
			
			for(Customer c : find) {
				System.out.println("========================");
				System.out.println(c.toString());
				
			}
		}

	}
}
