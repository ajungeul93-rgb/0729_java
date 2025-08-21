package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	// �⺻ ������
	public MemberMenu() {
	}

	// ���θ޴� ��� �޼ҵ�
	public void mainMenu() {

		while (true) {
			int max = mc.printAll().length; // ���� ��� ������ ȸ�� ��
			int cnt = mc.existMemberNum(); // ���� ��� ȸ�� ��

			System.out.println("�ִ� ��� ������ ȸ������ 10���Դϴ�.");
			System.out.println("���� ��� ������ ȸ�� ���� " + max + "�� �Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ���� " + cnt + "�� �Դϴ�.");

			/*
			if (cnt !=10) {
				System.out.println("1. �� ȸ�����");
			} else {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
			}
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			*/
			if (cnt >= max) {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");

				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
			} else {
				// ��ü �޴�
				System.out.println("1. �� ȸ�� ���");
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
			}

			System.out.println("�޴� ��ȣ : ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:	insertMember();	break;
			case 2:	searchMember();	break;
			case 3:	updateMember();	break;
			case 4:	deleteMember();	break;
			case 5:	printAll();		break;
			case 9:	System.out.println("���α׷��� �����մϴ�:) ");
				    return;
			default:System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}


	// ȸ������ϱ� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void insertMember() {

		//String id = null;

		while (true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();

			if (id.isEmpty()) {
				System.out.println("���̵� �Է��ϼ���.");
				continue;
			}

			if (mc.checkId(id)) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			break;
		}

		System.out.println("�̸� : ");
		String name = sc.nextLine();

		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();

		System.out.print("�̸��� : ");
		String email = sc.nextLine();

		char gender;

		while (true) {
			System.out.print("���� (M/F) : ");
			char g = sc.nextLine().charAt(0);

			if (g == 'M' || g == 'm' || g == 'F' || g == 'f') {
				gender = g; // ��ȯ ���� �״�� ����
				break;
			}
			System.out.println("������ �ٽ� �Է��ϼ���. (M �Ǵ� F) : ");
		}

		int age;
		String id = null;

		while (true) {
			System.out.print("���� : ");
			int a = sc.nextInt();
			sc.nextLine();

			if (a < 0) {
				System.out.println("���ڷ� �Է��ϼ���.");
				continue;
			}

			age = a;
			break;
		}

		mc.insertMember(id, name, password, email, gender, age);
		System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");

		// ȸ�� ��ϵ� ���� ���
		String info = mc.searchId(id);
		if (info != null) {
			System.out.println("��ϵ� ȸ�� ���� : " + info);
		}

	}
      /*public boolean checkId(String inputId) {
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
		
	}*/
	// �˻� �޴� ��� �޼ҵ�
	public void searchMember() {
		while (true) {
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸������� �˻��ϱ�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ : ");

			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:	searchId();	break;
			case 2:	searchName(); break;
			case 3:	searchEmail(); break;
			case 9:	System.out.println("�������� ���ư��ϴ�.");
				    return;
			default:System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				    return;
			}

		}
	}

	// ���̵� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	// searchId():void
	public void searchId() {

		System.out.println("�˻��� ���̵� �Է����ּ��� : ");
		String id = sc.nextLine();

		String res = mc.searchId(id);

		if (res == null) {
			System.out.println("�˻� ����� �����ϴ�.");
			return;
		} else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(res);
		}

	}

	// �̸� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	// searchName():void
	public void searchName() {

		System.out.print("�˻��� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine().trim();

		Member[] res = mc.searchName(name);

		int cnt = 0;
		for (int i = 0; i < res.length; i++) {
			if (res[i] != null) {
				if (cnt == 0)
					System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
				System.out.println(res[i].information());
				cnt++;
			}
		}
		if (cnt == 0)
			System.out.println("�˻� ����� �����ϴ�.");
	}

	// �̸��� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	// searchEmail():void
	public void searchEmail() {

		System.out.print("�˻��� �̸����� �Է����ּ��� : ");
		String email = sc.nextLine();

		Member[] res = mc.searchEmail(email);

		int cnt = 0;
		for (int i = 0; i < res.length; i++) {
			if (res[i] != null) {
				if (cnt == 0)
					System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
				System.out.println(res[i].information());
				cnt++;
			}
		}
		if (cnt == 0)
			System.out.println("�˻� ����� �����ϴ�.");
	}

	// ���� �޴� ��� �޼ҵ�
	// updateMember():void
	public void updateMember() {
		while (true) {
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��� �����ϱ�");
			System.out.println("9. �������� ���ư���");

			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1: updatePassword(); return;
			case 2:	updateName();     return;
			case 3:	updateEmail();    return;
			case 9:	System.out.println("�������� ���ư���");   return;
			default:System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
			}
		}
	}

	// ��й�ȣ ������ ���� �����͸� ����ڿ��� �Է¹޴� �޼ҵ�
	// updatePassword():void
	public void updatePassword() {

		// ���̵� �Է�
		System.out.print("���̵� �Է��ϼ��� > ");
		String userId = sc.nextLine();
		
		System.out.print("���� ��й�ȣ�� �Է��ϼ��� > ");
		String userPw = sc.nextLine();
		
		System.out.print("�� ��й�ȣ�� �Է��ϼ��� > ");
		String newPassword = sc.nextLine();
		
		boolean result = mc.updatePassword(userId, userPw, newPassword);
		
		if(result) {
			System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
		} else {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");
			System.out.println("�Է°��� �ٽ� Ȯ�����ּ���.");
		}
		
		/*System.out.println("���̵� �Է����ּ��� :  ");
		String id = sc.nextLine();

		// ���̵� ���� Ȯ��
		String bfId = mc.searchId(id);
		if (bfId == null) {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			return;
		}

		// ���� ��й�ȣ �Է�
		System.out.println("�ٲ� ��й�ȣ�� �Է����ּ��� :  ");
		String pwd = sc.nextLine();

		// ������Ʈ
		boolean ok = mc.updatePassword(id, pwd);

		if (ok) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");

			// ��� Ȯ��
			String afId = mc.searchId(id);
			if (afId != null) {
				System.out.println(afId);
			}
		} else {
			System.out.println("���� ����!");
			return;
		} */

	}

	// �̸� ������ ���� �����͸� ����ڿ��� �Է¹޴� �޼ҵ�
	// updateName():void
	public void updateName() {

		System.out.println("���̵� �Է����ּ��� : ");
		String id = sc.nextLine();

		String bfId = mc.searchId(id);
		if (bfId == null) {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			return;
		}

		System.out.println("�ٲ� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine();

		boolean ok = mc.updateName(id, name);
		if (ok) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");

			String afId = mc.searchId(id);
			if (afId != null) {
				System.out.println(afId);
			}

		} else {
			System.out.println("���� ����!");
			return;
		}

	}

	// �̸��� ������ ���� �����͸� ����ڿ��� �Է¹޴� �޼ҵ�
	// updateEmail():void
	public void updateEmail() {

		// ���̵� �Է�
		System.out.println("���̵� �Է����ּ��� : ");
		String id = sc.nextLine();

		// ���̵� ���� Ȯ��
		String bfId = mc.searchId(id);
		if (bfId == null) {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}

		// ���� �̸��� �Է�
		System.out.println("�ٲ� �̸����� �Է����ּ��� : ");
		String email = sc.nextLine();

		boolean ok = mc.updateEmail(id, email);

		if (ok) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");

			// ��� Ȯ��
			String afId = mc.searchId(id);
			if (afId != null) {
				System.out.println(afId);
			}

		} else {
			System.out.println("���� ����!");
			return;
		}

	}

	// ���� �޴� ��� �޼ҵ�
	// deleteMember():void
	public void deleteMember() {

		System.out.println("ȸ�� ���� �����Դϴ�.");
		
		System.out.print("�����Ͻ� ȸ���� ���̵� �Է����ּ��� > ");
		String userId = sc.nextLine();
		
		
		System.out.print("�����Ͻ� ȸ���� ��й�ȣ�� �Է����ּ��� > ");
		String userPwd = sc.nextLine();
		
		int result = mc.deleteMember(userId, userPwd);
		
		if(result > 0) {
			System.out.println("���� �Ϸ�");
		} else {
			System.out.println("�׷� ȸ���� �����");
		}
		
		
		
		
		
		/*while (true) {
			System.out.println("1. Ư�� ȸ�� �����ϱ�");
			System.out.println("2. ��� ȸ�� �����ϱ�");
			System.out.println("9. �������� ���ư���");

			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1: deleteOne(); return;
			case 2:
				deleteAll();
				return;
			case 9:
				System.out.println("�������� �������ϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}
		}
        */
	}

	// �ϳ��� ȸ�� ���� ����� ����ϴ� �޼ҵ�
	// deleteOne():void
	public void deleteOne() {

		System.out.println("���̵� �����Ͻðڽ��ϱ�? (Y / N) > ");
		String id = sc.nextLine();

		boolean ok = mc.delete(id);

		if (id.equals("Y") || id.equals("y")) {
			if (!ok) {
				System.out.println("���������� �����Ͽ����ϴ�.");
				return;
			} else {
				System.out.println("���������� �����Ͽ����ϴ�.");
				return;
			}

		}

	}

	// ��ü ȸ�� ���� ����� ����ϴ� �޼ҵ�
	// deleteAll():void
	public void deleteAll() {

		System.out.println("���� �����Ͻðڽ��ϱ�? (Y / N) > ");
		String id = sc.nextLine();

		boolean ok = mc.delete(id);

		if (id.equals("Y") || id.equals("y")) {
			if (!ok) {
				System.out.println("���������� �����Ͽ����ϴ�.");
				return;
			}
		} else {
			System.out.println("�ٽ� �������ּ���");
			return;
		}
	}

	// ��ü ȸ���� ����ϴ� �޼ҵ�
	// printAll():void
	public void printAll() {

		System.out.println();
		System.out.println("ȸ�� ���� ��ȸ �����Դϴ�.");
		
		Member[] members = mc.printAll();
		int count = mc.existMemberNum();
		System.out.println("��" + count + "���� ȸ���� �����մϴ�.");
		
		if(count > 0) {
			for(int i = 0; i < members.length; i ++) {
				if(members[i] != null) {
					System.out.println("���̵� : " + members[i].getId());
					System.out.println("��й�ȣ : " + members[i].getPassword());
					System.out.println("�Ƹ� : " + members[i].getName());
					System.out.println("�̸��� : " + members[i].getEmail());
				}
			}
		} else {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		}
		
		/*Member[] arr = mc.printAll();

		int cnt = mc.existMemberNum();

		if (cnt == 0) {
			System.out.println("����� ȸ���� �����ϴ�.");
			return;
		}

		System.out.println("========= ����� ȸ�� ��� =========");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i].information());
			}
		}*/

	}
}
