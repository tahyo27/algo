package ch02;

public class test3 {
	public static int solution(int mod1, int mod2, int max_range) {
		 int countMod1 = max_range / mod1; // mod1�� ��� ����
	     int countMod1Mod2 = max_range / (mod1 * mod2); // mod1 * mod2�� ��� ����

	     int answer = countMod1 - countMod1Mod2; // mod1�� ������������� mod2�� ����������� �ʴ� ���� ����
	     return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(4,3, 20));
		System.out.println(solution(8,10, 20));
	}

}
