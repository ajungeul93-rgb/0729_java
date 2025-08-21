package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	// ����(Variable)
	// ������?
	// �޸�(RAM) ������ DATE(VALUE)���� �����ϴ� ����

	// ������ Ư¡
	//
	// 1. ������ �ĺ��ڸ� ������.
	// 2. ������ ���ο� ���� �����ؼ� ����� �� �ִ�.
	// 3. �ڷ����� �������ִ�.
	// 4. ���������� ��� �޸��� Stack������ �ö󰣴�.
	// 5. **�ϳ��� ������������ �ϳ��� ���� ���Ե� �� �ִ�.**
	// 6. �ʱ�ȭ�� �ؾ߸� ����� �����ϴ�.
	// 7. �ʱ�ȭ�� �� ���� �����ϴ�.
	// 8. �ڷ��������� ��ȯ�� �����ϴ�.
	// 9. �ڷ��������� ��ȯ�� �����ϴ�.
	// 10. ����� Scope�ȿ����� ����� �����ϴ�.
	// 11. �������� ���굵 �����ϴ�.

	/*
	 * �迭(Array) : �ϳ��� �迭�� ���� ���� ���� ���� �� ���� ��, "���� �ڷ����� ����"�� ���� �� ���� ����
	 * ����(homogeneous collection)�̶�� ��
	 * 
	 * �ڹٶ�� ��� ��ü�� ����� '����'�� �ڷᱸ��
	 * 
	 * => �迭�� �� �ε����� ���� ���� ��� index�� '0'���� �����Ѵ�.
	 * 
	 */

	public void method1() {

		// ������ ���� 5���� �����ϰ� �ʱ�ȭ�� �����ؾ���!
		/*
		 * int num1 = 13; int num2 = 27; int num3 = 32; int num4 = 93; int num5 = 96;
		 * 
		 * int sum = num1 + num2 + num3 + num4 + num5;
		 * 
		 * for(int i = 1; i <= 5; i++) { sum += numi; } System.out.print(sum);
		 */

		// �迭

		// 1. �迭 ����

		/*
		 * ���� ���� ���
		 * 
		 * �ڷ��� �����ĺ���;
		 * 
		 * �迭 ���� ���
		 * 
		 * 1) �ڷ��� �迭�ĺ���[]; 2) �ڷ���[] �迭�ĺ���; --> �� ��� ���
		 */

		// ���� ����!
		// int num;

		// �迭 ����!
		// int[] nums;

		// int[] nums = 0;

		// 2. �迭 �Ҵ�

		/*
		 * �迭�� �� ���� ���� ���� �迭�� ũ�⸦ �����ִ� ���� ������ ������ŭ ���� �� ������ �Ҵ��
		 * 
		 * [ ǥ���� ]
		 * 
		 * int[] numbers; // �迭 ���� numbers = new int[5]; // �Ҵ�
		 * 
		 * int[] arr = new int[5]; // ����� ���ÿ� �Ҵ�
		 * 
		 * �迭�� ���� �ڷ����̴�.
		 */

		// int[] nums = new int[2];

		// nums��� ������ �迭�� �����ϰ� 5ĭ �Ҵ�޾ƺ���

		int[] nums;
		nums = new int[5]; // ���� �ڷ���

		// 3. �迭�� �� �ε����� �� ����
		/*
		 * [ ǥ���� ]
		 * 
		 * �迭�ĺ���[�ε���] = ��;
		 */

		nums[0] = 11;
		nums[1] = 12;
		nums[2] = 15;
		nums[3] = 22;
		nums[4] = 33;

		// System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// ���������� �츮�� �迭�� ����ؼ� ���� �� �ִ� ���� : �ݺ��� ��밡��

	}

	public void methodA() {

		// �迭�� �����غ���

		// 1. �迭���� �� �Ҵ�

		/*
		 * int i; int[] integers = new int[3]; // 0, 1, 2 //double[] doubles = new
		 * double[2]; // 0, 1
		 * 
		 * // �迭�ĺ���.length : �迭�� ũ��(����) => ���� System.out.println(integers.length);
		 * //System.out.println(doubles.length);
		 * 
		 * 
		 * //System.out.println(i); localvariable == �ʱ�ȭ�� �������� ������ ����� �� ���� i = 1;
		 * System.out.println(i); System.out.println(integers);
		 * System.out.println(integers[0]); integers[0] = 1;
		 */

		/*
		 * �⺻�ڷ��� : boolean, char, byte, short, int, long, float, double => ���� ������ ���� ����
		 * �ٷ� ���� �� ���� : (����)����
		 * 
		 * �����ڷ��� : boolean[], char[], byte[], int[] ... String => �ּҰ��� ��� �ִ� ���� : ����
		 * ����(���۷���)
		 */

		// ����, A������, B������, C������, �繫��
		/*
		 * String[] KH������������������; KH������������������ = new String[5];
		 * System.out.println("������ �ּ�: " + KH������������������);
		 * 
		 * KH������������������[0] = "����"; KH������������������[1] = "A������"; KH������������������[2] = "B������";
		 * KH������������������[3] = "C������"; KH������������������[4] = "�繫��";
		 * 
		 * // C������ ��� //System.out.println(KH������������������[3]);
		 * 
		 * System.out.println(KH������������������[0]); System.out.println(KH������������������[1]);
		 * System.out.println(KH������������������[2]); System.out.println(KH������������������[3]);
		 * System.out.println(KH������������������[4]);
		 * 
		 * System.out.println("-----�ݺ���-------");
		 * 
		 * for(int index = 0; index < 5; index++) {
		 * System.out.println(KH������������������[index]); }
		 */

		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2);

		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		System.out.println(numbers1 == numbers2);

		// �����ڷ��������� ==(����� ������) ��� ��
		// �ּҰ��� ���ϱ� ������ ���ϴ� ����� ���� �� ����
		// ���ڿ�.equals("���� ���ڿ�");

		// �ؽ��ڵ� : �ּҰ��� 10����(int����)���·� ��Ÿ�� ��
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
	}

	public void lotto() {

		// �ζǹ�ȣ ������ ver_0.2
		int[] lottoNumbers = new int[6]; // 0, 1, 2, 3, 4, 5
		lottoNumbers[0] = (int) (Math.random() * 45) + 1;
		lottoNumbers[1] = (int) (Math.random() * 45) + 1;
		lottoNumbers[2] = (int) (Math.random() * 45) + 1;
		lottoNumbers[3] = (int) (Math.random() * 45) + 1;
		lottoNumbers[4] = (int) (Math.random() * 45) + 1;
		lottoNumbers[5] = (int) (Math.random() * 45) + 1;

		for (int i = 0; i < 6; i++) {
			lottoNumbers[i] = (int) (Math.random() * 45) + 1;
		}

		// Arrats.toString(�迭�ĺ���)
		System.out.println(Arrays.toString(lottoNumbers));
	}

	public void methodB() {

		// 5���� ��Ҹ� ���� �� �ִ� String�� �迭�� ���� �� �Ҵ��Ͻÿ�.
		// ���� 5����

		// 1. �迭 ���� �� �Ҵ�
		String[] animals = new String[5];

		// 2. �迭 �ε����� ���� ����!
		animals[0] = "��ī";
		animals[1] = "��";
		animals[2] = "��Ÿ";
		animals[3] = "����";
		animals[4] = "ġŸ";
		// animals[5] = "����"; <-- ���������δ� ������ ����

		// 1. ;
		// 2. ��? �����̴� if
		// 3. ��? �հ�� sum

	}

	public void methodC() {

		// ����ڿ��� �� ���� ������ �Է¹޾Ƽ� �Է¹��� ���� �� �ּҰ� ���ϱ�

		// �� �������� �迭�� ������ ���� ����
		// 1. �� �� �̻��� ���� �ڷ����� ���� �ٷ� ��
		// 2. �ٷ� ���� ������ ��Ȯ�ϰ� ������ ���� ��

		// 1) ����ڷκ��� ���� �Է¹޾Ƽ� �迭�� �� �ε����� ����
		Scanner sc = new Scanner(System.in); // �Էµ���
		int[] nums = new int[3]; // �����

		// �迭�� �������α����� ������ ������ �����մϴ�.
		/*
		 * System.out.print("ù ��° ������ �Է����ּ���> "); nums[0] = sc.nextInt();
		 * System.out.println("nums��� �迭�� 0��° �ε����� ���Ե� ��: " + nums[0]);
		 * 
		 * System.out.print("�� ��° ������ �Է����ּ���> "); nums[1] = sc.nextInt();
		 * System.out.println("nums��� �迭�� 1��° �ε����� ���Ե� ��: " + nums[1]);
		 * 
		 * System.out.print("�� ��° ������ �Է����ּ���> "); nums[2] = sc.nextInt();
		 * System.out.println("nums��� �迭�� 2��° �ε����� ���Ե� ��: " + nums[2]);
		 */

		for (int i = 0; i < nums.length; i++) {
			System.out.print("������ �Է��ϼ���> ");
			nums[i] = sc.nextInt();
			System.out.println("nums��� �迭�� " + i + "�� ° �ε��� ��: " + nums[i]);
		}

		System.out.println(Arrays.toString(nums));

		// 2. �ش� �迭�� ��� �� ���� ������ == �ּҰ��� ����ϴ� ���� ����

		int min = nums[0];

		/*
		 * if(min > nums[1]) { min = nums[1]; }
		 * 
		 * if(min > nums[2]) { min = nums[2]; }
		 */

		for (int i = 1; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}

		System.out.println("�迭�� ��� �� ���� ���� ��: " + min);
	}

	public void methodD() {
		/*
		 * �� �� �Ҵ���� �迭�� ũ�⸦ ������ �� ����!
		 */
		String[] name = new String[3];

		name[0] = "��";
		name[1] = "��";
		name[2] = "��";
		System.out.println(Arrays.toString(name));
		name[2] = "��";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());

		name = new String[4];
		name[3] = "��";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());

		/*
		 * ������ ���� ������ �迭�� ���� �ð��� ������ G.C�� �˾Ƽ� ���� ���ش�. : �ڵ� �޸� ����
		 * 
		 * �����迭�ĺ��ڿ� �Ҵ縸 ���Ӱ� �Ѵٸ� => ���� �����ϰ� �ִ� ������ ����� ���ο� �迭�� ������
		 */

		// null : �ƹ��͵� �������� ������ �ǹ��ϴ� ��
		/*
		 * �⺻��
		 * 
		 * ���� = 0 �Ǽ� = 0.0 ���� = ' ' boolean = false
		 * 
		 * �����ڷ��� = null
		 * 
		 * �����ڷ������� null�̶�� ���� ���µ� �ּҰ��� �����ϴ°� �׷��� ������
		 */

		name = null; // ���� ������� ����ʹ�.
		System.out.println(name);
		name[0] = "ȫ�浿";
		// ����Ű�� �ִ� ����� null�ε� �ּҰ� ���µ� ��� ������?
	}

	public void methodE() {

		// �׷��� �迭 �����?
		// �׷��� �迭 ���� ���ɾ�?
		int[] arr = new int[3]; // 0, 1, 2
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(Arrays.toString(arr));

		// �迭 ���� ����� ���ÿ� ��Ҹ� �����ؼ� ����ϰ���
		int[] arr1 = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = { 100, 200, 300 };
		System.out.println(Arrays.toString(arr2));

	}

	/*
	 * �迭 ����
	 * 
	 * 1. ���� ���� ��
	 * 
	 * 2. ���� ����
	 */
	public void methodF()/* ���� ���� */ {
		// �갡 �߿���
		int[] origin = { 1, 2, 3, 4, 5 };
		// new int[5];
		// origin[0] = 1; origin[1] = 2; ...
		System.out.println(Arrays.toString(origin));

		// ���� ����� �迭�� ����
		int[] copy = origin;
		System.out.println(Arrays.toString(copy));

		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));

		// ���� ���� => �ּҰ��� �����ϴ� �� �̱� ������ ����Ű�� �ִ� ����� ����.

		System.out.println(origin.hashCode());
		System.out.println(origin.hashCode());
	}

	public void methodG()/* ���� ���� */ {

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[6];

		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}

		/*
		 * copy[0] = origin[0]; copy[1] = origin[1]; copy[2] = origin[2]; copy[3] =
		 * origin[3]; copy[4] = origin[4];
		 */

		// �迭�� ���� ������ ��� ���� �迭�� ũ�⺸�� ū �迭�� �����ϴ� ��찡 ����

		// alt + ��, �� (�� �̵�)
		// ctrl + alt + ��, �� (�� ����) (��� ��а� ��������)
		// ctrl + d (�� ����)
		// ctrl + / (�� �ּ� ó��)
		// ctrl + shift + f (�ڵ� ����)

		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));

		int[] copy2 = new int[10];
		
		System.arraycopy(origin, 0, copy2, 0, 5);
		System.out.println(Arrays.toString(copy2));
		/*
		 * ���̹������� == ù ���ڰ� �빮�� == Ŭ���� / �������̽�
		 * arraycopy() ==> SystemŬ����
		 * 
		 * System.arraycopy(���� �迭 �ĺ���, �����迭���� ���縦 ������ �ε���,
		 *                  ���纻 �迭 �ĺ���, ���纻 �迭���� ���簡 ���۵� �ε���,
		 *                  ������ ����);
		 * 
		 */
		System.out.println(Arrays.toString(origin));
		
		// ArraysŬ�������� �����ϴ� copyOf()
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
	}

}
