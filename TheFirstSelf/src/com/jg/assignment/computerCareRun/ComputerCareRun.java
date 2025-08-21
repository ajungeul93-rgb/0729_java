package com.jg.assignment.computerCareRun;

import java.util.Scanner;

import com.jg.assignment.computer.Computer;

public class ComputerCareRun {

	public static void main(String[] args) {

		// 사용자에게 컴퓨터의 정보를 입력받아서 (완료)
		// 입력받은 컴퓨터의 정보를 출력해주기 (완료)
		// 컴퓨터 정보를 받아서 무슨 조건을 걸수 있을까??
		// 받은 모든 컴퓨터의 정보가 크다. 무언가를 하려면 받은 정보중 작은것으로 골라야한다.
		// 조건을 무엇을 걸어야하나?
		// 받은 정보중 모니터 주사율만 갖고 설정 해주는걸 하려면?
		// 1. 받은 정수값을 사용자 메뉴중에 고르면 대입하려면??
		/*
		 * 
		 * 
		 */

		System.out.println("====컴퓨터 사양 체크하기====");
		Scanner sc = new Scanner(System.in);

		Computer specs = new Computer();

		System.out.print("CPU종류를 입력해주세요 > ");
		String cpu = sc.nextLine();
		specs.setCpu(cpu); 
		
		System.out.print("RAM용량을 입력해주세요 > ");
		int ramCapacity = sc.nextInt();
		specs.setRamCapacity(ramCapacity);
		
		System.out.print("모니터 주사율을 입력해주세요 > ");
		int monitorRefreshRate = sc.nextInt();
		specs.setMonitorRefreshRate(monitorRefreshRate);
		
		sc.nextLine();
		
		System.out.print("그래픽카드 종류를 입력해주세요> ");
		String graphicsCard = sc.nextLine();
		specs.setGraphicsCard(graphicsCard);
		
		System.out.print("파워 용량을 적어주세요> ");
		int powerCapacity = sc.nextInt();
		specs.setPowerCapacity(powerCapacity);

		boolean exit = true;

		while (exit) {
			System.out.println("====================================");
			System.out.println("========사용자님의 컴퓨터 정보===========");
			System.out.println(specs.info());
			/*System.out.println("CPU : " + cpu);
			System.out.println("RAM 용량 : " + ramCapacity + "GB");
			System.out.println("모니터 주사율 : " + monitorRefreshRate + "Hz");
			System.out.println("그래픽카드 :" + graphicsCard);
			System.out.println("파워 용량 : " + powerCapacity + "W");
			*/
			System.out.println("====================================");
			System.out.println();

			System.out.println(monitorRefreshRate + "Hz로 설정되었습니다. 다시 설정하시겠어요? ");
			System.out.println("");
			
			if (specs.getMonitorRefreshRate() > 240) {           //if값 설정 값에 따라 실행이 안됨
				System.out.println("=====Error====");
			}
			System.out.print("1. 60Hz / 2. 144Hz / 3. 240Hz / 4. 설정 끝내기 > ");
			int menuNo = sc.nextInt();

			switch (menuNo) {

			case 1: specs.set1(); break;
			case 2: specs.set2(); break;
			case 3: specs.set3(); break;
			case 4: exit = false;  break;
			default: System.out.println("메뉴를 다시 선택해주세요! ");
			}

		} System.out.println("모니터 주사율이 " + specs.getMonitorRefreshRate() + "Hz 설정 되었습니다.");
		
		

	}

}
