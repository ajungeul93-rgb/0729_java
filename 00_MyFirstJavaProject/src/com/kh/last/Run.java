package com.kh.last;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.kh.last.vo.Person;

public class Run {
	
	/*
	 * ��Ʈ���� �ֿ� �߰� ����
	 * 
	 * 1. filter() : ���ǿ� �´� ��Ҹ� ���͸�
	 * 2. map() : ��Ҹ� ��ȯ�� �� ����ϴ� ����
	 * 3. distinct() : ����� �ߺ��� ������ ��
	 * 
	 * ��Ʈ���� �ֿ� ���� ����
	 * 
	 * 1. collect() : ����� �÷������� ��ȯ
	 * 2. forEach() : ��� ��ҿ����� �۾� ����
	 * 3. count() : ��� ���� ��ȯ
	 * 4. reduce() : ��Ҹ� �����ؼ� ���� ��� ������
	 * 
	 */
	
	

	public static void main(String[] args) {

		List<String> names = Arrays.asList("ȫ�浿", "��浿", "¯��");
		for (String name : names) {
			System.out.println(name + "��(��) ���� ������~");
		}

		System.out.println("=========================");

		names.stream().map(name -> name + "��(��) ������~").forEach(System.out::println);

		// ��Ʈ��(Stream)
		// �÷���, �迭 ���� �����͸� ���������� ó�����ִ� API
		// for�� -> ��� �ݺ��ϴ����� ��ü��
		// �Լ��� -> ������ ���� ������ ����
		// ���������̴� -> ���� ������ ����

		System.out.println("==========================");
		// 60�� �̻��� ������ ����� ���غ��߰ڴ�.
		int[] scores = { 88, 50, 72, 90, 100, 20, 40 };

		int sum = 0; //
		int count = 0; // 60�� �̻��� ������� ������ ����

		for (int score : scores) {
			if (score >= 60) {
				sum += score;
				count++;
			}
		}

		double average = (double) sum / count;
		System.out.println(average);

		double streamAvg = Arrays.stream(scores).filter(score -> score >= 60).average().orElse(0.0);// ���ǿ� �������� ������ ������
		System.out.println(streamAvg);

		/*
		 * �޼ҵ�ĺ���(�Ű�����){ return ��; }
		 * 
		 * print(int a){ return a; } (int a) ->{ return a; }
		 * 
		 * (int a) -> return a;
		 * 
		 * (int a) -> a;
		 * 
		 * (a) -> a;
		 * 
		 * a -> a;
		 * 
		 */

		// �͸�Ŭ���� -> ����� ���ÿ� ��ü�� �����ϴ� ��
		SimpleCal adder = new SimpleCal() {
			@Override
			public int cal(int a, int b) {
				return a + b;
			}
		};

		SimpleCal minuser = new SimpleCal() {
			@Override
			public int cal(int a, int b) {
				return a - b;
			}
		};
		System.out.println("5 + 3 = " + adder.cal(5, 3));
		System.out.println("5 - 3 = " + minuser.cal(5, 3));

		SimpleCal adder2 = (a, b) -> a + b;
		SimpleCal minuser2 = (a, b) -> a - b;
		System.out.println("2 + 4 = " + adder2.cal(2, 4));
		System.out.println("2 - 4 = " + minuser2.cal(2, 4));

		// map(), filter()

		// filter => ���ǿ� �´°͸� ���͸��� �� ����
		List<String> coffee = Arrays.asList("�Ƹ޸�ī��", "��", "�ݵ���", "����������", "�������");
		List<String> longNameCoffee = new ArrayList();

		for (String c : coffee) {
			if (c.length() == 5) {
				longNameCoffee.add(c);
			}
		}
		System.out.println(longNameCoffee);

		List<String> coffeeList = coffee.stream()
				                        .filter(c -> c.length() == 5)
				                        .collect(Collectors.toList());
		System.out.println(coffeeList);
		
		// map -> ��Ʈ���� �̿��ؼ� ������ ��ȯ�ϴ� �뵵
		List<Integer> nameLength = new ArrayList();
		for(String name : coffee) {
			nameLength.add(name.length());
		}
		System.out.println(nameLength);
		
		List<Integer> lengths = coffee.stream()
				                      //.map(c -> c.length())
				                      .map(String::length)
				                      .collect(Collectors.toList());
		System.out.println(lengths);
		coffee.stream().map(c -> c + "�� ���� : " + c.length())
		               //.forEach(l -> System.out.println(l));
                       .forEach(System.out::println);
		
		System.out.println("=================================");
		
		
		List<Person> people = Arrays.asList(
				                            new Person("ȫ�浿", "�Ѿ�", 15),
				                            new Person("��浿", "����", 40),
				                            new Person("������", "����", 20),
				                            new Person("����", "����", 23)
				                            );
		
		System.out.println("���� ����� ����ϱ�");
		System.out.println("���� �츮�� ���");
		for(Person person : people) {
			if("����".equals(person.getAddress())) {
				System.out.println(person);
			}
		}
		
		System.out.println("��Ʈ�� ���");
		people.stream().filter(person -> "����".equals(person.getAddress()))
		               .forEach(System.out::println);
		
		// �̸��� �ּ� ����ϱ�
		System.out.println("======�������� ���======");
		for(Person person : people) {
			System.out.println(person.getName() + "���� " + person.getAddress() + "�� ��ϴ�.");
		}
		
		System.out.println("======��Ʈ�� ���========");
		people.stream().map(person -> person.getName() + "����" + person.getAddress() + "�� ��ϴ�.")
		               .forEach(System.out::println);
		
		
		
		
	}

	// �Լ��� �������̽� ����
	@FunctionalInterface // �������̽� �Լ����̾�! �����Ϸ��� �Լ��� �������̽����� Ȯ��.
	interface SimpleCal {
		int cal(int a, int b); // �ϳ��� �߻�޼ҵ常 ������ �־����
	}

}
