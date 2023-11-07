package ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
	 public int solution(int n) {
	        int count = 0;
	        for (int i = 2; i <= n; i++) {
	            int temp = i;
	            while (temp % 5 == 0) {
	                temp /= 5;
	                count++;
	            }
	        }
	        return count;
	   }
	       
	public static void main(String[] args) {
		Solution3 solution = new Solution3();
		System.out.println(solution.solution(5));
	}
}
