package com.jg.assignment.energyDrink;

import java.util.Scanner;

import com.jg.assignment.energyDrink.EnergyDrink;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EnergyDrink drink = new EnergyDrink();
		
		System.out.println("몬스터 에너지 드링크 종류를 골라주세요> ");
		
		System.out.print("어떤맛? : ");
		String drinkFlavor = sc.nextLine();
		drink.setDrinkFlavor(drinkFlavor);
		
		System.out.print("음료 사이즈(용량): ");
		int size = sc.nextInt();
		drink.setSize(size);
		
		System.out.print("음료 갯수 : ");
		int number = sc.nextInt();
		drink.setNumber(number);
		
		System.out.print("아이스컵 여부(true / false) : ");
		boolean iceCup = sc.nextBoolean();
		drink.setIceCup(iceCup);
		
		System.out.print("비밀봉투 여부(true / false) : ");
		boolean plasticBag = sc.nextBoolean();
		drink.setPlasticBag(plasticBag);
		
		boolean exit = false;
		
		while (!exit) {
			System.out.println("\n==== 음료 구매정보 ====");
			System.out.println(drink.info());
			
			if(drink.getNumber() > 3) {
				System.out.println("많이 구매하셨는데 봉투에 담아가세요.");
			}
			
			System.out.print("\n1.봉투 구매 / 2. 아이스 컵 / 3. 종료 > ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch (select) {
			case 1 : drink.bag(); break;
			case 2 : drink.cup(); break;
			case 3 : exit = true; break;
			default : System.out.println("다시 선택해주세요.");
			}
		}
		
		System.out.println("안녕히가세요. KH편의점이였습니다.^_____^");
		
	}
}