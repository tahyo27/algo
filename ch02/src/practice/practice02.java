package practice;

import java.util.Scanner;

/**
 * @author tahyo2
 * @Date 2024. 1. 9.
 */
public class practice02 {

	public static void main(String[] args) {
		int i = 127;
		String binaryStr = Integer.toBinaryString(i);
		String octalStr = Integer.toOctalString(i);
		String hexStr = Integer.toHexString(i);
		
		System.out.println("2진: " + binaryStr);
		System.out.println("8진: " + octalStr);
		System.out.println("16진: " + hexStr);
		
		System.out.println("ㅡㅡㅡㅡ10진으로 변환ㅡㅡㅡ");
		int a = Integer.parseInt(binaryStr, 2);
		int b = Integer.parseInt(octalStr, 8);
		int c = Integer.parseInt(hexStr, 16);
		
		System.out.println("2진: " + a);
		System.out.println("8진: " + b);
		System.out.println("16진: " + c);
		
	}

}
