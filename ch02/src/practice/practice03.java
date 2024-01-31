package practice;

import java.util.Scanner;

/**
 *
 * @Date 2024. 2. 1.
 * 배열 1~45 뽑기 예제
 */
public class practice03 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i = 0; i< ball.length; i++) {
			ball[i] = i + 1;
		}
		int temp = 0; // 두값 바꾸는데 사용할 변수
		int j = 0; // 임의의 값 저장
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println("ball[" + i + "] = " + ball[i]);
		}

	}

}
