package com.jg.assignment.computerCareRun;

import java.util.Scanner;

import com.jg.assignment.computer.Computer;

public class ComputerCareRun {

	public static void main(String[] args) {

		// ����ڿ��� ��ǻ���� ������ �Է¹޾Ƽ� (�Ϸ�)
		// �Է¹��� ��ǻ���� ������ ������ֱ� (�Ϸ�)
		// ��ǻ�� ������ �޾Ƽ� ���� ������ �ɼ� ������??
		// ���� ��� ��ǻ���� ������ ũ��. ���𰡸� �Ϸ��� ���� ������ ���������� �����Ѵ�.
		// ������ ������ �ɾ���ϳ�?
		// ���� ������ ����� �ֻ����� ���� ���� ���ִ°� �Ϸ���?
		// 1. ���� �������� ����� �޴��߿� ���� �����Ϸ���??
		/*
		 * 
		 * 
		 */

		System.out.println("====��ǻ�� ��� üũ�ϱ�====");
		Scanner sc = new Scanner(System.in);

		Computer specs = new Computer();

		System.out.print("CPU������ �Է����ּ��� > ");
		String cpu = sc.nextLine();
		specs.setCpu(cpu); 
		
		System.out.print("RAM�뷮�� �Է����ּ��� > ");
		int ramCapacity = sc.nextInt();
		specs.setRamCapacity(ramCapacity);
		
		System.out.print("����� �ֻ����� �Է����ּ��� > ");
		int monitorRefreshRate = sc.nextInt();
		specs.setMonitorRefreshRate(monitorRefreshRate);
		
		sc.nextLine();
		
		System.out.print("�׷���ī�� ������ �Է����ּ���> ");
		String graphicsCard = sc.nextLine();
		specs.setGraphicsCard(graphicsCard);
		
		System.out.print("�Ŀ� �뷮�� �����ּ���> ");
		int powerCapacity = sc.nextInt();
		specs.setPowerCapacity(powerCapacity);

		boolean exit = true;

		while (exit) {
			System.out.println("====================================");
			System.out.println("========����ڴ��� ��ǻ�� ����===========");
			System.out.println(specs.info());
			/*System.out.println("CPU : " + cpu);
			System.out.println("RAM �뷮 : " + ramCapacity + "GB");
			System.out.println("����� �ֻ��� : " + monitorRefreshRate + "Hz");
			System.out.println("�׷���ī�� :" + graphicsCard);
			System.out.println("�Ŀ� �뷮 : " + powerCapacity + "W");
			*/
			System.out.println("====================================");
			System.out.println();

			System.out.println(monitorRefreshRate + "Hz�� �����Ǿ����ϴ�. �ٽ� �����Ͻðھ��? ");
			System.out.println("");
			
			if (specs.getMonitorRefreshRate() > 240) {           //if�� ���� ���� ���� ������ �ȵ�
				System.out.println("=====Error====");
			}
			System.out.print("1. 60Hz / 2. 144Hz / 3. 240Hz / 4. ���� ������ > ");
			int menuNo = sc.nextInt();

			switch (menuNo) {

			case 1: specs.set1(); break;
			case 2: specs.set2(); break;
			case 3: specs.set3(); break;
			case 4: exit = false;  break;
			default: System.out.println("�޴��� �ٽ� �������ּ���! ");
			}

		} System.out.println("����� �ֻ����� " + specs.getMonitorRefreshRate() + "Hz ���� �Ǿ����ϴ�.");
		
		

	}

}
