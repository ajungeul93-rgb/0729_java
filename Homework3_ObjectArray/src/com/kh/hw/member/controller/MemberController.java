package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	// ���� �����ϴ� ��� �� ��ȯ
	private Member[] m = new Member[SIZE];
	public static final int SIZE =10;
	
    // static �� Ŭ������ �ö󰥶� �ѹ��� ����
	static{}
	
	// �ʱ�ȭ ��
	{   
		m[0] = new Member("admin", "������", "aa", "aaa@aaa.aaa", 'F', 33);
	}
	// ���̵� �ߺ�Ȯ�� �ϴ� �޼ҵ�
	// pbilc void checkId(input:String)boolaen
	public MemberController() {
	}

	public int existMemberNum() {
		
		//int count = 0;
		
		//if(m[0] != null) count++; 1��°
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

	// Member��ü�� ��ü�迭�� �����ϴ� �޼ҵ�
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

	// id�� ȸ���� ��ȸ�ϴ� �޼ҵ�
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

	// �̸����� ȸ���� ��ȸ�ϴ� �޼ҵ�
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

	// �̸��Ϸ� ȸ���� ��ȸ�ϴ� �޼ҵ�
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

	// ��й�ȣ ���� �޼ҵ�
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

	// �̸� ���� �޼ҵ�
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

	// �̸��� ���� �޼ҵ�
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

	// �� ȸ���� �����ϴ� �޼ҵ�
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

	// ��ü ȸ���� �����ϴ� �޼ҵ�
	// delete():void
	public void delete() {
		for (int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}

	// Member��ü ��ȯ �޼ҵ�
	// prinAll():Member[]
	public Member[] printAll() {
		return m;
	}

}
