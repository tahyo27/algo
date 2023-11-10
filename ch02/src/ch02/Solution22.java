package ch02;

import java.util.HashMap;
import java.util.Map;
//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//두수의 나눗셈
public class Solution22 {
	 public static int[] solution(long n) {
	        String st = "" + n;
	        System.out.println(st);
	        int[] answer = new int[st.length()];
	        for(int i = 0; i < st.length(); i++) {
	            answer[i] = Character.getNumericValue(st.charAt(st.length()-i-1)); //이런식으로 풀어도되고
	            //char 인트로 바꿀때 char c = charAt해서 넣은 다음에 int n = c - '0'; 하면 인트변환가능
	        }
	        return answer;
	    }
	 

	public static void main(String[] args) {
		
	}
}


