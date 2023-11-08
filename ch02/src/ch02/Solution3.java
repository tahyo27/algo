package ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*���丮���� �ڿ��� n�� ���� 1���� n���� ��� ���ڸ� ���ϴ� ���� �ǹ��ϸ� n
���丮���� n!��� ǥ���մϴ�. ���� ��� 3!�� 1 x 2 x 3 = 6�Դϴ�.
�׸��� n!�� ������� �� ���� ���� �ڸ����� ���ӵǾ� ��Ÿ���� 0�� �¼��� ���丮���� ������ ���̶�� �մϴ�.
���� ��� n = 10�ΰ�� 10!�� 3628800dl�̸� ���� ���� �ڸ����� �����ؼ� 2���� 0�� �����Ƿ�
���丮�� ������ ���̴� 2�Դϴ�.
�Է����� n�� �־��� �� ���丮�� ������ ���̸� ��ȯ�ϴ� �Լ��� �ϼ����ּ���*/
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
