package ch02;

public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0)- '0'); //���� 3���� -0�ϸ� ����
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt("3") + 1); //���ڿ� 3�� ���ڷ� �ٲ�
		System.out.println("3" + 1);// ���ڿ� 3+1�̶� 31�� ���̰Գ���
		System.out.println(3 + '0'); // '0'�� ���ڷ� 48 �Ƹ� �ƽ�Ű�ϵ�
		System.out.println((char)(3 + '0')); // �̷��� �տ� (char)�� ���ָ� 3�� ����
	}
	//������ ��� > �� > �� > ���� ������ ���� �������� ����
	//���� > ���� > ����. ���� �������� �켱������ ���� �����ں��� ����.
	//���� �����ڿ� ���� �����ڸ� ������ ��� ������ ��������� ���ʿ��� �������̴�.
}
