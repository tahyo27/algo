package ch02;

import java.util.HashMap;
import java.util.Map;
//�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.
//�μ��� ������
public class Solution22 {
	 public static int[] solution(long n) {
	        String st = "" + n;
	        System.out.println(st);
	        int[] answer = new int[st.length()];
	        for(int i = 0; i < st.length(); i++) {
	            answer[i] = Character.getNumericValue(st.charAt(st.length()-i-1)); //�̷������� Ǯ��ǰ�
	            //char ��Ʈ�� �ٲܶ� char c = charAt�ؼ� ���� ������ int n = c - '0'; �ϸ� ��Ʈ��ȯ����
	        }
	        return answer;
	    }
	 

	public static void main(String[] args) {
		
	}
}


