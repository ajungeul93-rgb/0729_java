package com.kh.view;

import java.util.List;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {

	Scanner sc = new Scanner(System.in);
	ParkingTowerController ptc = new ParkingTowerController();
	
	public void mainMenu() {
		
		while(true) {
		System.out.println("===== 차량 관리 =====");
		System.out.println("1. 차량 주차 ");
		System.out.println("2. 차량 출차 ");
		System.out.println("3. 주차된 차량 검색 ");
		System.out.println("4. 차량 전체 확인 ");
		System.out.println("0. 프로그램 종료 ");
		int menuNo = sc.nextInt();
		sc.nextLine();

		switch(menuNo) {
		case 1 : insertCar(); break;
		case 2 : deleteCar(); break;
		case 3 : searchCar(); break;
		case 4 : selectList(); break;
		case 0 : System.out.println("프로그램을 종료합니다."); return;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
		}
	}

	private void insertCar() {
		
		System.out.println("===== 주차 차량 정보입력 ======");
		System.out.print("주차(식별/ 차량 번호X) 번호 : ");
		int parkingNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("차량 번호 : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("차량 타입 (1.경차 / 2. 세단 / 3. SUV / 4. 트럭 ) : ");
		int carType = sc.nextInt();
		sc.nextLine();
		
		System.out.print("차량 주인 이름 : ");
		String owner = sc.nextLine();
		
		if(ptc.insertCar(parkingNum, carNum, carType, owner)) {
			System.out.println("차량 정보가 입력되었습니다! ");
		} else {
			System.out.println("차령 정보 입력에 실패하였습니다.");
		}
	}

	private void deleteCar() {
		
		System.out.println();
		System.out.println("출차 하실 차량 번호를 입력해주세요 : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		System.out.println("차량 소유주 이름을 입력해주세요 : ");
	    String owner = sc.nextLine();
		
	    int count = ptc.deleteCar(carNum, owner);
	    
	    if(count > 0) {
	    	System.out.println("출차가 완료 되었습니다.");
	    	System.out.println("차량 번호 : " + carNum + "가 출차 되었습니다.");
	    } else {
	    	System.out.println("차량을 찾지 못하였습니다. ");
	    }
	}
	
	private void searchCar() {
		
		System.out.println();
		
		System.out.println("주차된 차량 검색 서비스입니다. ");
		System.out.println("찾으려는 차량 번호나 소유주 이름을 입력해주세요 : ");
		String keyword = sc.nextLine();
		
		List<Car> searchedCar = ptc.searchCar(keyword);
		
		if(searchedCar.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다. ");
		} else {
			System.out.println("조회 결과 총 " + searchedCar.size() + "대가 존재합니다.");
			
			for(Car c : searchedCar) {
				System.out.println("===========================");
				System.out.println("차량 번호 : " + c.getCarNum() + "| 차량 소유주 : " + c.getOwner());
			}
		}
		
	}
	
	private void selectList() {
		
		System.out.println();
		System.out.println("======= 전체 차량 조회 ========");
		List<Car> carList = ptc.selectList();
		
		if(carList.isEmpty()) {
			System.out.println("주차되어 있는 차량이 없습니다. ");
		} else {
			for(Car c : carList) {
				System.out.println(c.toString());
			}
		}
		
	}



}
