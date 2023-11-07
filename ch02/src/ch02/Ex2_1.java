package ch02;

public class Ex2_1 {

	public static void main(String[] args) {
		//sysout ctrl+space 자동완성
		//ctrl+alt+down 한줄 복사
		//ctrl+alt+shift+down 행단위 복사
		//alt+shift+a 컬럼 편집 모드(토글)
		//print() - 출력 후에 줄바꿈을 안함
		//println() - 출력 후에 줄바꿈을 합니다.
		//Integer.toBinaryString(15) : 2진 문자열로 바꿔줌
		System.out.println(5+3);//덧셈
		System.out.println(5-3);//뺄셈
		System.out.println(5*3);//곱셈
		System.out.println(5/3);//나눗셈
		
		int x = 10;
		float y = 0.1f;
		
		System.out.printf("x:%d" + "y:%.2f", x, y);
	}

}
