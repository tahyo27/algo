package ch02;

public class test3 {
	public static int solution(int mod1, int mod2, int max_range) {
		 int countMod1 = max_range / mod1; // mod1의 배수 개수
	     int countMod1Mod2 = max_range / (mod1 * mod2); // mod1 * mod2의 배수 개수

	     int answer = countMod1 - countMod1Mod2; // mod1로 나누어떨어지지만 mod2로 나누어떨어지지 않는 수의 개수
	     return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(4,3, 20));
		System.out.println(solution(8,10, 20));
	}

}
