package ch02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution13 {
	public static int solution(int[] arr) {
		int answer = 0;
        int[] crnt = Arrays.copyOf(arr, arr.length);
        while(true) {
            int[] nxt = trans(crnt);
            for(int x : nxt) {
            	System.out.print(x + " ");
            }
            System.out.println();
           
            if(Arrays.equals(crnt, nxt)) {
                break;
            }
            crnt = Arrays.copyOf(nxt, nxt.length);
            answer++;
        }
       
        return answer;
	}
	public static int[] trans(int[] arr) {
        int[] next = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                next[i] = arr[i] / 2;
            } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                next[i] = arr[i] * 2 + 1;
            } else {
                next[i] = arr[i];
            }
        }
        return next;
    }

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 100, 99, 98 };
		System.out.println(solution(arr));
	}

}
