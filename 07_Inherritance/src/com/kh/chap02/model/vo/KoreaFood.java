package com.kh.chap02.model.vo;

//           [�ڽ�Ŭ����]  [��� Ű����] [�θ�Ŭ����]
//            ����Ŭ����               ����Ŭ����    
//            ����Ŭ����               ����Ŭ����
//            �ļ�Ŭ����               ����Ŭ����
//            �Ļ�Ŭ����               Ȯ��Ŭ����
public class KoreaFood   extends     Food {
	// �ʵ��
	// foodName, material, cookingTime, spicy
	// [     Food Ŭ������ ������ ����      ]
	private int spicy;
	
	// �����ں�
	public KoreaFood() {
		super(); //= Food(); / super : �θ�ü�� �ּҰ��� �ǹ��ϴ� Ű����
//       ====   ������	=====	
		System.out.println("�� �ڽ�");
	}
	
	
	// �޼ҵ��
	// getter
	public int getSpicy() {
		return spicy;
	}
	// setter
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	
	

}
