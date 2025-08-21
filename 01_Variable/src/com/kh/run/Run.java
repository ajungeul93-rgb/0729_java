package com.kh.run;

import com.kh.variable.B_keyboardInput;
import com.kh.variable.Casting;

public class Run {
	
	public static void main(String[] args) {
		
		// 외부 클래스에 존재하는 메소드 호출하고 싶다.
		
		// 클래스이름 클래스별칭 = new 클래스이름();
		
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
