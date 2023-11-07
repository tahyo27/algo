package ch02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution4 {
	public int[][] solution(int n, int[][] signs) {
        int[][] ansMatrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            Set<Integer> moveRow = new HashSet<>();
            ansMatrix = dfs(row, moveRow, signs, ansMatrix);

            for (int next : moveRow) {
                ansMatrix[row][next] = 1;
            }
        }

        return ansMatrix;
    }
	
	public int[][] dfs(int row, Set<Integer> moveRow, int[][] signs, int[][] ansMatrix) {
        for (int col = 0; col < ansMatrix.length; col++) {
            if (signs[row][col] == 0 || row == col || moveRow.contains(col)) {
                continue;
            }

            moveRow.add(col);
            ansMatrix = dfs(col, moveRow, signs, ansMatrix);
        }

        return ansMatrix;
    }
	       
	public static void main(String[] args) {
		Solution4 solution = new Solution4();

        int n1 = 3;
        int[][] signs1 = {{0, 1, 0}, {0, 0, 1}, {1, 0, 0}};
        int[][] answer1 = solution.solution(n1, signs1);
        for (int[] row : answer1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int n2 = 3;
        int[][] signs2 = {{0, 0, 1}, {0, 0, 1}, {0, 1, 0}};
        int[][] answer2 = solution.solution(n2, signs2);
        for (int[] row : answer2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
	
}
