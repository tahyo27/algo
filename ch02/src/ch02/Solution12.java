package ch02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution12 {
	public static int[] solution(int[] arr, int[] query) {
		 	StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
			}
			for(int i = 0; i < query.length; i++) {
				if(query[i] % 2 == 0) {
					sb.delete(query[i] + 1, sb.length());	
				} else {
					sb.delete(0, query[i]);
				}
			}
	        String a = sb.toString();
	        int[] answer = new int[a.length()];
	        for(int i = 0; i < a.length(); i++) {
	            char digit = a.charAt(i);
	            int nv = Character.getNumericValue(digit);
	            answer[i] = nv;
	        }
	        return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] query = { 4, 1, 2 };

		int[] result = solution(arr, query);
		System.out.println(Arrays.toString(result));
	}

}
