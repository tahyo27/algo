package ch02;

import java.util.ArrayList;
import java.util.Collections;

public class Solution7 {
	public static int[] solution(int l, int r) {
		int length = r - l + 1;
		String[] arr = new String[length];
		ArrayList<Integer> dy = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(l + i);
			if(arr[i].matches("^[05]+$")) {
				dy.add(Integer.parseInt(arr[i]));
			}
		}
		Collections.sort(dy);
//		for(Integer x : dy) {
//			System.out.println(x);
//		}
		int[] answer;
		if(dy.isEmpty()) {
			answer = new int[] {-1};
		} else {
			answer = new int[dy.size()];
			for(int i = 0; i < dy.size(); i++) {
				answer[i] = dy.get(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution7 solution = new Solution7();
		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 3, 3 } };
		int l = 10;
		int r = 20;
		for(int x : solution(l, r)) {
			System.out.println(x);
		}
//		for (String x : solution(l, r)) {
//			System.out.println(x + "");
//		}
	}

}
