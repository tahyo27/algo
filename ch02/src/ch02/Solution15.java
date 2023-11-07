package ch02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution15 {
	public static String[] solution(String myString) {
	
		String[] arr = myString.split("x");
		System.out.println("天天天天");
		Arrays.sort(arr);
		for(String x : arr) {
			System.out.println(x);
		}
		System.out.println("天天天天天天天天天天天天天天天");
	    String[] result = Arrays.stream(arr).filter(x -> !x.strip().isEmpty()).toArray(String[]::new);
	    for(String x : result) {
			System.out.println(x);
		}
        return result;
}
	

	public static void main(String[] args) {
		String myString = "xaaaxbbbxccccx";
		for(String x : solution(myString)) {
			System.out.println(x);
		}
	}

}
