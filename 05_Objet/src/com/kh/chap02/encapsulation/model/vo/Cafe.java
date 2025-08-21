package com.kh.chap02.encapsulation.model.vo;


// �ʵ��, �����ں�, �޼ҵ��
public class Cafe {
	
	// �ʵ�(Field)��
	/*
	 * ��ü�� ���� �� �ִ� �Ӽ�
	 * 
	 * ����(Data)�� ��� �κ�
	 * 
	 * �ʵ� == �������
	 * 
	 * ���������� �ڷ��� �ʵ�ĺ���;
	 */
	private String name;
	private String address;
	private String signatureMenu;
	private int signatureMenuPrice;
	
	// ������(Constructor)��
	// �޼ҵ�(Method)��
	/*
	 * ���(method)�� �����ϴ� �κ�
	 * 
	 * ���������� (�����) ��ȯ�� �޼ҵ�ĺ���(�Ű�����) {
	 *      �޼ҵ� ȣ�� �� ������ �ڵ�;
	 * }
	 * 
	 * ���������� : ȣ���� �� �ִ� ������ ������ �� ����
	 * ��ȯ��   : void => return �� �� ������ ���� ����
	 *          ��ȯ �� ������� �ڷ����� ������ش�.
	 * �Ű�����  : �޼ҵ� ȣ�� �� ���� ���� �޾��ִ� ����
	 *          �޼ҵ� ���������� ��밡��. ���� ����         
	 * 
	 */
	
	public void open() {
		dishWash();
		cleaning();
		windowCleaning();
	}
	
	private void dishWash() {
		System.out.println("�����ϰ� ����!!");
	}
	private void cleaning() {
		System.out.println("û�ҵ� ����!!");
	}
	private void windowCleaning() {
		System.out.println("������ ����!!");
	}
	
	// �����͸� ��� �� �����ϴ� ����� �޼ҵ� : setter()
	
	/*
	 * DTO -> setter�� �������
	 * VO  -> �Ϲ������� setter�޼ҵ带 �������� ����
	 * 
	 * DTO�� 2�޵ڿ� ���ǵ� DTO�н� �������� VOŬ������ setter�� �����ؼ� ���
	 * 
	 * stter����� ��Ģ
	 * 
	 * 1. setter�޼ҵ�� �ܺο��� ������ �����ؾ� �ϱ� ������ ���������� public�� �̿�
	 * 2. set�ʵ������ �ĺ��ڸ� �ۼ��ϸ� ��Ÿ��ǥ���(camelCase)�� �� ��Ű���� �Ѵ�.
	 * 
	 * 3. (���ܻ�Ȳ) �츮�� ��а� �׻� ��� �ʵ忡 ���ؼ� setter�� �����մϴ�..
	 * 
	 */
	
	// �����޴��� ���������� ��� �� ������ �� �ִ� �޼ҵ�
	// signatureMenuPrice
	public void setSignatureMenuPrice(int signatureMenuPrice) {
		
		//System.out.println("setter���� ���� ���� ���� �� : " +
		//                   signatureMenuPrice);
		
		//signatureMenuPrice = signatureMenuPrice;
		// Scope�ȿ����� �ش� �����ȿ� �ִ� ���������� ���� �켱���� ����
		//System.out.println("�� �ּҰ� ����? > " + this);
		// this : �ش� ��ü�� �ּҰ��� ����Ű�� ����
		if(signatureMenuPrice <= 1000) {
			System.out.println("���������� ���� ���� �Է��ϼ̽��ϴ�. 1000 �̻��� ������ �Է��ϼ���.");
		} else {		
		this.signatureMenuPrice = signatureMenuPrice;
		}
		//System.out.println("�Է��Ͻ� �ñ״��� �޴� ����: " + signatureMenuPrice);
	}
	
	// name�ʵ带 ��� �� ������ �� �ִ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	// adderss�ʵ带 ��� �� ������ �� �ִ� �޼ҵ�
	public void setAdderss(String adderss) {
		this.address = adderss;		
	}
	
	/*
	 * ���� ���� : �� �� �̻��� �ʵ尪�� �����ϴ� �޼ҵ�� set�� ������ xxx (���� ����)
	public void setNameAndAddress(String name, String address) {
		setName(name);
		setAddress(address);
	}
	*/
	
	// �����͸� ��ȯ���ִ� ����� �޼ҵ� : getter()
	
	/*
	 * ��Ģ!
	 * 
	 * 1. getter()�� ���������� pubilc�� ����Ѵ�.
	 * 2. get�ʵ������ ����, ��Ÿ��ǥ���(camelCase)�� ����Ѵ�.
	 * 3. ��� �ʵ忡 ���ؼ� �ݵ�� ������ �� �� ����� ������ּ���!
	 */
	
	// �޼ҵ带 ȣ���� ������ name�ʵ尪�� �����ְ� ����
	public String getName() {
		return name;
	}
	
	// �ּ����� ��ȯ���ִ� �޼ҵ�
	public String getAddress() {
		return address;
		// return value;
		// value�� �޼ҵ� ȣ�� �κ����� ��ȯ�ϰڴ�.
		// �޼ҵ��� ��ȯ���� ��ȯ�ϰ��� �ϴ� ���� �ڷ����� ��ġ�ϴ°��� �� �� Ȯ���ؾ���
	}
	
	public int getSignatureMenuPrice() {
		return signatureMenuPrice;
	}
	
	// getter() / setter() �Ѵ� ������� ==> ĸ��ȭ�� ����(�������� ����)
	/*
	 * 1. ���� ����� => �ʵ��� ���������ڸ� public��� private�� �����Ѵ�.
	 * 2. �޼ҵ带 ���� �ʵ忡 ������ �� �ֵ��� ������ش� => getter() / setter() ����
	 * 
	 * �����͸� ���� -> ��ü���� ���յ��� ���� -> å���� �и���Ų��.
	 */
	
	// ��� �ʵ� ���� Ȯ���� �� �ֵ��� ��ȯ���ִ� �޼ҵ�
	
	public String info() {
		
		// name, address, signatureMenuPrice
		// return name, address, signatureMenuPrice;
		// return �� �� ��ȯ�� �� �ִ� �� �� �Ѱ� (public (string or int) name(){})
		String info = "[name �ʵ尪 : " + name + ", address �ʵ尪 : " + address
				   + ", signatureMenuPrice : " + signatureMenuPrice + "]";
		return info;
	}

}
