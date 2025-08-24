package com.kh.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.model.vo.Car;

public class ParkingTowerController {

	List<Car> carList = new ArrayList<>();
	
	
	
	public boolean insertCar(int parkingNum, int carNum, int carType, String owner) {
		
		try {
			Car ca = new Car(parkingNum, carNum, carType, owner);
			carList.add(ca);
			return true;
		} catch(Exception e) {
			
			return false;
		}
		
	}



	public int deleteCar(int carNum, String owner) {
		
		int count = 0;
		
		for(int i = 0; i < carList.size(); i++ ) {
			if(carNum == carList.get(i).getCarNum() &&
			   owner.equals(carList.get(i).getOwner())) {
				carList.remove(i);
				i--;
				count ++;
			}
		}
		
		return count;
	}



	public List<Car> searchCar(String keyword) {

		List<Car> searchedCar = new ArrayList<>();
		
		for(Car ca : carList) {
			
			String carNumStr = "" + ca.getCarNum();
			
			if(carNumStr.equals(keyword) || ca.getOwner().contains(keyword)) {
				searchedCar.add(ca);
			}
		}
		
		return searchedCar;
	}



	public List<Car> selectList() {
		
		return carList;
	}

}
