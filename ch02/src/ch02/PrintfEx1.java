package ch02;

public class PrintfEx1 {

	public static void main(String[] args) {

		System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15);
		System.out.printf("%#o%n", 15); //8����
		System.out.printf("%#x%n", 15); //16����
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
		float f = 123.456789f; // float ���е� 7�ڸ� double 15�ڸ�
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f);
		System.out.printf("%g%n", f); //���� ũ�⿡���� �˾Ƽ� ���
		
		System.out.printf("[%5d]%n", 10); //���� ����
		System.out.printf("[%-5d]%n", 10);//������ ����
		System.out.printf("[%05d]%n", 10); //����0����
	
		double d = 1.23456789;
		System.out.printf("%14.6f%n", d);
	
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");
	}

}
