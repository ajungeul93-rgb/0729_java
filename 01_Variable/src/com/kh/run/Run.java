package com.kh.run;

import com.kh.variable.B_keyboardInput;
import com.kh.variable.Casting;

public class Run {
	
	public static void main(String[] args) {
		
		// �ܺ� Ŭ������ �����ϴ� �޼ҵ� ȣ���ϰ� �ʹ�.
		
		// Ŭ�����̸� Ŭ������Ī = new Ŭ�����̸�();
		
		com.kh.variable.A_Variable a = new com.kh.variable.A_Variable();
		// a.findSeasonMenu();
		// a.declareVariable();
		
		// com.kh.variable.B_keyboardInput b = new com.kh.variable.B_keyboardInput();
		B_keyboardInput b = new B_keyboardInput();
		//b.inputTest();
		Casting c = new Casting();
		//c. autoCasting();
		c.forceCasting();
	}

}
