package ch02;

import java.util.ArrayList;
import java.util.List;

public class Solution18 {
	 public static int[][] solution(int n) {
	        int[][] answer = new int[n][n];
	        int rowStart = 0, rowEnd = n - 1;
	        int colStart = 0, colEnd = n - 1;
	        int num = 1;

	        while (num <= n * n) {
	            for (int i = colStart; i <= colEnd; i++) {
	                answer[rowStart][i] = num++;
	            }
	            rowStart++;

	            for (int i = rowStart; i <= rowEnd; i++) {
	                answer[i][colEnd] = num++;
	            }
	            colEnd--;

	            for (int i = colEnd; i >= colStart; i--) {
	                answer[rowEnd][i] = num++;
	            }
	            rowEnd--;

	            for (int i = rowEnd; i >= rowStart; i--) {
	                answer[i][colStart] = num++;
	            }
	            colStart++;
	        }

	        return answer;
	    }

	public static void main(String[] args) {
		 Solution solution = new Solution();
	        int n = 4; // 예시로 n=4인 경우
	        int[][] result = solution(n);
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(result[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}


