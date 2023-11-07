package ch02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution16 {
	public static int solution(String myString, String pat) {
        int answer = 0;
        System.out.println(myString);
		String str = myString.replace("A", "X").replace("B", "A").replace("X", "B");
		if(str.contains(pat)) answer = 1;
		System.out.println(str);
        
        return answer;
	}
	

	public static void main(String[] args) {
		String myString = "ABBAA";
		String pat = "AABB";
		System.out.println(solution(myString, pat));
	}

}
