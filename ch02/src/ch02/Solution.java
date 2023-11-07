package ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	 public int[] calculateRank(int[] grade) {
		 int n = grade.length;
	        if (n == 0) {
	            return new int[0];
	        }

	        int maxScore = Arrays.stream(grade).max().getAsInt();
	        int[] counts = new int[maxScore + 1];
	        for (int i = 0; i < n; i++) {
	            counts[grade[i]]++;
	        }

	        int[] ranks = new int[maxScore + 1];
	        int rank = 1;
	        for (int i = maxScore; i >= 0; i--) {
	            if (counts[i] > 0) {
	                ranks[i] = rank;
	                rank += counts[i];
	            }
	        }

	        int[] result = new int[n];
	        for (int i = 0; i < n; i++) {
	            result[i] = ranks[grade[i]];
	        }

	        return result;
	    }
	       
	public static void main(String[] args) {
		Solution solution = new Solution();
        int[] grade = {3, 2, 1, 2};
        int[] rank = solution.calculateRank(grade);
        System.out.println(Arrays.toString(rank)); // [1, 2, 4, 2]
	}
}
