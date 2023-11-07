package ch02;

public class PrintfEx1 {

	public static void main(String[] args) {

		System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15);
		System.out.printf("%#o%n", 15); //8진수
		System.out.printf("%#x%n", 15); //16진수
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
		float f = 123.456789f; // float 정밀도 7자리 double 15자리
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f);
		System.out.printf("%g%n", f); //숫자 크기에따라 알아서 출력
		
		System.out.printf("[%5d]%n", 10); //왼쪽 정렬
		System.out.printf("[%-5d]%n", 10);//오른쪽 정렬
		System.out.printf("[%05d]%n", 10); //공백0으로
	
		double d = 1.23456789;
		System.out.printf("%14.6f%n", d);
	
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");
	}

}
