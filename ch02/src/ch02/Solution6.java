package ch02;

import java.util.Arrays;

public class Solution6 {
	public static int[] solution(int[] arr, int[][] queries) {
		 int[] answer = Arrays.copyOf(arr, arr.length);
	        for(int i = 0; i < queries.length; i++) {
	            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
	                if(j % queries[i][2] == 0) {
	                    answer[j]++;
	                }
	            }
	        }
	        return answer;
	}

	public static void main(String[] args) {
		Solution6 solution = new Solution6();
		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 3, 3 } };
		for (int x : solution(arr, queries)) {
			System.out.println(x + "");
		}
	}

}
