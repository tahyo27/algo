package practice;

import java.util.Scanner;

/**
 * 
 * @Date 2024. 1. 9.
 * 
 * 스캐너 연습
 */
public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두자리의 정수를 입력하세요");
		String input = sc.nextLine(); //next()는 공백전까지 nextLine()은 공백 포함 엔터할때까지 라 라인을 쓰고 변환을 많이함
		int num = Integer.parseInt(input);
		System.out.println("입력한 값" + num);
		System.out.printf("num=%d", num);

	}

}
