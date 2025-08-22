package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.model.vo.Book;
import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();

	public void mainMenu() {

		while (true) {
			System.out.println();
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("7. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력 하였습니다. 다시 입력해주세요.");
			}

		}

	}

	public void addList() {

		System.out.println();
		System.out.println("***** 마지막 위치에 곡 추가 *****");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();

		mc.addList(title, singer);

		System.out.println("추가 성공"); // 실패 추가 해야함

	}

	public void addAtZero() {

		System.out.println();
		System.out.println("***** 첫 위치에 곡 추가 *****");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();

		mc.addAtZero(title, singer);

		System.out.println("추가 성공"); // 실패시 출력 추가

	}

	public void printAll() {

		System.out.println();
		System.out.println("===== 전체 곡 목록 출력 =====");
		List<Music> musicList = mc.printAll();

		if (musicList.isEmpty()) {
			System.out.println("존재하는 곡이 없습니다.");
		} else {

			for (Music m : musicList) {
				System.out.println("곡 명 : " + m.getTitle() + ", 가수 명 : " + m.getSinger());
			}
		}

	}

	public void searchMusic() {

		System.out.println();

		System.out.println("=====특정 곡 검색 =====");
		System.out.print("검색할 곡 명 : ");
		String keyword = sc.nextLine();

		List<Music> searched = mc.searchMusic(keyword);

		if (searched.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {

			System.out.println("조회 결과가 총 " + searched.size() + "건 존재합니다.");

			for (Music m : searched) {
				System.out.println("============================");
				System.out.println("곡 명 : " + m.getTitle() + ", 가수 명 : " + m.getSinger());

			}

		}

	}

	public void removeMusic() {

		System.out.println();
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		System.out.println();
		System.out.print("삭제할 곡의 가수명 : ");
		String singer = sc.nextLine();
		System.out.println();

		int count = mc.removeMusic(title, singer);

		if (count > 0) {
			System.out.println(singer + "의 노래 " + title + "가 삭제되었습니다.");
		} else {
			System.out.println("삭제할 곡이 없습니다.");
		}
		System.out.println();

	}

	public void setMusic() {

		System.out.println("===== 특정 곡 수정 =====");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();

		System.out.print("수정할 곡 명 : ");
		String newTitle = sc.nextLine();

		System.out.print("수정할 가수 명 : ");
		String newSinger = sc.nextLine();

		boolean result = mc.setMusic(title, newTitle, newSinger);

		if (result) {
			System.out.println(title + "가(이) [곡명 :" + newTitle + ", 가수 명 : " + newSinger + "] 으로 변경되었습니다."  );
		} else {
			System.out.println("수정할 곡이 없습니다.");
		}

		System.out.println();

	}

}
