package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	// 기본 생성자
	public MemberMenu() {
	}

	// 메인메뉴 출력 메소드
	public void mainMenu() {

		while (true) {
			int max = mc.printAll().length; // 현재 등록 가능한 회원 수
			int cnt = mc.existMemberNum(); // 현재 등록 회원 수

			System.out.println("최대 등록 가능한 회원수는 10명입니다.");
			System.out.println("현재 등록 가능한 회원 수는 " + max + "명 입니다.");
			System.out.println("현재 등록된 회원 수는 " + cnt + "명 입니다.");

			/*
			if (cnt !=10) {
				System.out.println("1. 새 회원등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			*/
			if (cnt >= max) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");

				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
			} else {
				// 전체 메뉴
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
			}

			System.out.println("메뉴 번호 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:	insertMember();	break;
			case 2:	searchMember();	break;
			case 3:	updateMember();	break;
			case 4:	deleteMember();	break;
			case 5:	printAll();		break;
			case 9:	System.out.println("프로그램을 종료합니다:) ");
				    return;
			default:System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}


	// 회원등록하기 위한 데이터를 사용자에게 입력 받는 메소드
	public void insertMember() {

		//String id = null;

		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			if (id.isEmpty()) {
				System.out.println("아이디를 입력하세요.");
				continue;
			}

			if (mc.checkId(id)) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.print("비밀번호 : ");
		String password = sc.nextLine();

		System.out.print("이메일 : ");
		String email = sc.nextLine();

		char gender;

		while (true) {
			System.out.print("성별 (M/F) : ");
			char g = sc.nextLine().charAt(0);

			if (g == 'M' || g == 'm' || g == 'F' || g == 'f') {
				gender = g; // 변환 없이 그대로 저장
				break;
			}
			System.out.println("성별을 다시 입력하세요. (M 또는 F) : ");
		}

		int age;
		String id = null;

		while (true) {
			System.out.print("나이 : ");
			int a = sc.nextInt();
			sc.nextLine();

			if (a < 0) {
				System.out.println("숫자로 입력하세요.");
				continue;
			}

			age = a;
			break;
		}

		mc.insertMember(id, name, password, email, gender, age);
		System.out.println("회원 등록이 완료되었습니다.");

		// 회원 등록된 정보 출력
		String info = mc.searchId(id);
		if (info != null) {
			System.out.println("등록된 회원 정보 : " + info);
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
	// 검색 메뉴 출력 메소드
	public void searchMember() {
		while (true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일으로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");

			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:	searchId();	break;
			case 2:	searchName(); break;
			case 3:	searchEmail(); break;
			case 9:	System.out.println("메인으로 돌아갑니다.");
				    return;
			default:System.out.println("잘못 입력하셨습니다.");
				    return;
			}

		}
	}

	// 아이디 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	// searchId():void
	public void searchId() {

		System.out.println("검색할 아이디를 입력해주세요 : ");
		String id = sc.nextLine();

		String res = mc.searchId(id);

		if (res == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(res);
		}

	}

	// 이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	// searchName():void
	public void searchName() {

		System.out.print("검색할 이름을 입력해주세요 : ");
		String name = sc.nextLine().trim();

		Member[] res = mc.searchName(name);

		int cnt = 0;
		for (int i = 0; i < res.length; i++) {
			if (res[i] != null) {
				if (cnt == 0)
					System.out.println("찾으신 회원 조회 결과입니다.");
				System.out.println(res[i].information());
				cnt++;
			}
		}
		if (cnt == 0)
			System.out.println("검색 결과가 없습니다.");
	}

	// 이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	// searchEmail():void
	public void searchEmail() {

		System.out.print("검색할 이메일을 입력해주세요 : ");
		String email = sc.nextLine();

		Member[] res = mc.searchEmail(email);

		int cnt = 0;
		for (int i = 0; i < res.length; i++) {
			if (res[i] != null) {
				if (cnt == 0)
					System.out.println("찾으신 회원 조회 결과입니다.");
				System.out.println(res[i].information());
				cnt++;
			}
		}
		if (cnt == 0)
			System.out.println("검색 결과가 없습니다.");
	}

	// 수정 메뉴 출력 메소드
	// updateMember():void
	public void updateMember() {
		while (true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");

			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1: updatePassword(); return;
			case 2:	updateName();     return;
			case 3:	updateEmail();    return;
			case 9:	System.out.println("메인으로 돌아가기");   return;
			default:System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}

	// 비밀번호 수정을 위한 데이터를 사용자에게 입력받는 메소드
	// updatePassword():void
	public void updatePassword() {

		// 아이디 입력
		System.out.print("아이디를 입력하세요 > ");
		String userId = sc.nextLine();
		
		System.out.print("기존 비밀번호를 입력하세요 > ");
		String userPw = sc.nextLine();
		
		System.out.print("새 비밀번호를 입력하세요 > ");
		String newPassword = sc.nextLine();
		
		boolean result = mc.updatePassword(userId, userPw, newPassword);
		
		if(result) {
			System.out.println("비밀번호가 변경되었습니다.");
		} else {
			System.out.println("비밀번호 변경에 실패했습니다.");
			System.out.println("입력값을 다시 확인해주세요.");
		}
		
		/*System.out.println("아이디를 입력해주세요 :  ");
		String id = sc.nextLine();

		// 아이디 존재 확인
		String bfId = mc.searchId(id);
		if (bfId == null) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}

		// 변경 비밀번호 입력
		System.out.println("바꿀 비밀번호를 입력해주세요 :  ");
		String pwd = sc.nextLine();

		// 업데이트
		boolean ok = mc.updatePassword(id, pwd);

		if (ok) {
			System.out.println("수정이 성공적으로 되었습니다.");

			// 결과 확인
			String afId = mc.searchId(id);
			if (afId != null) {
				System.out.println(afId);
			}
		} else {
			System.out.println("수정 실패!");
			return;
		} */

	}

	// 이름 수정을 위한 데이터를 사용자에게 입력받는 메소드
	// updateName():void
	public void updateName() {

		System.out.println("아이디를 입력해주세요 : ");
		String id = sc.nextLine();

		String bfId = mc.searchId(id);
		if (bfId == null) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}

		System.out.println("바꿀 이름을 입력해주세요 : ");
		String name = sc.nextLine();

		boolean ok = mc.updateName(id, name);
		if (ok) {
			System.out.println("수정이 성공적으로 되었습니다.");

			String afId = mc.searchId(id);
			if (afId != null) {
				System.out.println(afId);
			}

		} else {
			System.out.println("수정 실패!");
			return;
		}

	}

	// 이메일 수정을 위한 데이터를 사용자에게 입력받는 메소드
	// updateEmail():void
	public void updateEmail() {

		// 아이디 입력
		System.out.println("아이디를 입력해주세요 : ");
		String id = sc.nextLine();

		// 아이디 존재 확인
		String bfId = mc.searchId(id);
		if (bfId == null) {
			System.out.println("존재하지 않는 아이디입니다.");
		}

		// 변경 이메일 입력
		System.out.println("바꿀 이메일을 입력해주세요 : ");
		String email = sc.nextLine();

		boolean ok = mc.updateEmail(id, email);

		if (ok) {
			System.out.println("수정이 성공적으로 되었습니다.");

			// 결과 확인
			String afId = mc.searchId(id);
			if (afId != null) {
				System.out.println(afId);
			}

		} else {
			System.out.println("수정 실패!");
			return;
		}

	}

	// 삭제 메뉴 출력 메소드
	// deleteMember():void
	public void deleteMember() {

		System.out.println("회원 삭제 서비스입니다.");
		
		System.out.print("삭제하실 회원의 아이디를 입력해주세요 > ");
		String userId = sc.nextLine();
		
		
		System.out.print("삭제하실 회원의 비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();
		
		int result = mc.deleteMember(userId, userPwd);
		
		if(result > 0) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("그런 회원은 없어요");
		}
		
		
		
		
		
		/*while (true) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");

			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1: deleteOne(); return;
			case 2:
				deleteAll();
				return;
			case 9:
				System.out.println("메인으로 돌가갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
        */
	}

	// 하나의 회원 삭제 결과를 출력하는 메소드
	// deleteOne():void
	public void deleteOne() {

		System.out.println("아이디를 삭제하시겠습니까? (Y / N) > ");
		String id = sc.nextLine();

		boolean ok = mc.delete(id);

		if (id.equals("Y") || id.equals("y")) {
			if (!ok) {
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			} else {
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			}

		}

	}

	// 전체 회원 삭제 결과를 출력하는 메소드
	// deleteAll():void
	public void deleteAll() {

		System.out.println("정말 삭제하시겠습니까? (Y / N) > ");
		String id = sc.nextLine();

		boolean ok = mc.delete(id);

		if (id.equals("Y") || id.equals("y")) {
			if (!ok) {
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			}
		} else {
			System.out.println("다시 선택해주세요");
			return;
		}
	}

	// 젠체 회원을 출력하는 메소드
	// printAll():void
	public void printAll() {

		System.out.println();
		System.out.println("회원 전제 조회 서비스입니다.");
		
		Member[] members = mc.printAll();
		int count = mc.existMemberNum();
		System.out.println("총" + count + "명의 회원이 존재합니다.");
		
		if(count > 0) {
			for(int i = 0; i < members.length; i ++) {
				if(members[i] != null) {
					System.out.println("아이디 : " + members[i].getId());
					System.out.println("비밀번호 : " + members[i].getPassword());
					System.out.println("아름 : " + members[i].getName());
					System.out.println("이메일 : " + members[i].getEmail());
				}
			}
		} else {
			System.out.println("회원이 존재하지 않습니다.");
		}
		
		/*Member[] arr = mc.printAll();

		int cnt = mc.existMemberNum();

		if (cnt == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}

		System.out.println("========= 저장된 회원 목록 =========");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i].information());
			}
		}*/

	}
}
