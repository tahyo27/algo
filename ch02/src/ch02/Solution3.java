package ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*팩토리얼은 자연수 n에 대해 1부터 n까지 모든 숫자를 곱하는 것을 의미하며 n
팩토리얼은 n!라고 표기합니다. 예를 들어 3!은 1 x 2 x 3 = 6입니다.
그리고 n!을 계산했을 때 가장 낮은 자리부터 연속되어 나타나는 0의 걔수를 팩토리얼의 꼬리의 길이라고 합니다.
예를 들어 n = 10인경우 10!은 3628800dl이며 가장 낮은 자리부터 연속해서 2개의 0이 있으므로
팩토리얼 꼬리의 길이는 2입니다.
입력으로 n이 주어질 때 팩토리얼 꼬리의 길이를 반환하는 함수를 완성해주세요*/
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
