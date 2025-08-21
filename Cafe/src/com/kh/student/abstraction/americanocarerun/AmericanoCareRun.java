package com.kh.student.abstraction.americanocarerun;

import java.util.Scanner;

import com.kh.student.abstraction.vo.Americano;


public class AmericanoCareRun {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Americano coffee = new Americano();
		
		System.out.println("아메리카노 주문하기 > ");
	
		
		System.out.print("ICE or HOT : ");
		String type = sc.nextLine();
		coffee.setType(type);
		
		System.out.print("사이즈 (S/M/L): ");
		String size = sc.nextLine();
		coffee.setSize(size);
		
		System.out.print("음료 온도: ");
		int temperature = sc.nextInt();
		coffee.setTemperature(temperature);
		
		sc.nextLine();
		
		System.out.print("샷 추가 여부 (true/false): ");
		boolean hasShot = sc.nextBoolean();
		coffee.setHasShot(hasShot);
		
		sc.nextLine();
		
		System.out.print("커피 진하기 (1~10): ");
		int strength = sc.nextInt();
		coffee.setStrength(strength);
		
		sc.nextLine();
		
		boolean exit = false;
		
		while (!exit) {
			System.out.println("\n==== 주문한 커피 ====");
			System.out.println(coffee.info());
			
			
			if(coffee.getTemperature() > 60) {
				System.out.println("너무 뜨거우니 식히는 걸 추천드립니다.");
			}
			
			System.out.print("\n1. 커피 저어 진하게 만들기 / 2. 식히기 / 3. 종료 > ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1 : coffee.stir(); break;
			case 2 : coffee.coolDown(); break;
			case 3 : exit = true; break;
			default: System.out.println("다시 선택해주세요.");
			}
		}
		
		System.out.println("이용해 주셔서 감사합니다(^///^)");
		
	}

}
