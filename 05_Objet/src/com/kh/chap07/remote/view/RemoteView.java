package com.kh.chap07.remote.view;

import java.util.Scanner;

import com.kh.chap07.remote.controller.RemoteController;

// ����ڿ��� ���� �Է¹ް� ������ ������ִ� �޼ҵ带 �־�� Ŭ����
public class RemoteView {

	Scanner sc = new Scanner(System.in);
	RemoteController rc = new RemoteController();

	// ���α׷� ���۽� ������ ���θ޴��� ������ִ� �޼ҵ�
	public void mainMenu() {

		while (true) {
			System.out.println("������ ���� ���α׷��Դϴ�.");
			System.out.println("�̷��� ������ ������ ������ �غ�����.");
			System.out.println("�̿��Ͻ� �޴��� �������ּ���.");
			System.out.println("1. ���� �ѱ�");
			System.out.println("2. ä�� �ٲٱ� ��");
			System.out.println("3. ä�� �ٲٱ� ��");
			System.out.println("4. ���� ����");
			System.out.println("5. ���α׷� ����");
			System.out.print("� ����� �̿��Ͻðڽ��ϱ�> ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1: powerOn(); break;
			case 2:	channelUp(); break;
			case 3:	break;
			case 4:	break;
			case 5:	System.out.println("���� ����"); return;
			default:System.out.println("�Ҽ������. �ٽ� �Է����ּ���.");
			}
		}
	}

	private void powerOn() {

		System.out.println("====================================");
		System.out.println("���� �ѱ� �޴��Դϴ�. ");
		System.out.println("====================================");

		int result = rc.pwerOn();

		if (result > 0) {
			System.out.println("������ �������ϴ�.");
		} else {
			System.out.println("�̹� ������ �����ֽ��ϴ�.");
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}

	private void channelUp() {

		// 0�� ä��
		// 1�� ä��
		// ��Ʈ�ѷ��� ä�� �÷��� �׸��� ���ϴ��� �˷���
		String channel = rc.channelUp();
		if (channel != null) {
			int channelNo = rc.getChannelNo();
			System.out.println(rc.getChannelNo() + "�� ä���Դϴ�.");
			System.out.println("�������������������������������������");
			System.out.println("���� ������ ���α׷� �Դϴ� : " + channel);
			System.out.println("�������������������������������������");
		} else {
			System.out.println("���� ������ ���ֽñ� �ٶ��ϴ�.");
		}
        System.out.println();
	}

}
