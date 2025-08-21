package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	/*
	 * CheckedException
	 * 
	 * ���������� �ݵ�� ����ó���� �ؾ��ϴ� ���ܵ�
	 * => �ַ� �ܺ� ��ü ��/��� ��
	 * 
	 */
	public void method1() throws IOException {
		// ����ڿ��� ���ڿ��� �ϳ� �Է¹޾Ƽ�
		// �Է¹��� ���ڿ��� ���̸� ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		/* ��� 1. try ~ catch���� �ۼ��Ѵ�.
		try {
		   str = br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(str.length());
		*/
		// ��� 2. throws : �ڵ� �ۼ��� ���� �޼ҵ带 ȣ���ϴ� �κ����� ����ó���� ����
		str = br.readLine();
		System.out.println(str.length());
	}

}
