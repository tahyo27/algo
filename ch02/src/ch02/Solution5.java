package ch02;

import java.util.Arrays;

public class Solution5 {
	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		Arrays.fill(answer, 100000);
		for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if (arr[j] > queries[i][2]) {
					answer[i] = Math.min(answer[i], arr[j]);
					System.out.println("answer " + answer[i]);
				}
			}
			if (answer[i] == 100000) {
				answer[i] = -1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution5 solution = new Solution5();
		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } };
		for (int x : solution(arr, queries)) {
			System.out.println(x + "");
		}
	}

}
