package ch02;

import java.util.ArrayList;
import java.util.Collections;

public class Solution8 {
	public static int[] solution(int n) {

		ArrayList<Integer> dy = new ArrayList<>();
		dy.add(n);
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			dy.add(n);
		}
		for (Integer x : dy) {
			System.out.println(x);
		}

		int[] answer = new int[dy.size()];
		for(int i = 0; i < dy.size(); i++) {
			answer[i] = dy.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution8 solution = new Solution8();
		solution(10);
//		for(int x : solution(10)) {
//			System.out.println(x);
//		}

	}

}
