package ch02;

public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0)- '0'); //문자 3에서 -0하면 숫자
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt("3") + 1); //문자열 3을 숫자로 바꿈
		System.out.println("3" + 1);// 문자열 3+1이라 31로 보이게나옴
		System.out.println(3 + '0'); // '0'은 숫자로 48 아마 아스키일듯
		System.out.println((char)(3 + '0')); // 이렇게 앞에 (char)로 해주면 3이 나옴
	}
	//연산자 산술 > 비교 > 논리 > 대입 대입은 제일 마지막에 수행
	//단항 > 이항 > 삼항. 단항 연산자의 우선순위가 이항 연산자보다 높다.
	//단항 연산자와 대입 연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽이다.
}
