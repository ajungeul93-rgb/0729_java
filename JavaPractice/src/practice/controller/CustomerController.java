package practice.controller;

import java.util.ArrayList;
import java.util.List;

import practice.model.vo.Customer;

public class CustomerController {

	List<Customer> userList = new ArrayList();

	public boolean customerAdd(String name, int age, String userId, String grade) {
		try {
			Customer ct = new Customer(name, age, userId, grade);
			userList.add(ct);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<Customer> customerAll() {

		return userList;
	}
	
	public List<Customer> findCustomer(String keyword){
		List<Customer> find = new ArrayList();
		
		for(Customer ct : userList) {
			
			if(ct.getName().contains(keyword)|| ct.getUserId().contains(keyword) ){
				   find.add(ct);
			   }
		}
		
		return find;
	}

}
