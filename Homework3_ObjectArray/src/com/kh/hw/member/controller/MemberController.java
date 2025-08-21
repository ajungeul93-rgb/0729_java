package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	// 현재 존재하는 멤버 수 변환
	private Member[] m = new Member[SIZE];
	public static final int SIZE =10;
	
    // static 블럭 클래스가 올라갈때 한번만 실행
	static{}
	
	// 초기화 블럭
	{   
		m[0] = new Member("admin", "관리자", "aa", "aaa@aaa.aaa", 'F', 33);
	}
	// 아이디 중복확인 하는 메소드
	// pbilc void checkId(input:String)boolaen
	public MemberController() {
	}

	public int existMemberNum() {
		
		//int count = 0;
		
		//if(m[0] != null) count++; 1번째
		//          ~
		
		int cnt = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				cnt++;
			}
		}
		return cnt;
	}

	public boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(inputId))
				return true;
		}
		return false;
	}

	// Member객체를 객체배열에 저장하는 메소드
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for (int i = 0; i < m.length; i++) {
			m[i] = new Member(id, name, password, email, gender, age);
			return;
		}
	}

	private int indexOfId(String id) {
		if (id == null)
			return -1;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && id.equals(m[i].getId())) {
				return i;
			}
		}
		return -1;
	}

	// id로 회원을 조회하는 메소드
	// searchId(String id) String
	public String searchId(String id) {
		if (id == null || id.trim().isEmpty()) {
			return null;
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				return m[i].information();
			}
		}
		return null;
	}

	// 이름으로 회원을 조회하는 메소드
	// searchName(String name):Member[]

	public Member[] searchName(String name) {
		if (name == null || name.trim().isEmpty()) {
			return new Member[0];
		}
		Member[] tmp = new Member[m.length];
		int idx = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && name.equals(m[i].getName())) {
				tmp[idx++] = m[i];
			}
		}
		return tmp;
	}

	// 이메일로 회원을 조회하는 메소드
	// searchEmail(String email):Meber[]
	public Member[] searchEmail(String email) {
		if (email == null || email.trim().isEmpty()) {
			return new Member[0];
		}

		Member[] tmp = new Member[m.length];
		int idx = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && email.equals(m[i].getEmail())) {
				tmp[idx++] = m[i];
			}
		}
		return tmp;
	}

	// 비밀번호 변경 메소드
	// updatePassword(String id, String password):boolean
	public boolean updatePassword(String userId, String userPw, String newPassword) {
		
		for(int i = 0; i < m.length; i ++) {
		if(m[0] != null && m[0].getId().equals(userId) && m[0].getPassword().equals(userPw)) {
			m[0].setPassword(newPassword);
			return true;
		   }
		}
		
		return false;
		
		/*if (id == null && id.trim().isEmpty()) {
			return false;
		}

		if (password == null && password.trim().isEmpty()) {
			return false;
		}

		int idx = indexOfId(id);

		if (idx == -1) {
			return false;
		}

		m[idx].setPassword(password);

		return true;*/

	}

	// 이름 변경 메소드
	// updateName(String id, String name):boolean
	public boolean updateName(String id, String name) {

		if (id == null && id.trim().isEmpty()) {
			return false;
		}

		if (name == null && name.trim().isEmpty()) {
			return false;
		}

		int idx = indexOfId(id);

		if (idx == -1) {
			return false;
		}
		// id x

		m[idx].setName(name);

		return true;
	}

	// 이메일 변경 메소드
	// updateEmail(String id, String email):boolean
	public boolean updateEmail(String id, String email) {

		if (id == null && id.trim().isEmpty()) {
			return false;
		}

		if (email == null && email.trim().isEmpty()) {
			return false;
		}

		int idx = indexOfId(id);

		m[idx].setEmail(email);

		return true;

	}

	// 한 회원만 삭제하는 메소드
	// delete():void
	public int deleteMember(String userId, String userPwd) {
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(userId) && m[i].getPassword().equals(userPwd)) {
				m[i] = null;
				return 1;
			}
		}
		return 0;
	}
	
	public boolean delete(String id) {

		if (id == null || id.trim().isEmpty()) {
			return false;
		}

		int idx = indexOfId(id);
		if (idx == -1) {
			return false;
		}

		m[idx] = null;

		for (int i = idx; i < m.length - 1; i++) {
			m[i] = m[i + 1];
		}

		m[m.length - 1] = null;

		return true;
	}

	// 전체 회원을 삭제하는 메소드
	// delete():void
	public void delete() {
		for (int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}

	// Member객체 반환 메소드
	// prinAll():Member[]
	public Member[] printAll() {
		return m;
	}

}
