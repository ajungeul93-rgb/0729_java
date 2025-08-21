package com.jg.assignment.pizza.run;

import java.util.Scanner;

import com.jg.assignment.pizza.vo.Pizza;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pizza pizza = new Pizza();
		
		System.out.print("피자 종류를 선택해주세요 > ");
		String type = sc.nextLine();
		pizza.setType(type);
		
		System.out.print("사이즈를 입력해주세요 (S / M / L) > ");
		String size = sc.nextLine();
		pizza.setSize(size);
		
		System.out.print("피자 갯수 > ");
		int number = sc.nextInt();
		pizza.setNumber(number);
		
		System.out.print("치즈 크러스트 추가 여부(true / false) > ");
		boolean cheeseCrust = sc.nextBoolean();
		pizza.setCheeseCrust(cheeseCrust);
		
		System.out.print("배달 여부 (true / false) > ");
		boolean delivery = sc.nextBoolean();
		pizza.setDelivery(delivery);
		
		boolean exit = false;
		while(!exit) {
			System.out.println("======== 주문 정보 ========");
			System.out.println(pizza.info());
			
			if(pizza.getNumber() >= 3) {
				System.out.println("피자가 많은데 배달로 받으시는걸 추천드려요!");
			}
			
			System.out.println("1. 치즈 크러스트 추가 / 2. 배달 요청 / 3. 종료 > ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : pizza.addCheeseCrust(); break;
			case 2 : pizza.requestDelivery(); break;
			case 3 : exit = true; break;
			default : System.out.println("다시 입력해주세요. ");
			}
		}
		
	   System.out.println("맛있는 피자를 곧 준비해드리겠습니다!");

	}

}

