package practice;

import java.util.Scanner;

/**
 * 
 * @Date 2024. 1. 9.
 * 
 * ��ĳ�� ����
 */
public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ��� ������ �Է��ϼ���");
		String input = sc.nextLine(); //next()�� ���������� nextLine()�� ���� ���� �����Ҷ����� �� ������ ���� ��ȯ�� ������
		int num = Integer.parseInt(input);
		System.out.println("�Է��� ��" + num);
		System.out.printf("num=%d", num);

	}

}
