package ch02;

import java.util.Scanner;

public class ScanfEx1 {

	public static void main(String[] args) {
		
		//Scanner ��ü ����
		
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println(num);
		
		scanner.close();
	}

}
