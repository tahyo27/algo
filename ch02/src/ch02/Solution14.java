package ch02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution14 {
	public static int[] solution(String myString) {
		    String[] splitArr = myString.split("x", -1);
		    for(String x : splitArr) {
		    	System.out.println(x);
		    }
		    
	        int[] answer = new int[splitArr.length];
	        
	        for (int i = 0; i < splitArr.length; i++) {
	            answer[i] = splitArr[i].length();
	        }
	        return answer;
	}
	

	public static void main(String[] args) {
		String myString = "oxooxoxxox";
		for(int x : solution(myString)) {
			System.out.println(x);
		}
	}

}
