package ch02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution11 {
	public static int[] solution(int[] num_list, int n) {
		int[] first = Arrays.copyOfRange(num_list, n, num_list.length);
		int[] second = Arrays.copyOfRange(num_list, 0, n);
		int[] answer = IntStream.concat(Arrays.stream(first), Arrays.stream(second)).toArray();
		for (int x : answer) {
			System.out.print(x + " ");
		}
		return first;
	}

	public static void main(String[] args) {
		int[] num_list = {5, 2, 1, 7, 5};
		solution(num_list, 3);

		
	}

}
