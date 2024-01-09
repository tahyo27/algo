package ch02;

import java.util.HashMap;
import java.util.Map;
//�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.
//�μ��� ������
public class Solution23 {
	 public static String[] solution(String[] quiz) {
	        String[] answer = new String[quiz.length];

	        for (int i = 0; i < quiz.length; i++) {
	            String[] elements = quiz[i].split(" ");
	            for(int j = 0; j < elements.length; j++) {
	            	System.out.println(elements[j]);
	            }
	            int X = Integer.parseInt(elements[0]);
	            String operator = elements[1];
	            int Y = Integer.parseInt(elements[2]);
	            int Z = Integer.parseInt(elements[4]);

	            int calculatedResult = 0;
	            if (operator.equals("+")) {
	                calculatedResult = X + Y;
	            } else if (operator.equals("-")) {
	                calculatedResult = X - Y;
	            }

	            if (calculatedResult == Z) {
	                answer[i] = "O";
	            } else {
	                answer[i] = "X";
	            }
	        }

	        return answer;
	    }

	public static void main(String[] args) {
		 String[] quiz = {"5 + 7 = 12", "10 - 3 = 7", "3 + 5 = 9", "-5 - 3 = -8"};
	        String[] result = solution(quiz);
	        for (String r : result) {
	            System.out.print(r + " ");  // ���� ���: O O X O
	        }
	}
}


