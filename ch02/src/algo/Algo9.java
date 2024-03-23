package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/*���α׷��ӽ� - �� �� �̾Ƽ� ���ϱ�
���� �迭 numbers�� �־����ϴ�. numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ���� �迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
numbers�� ���̴� 2 �̻� 100 �����Դϴ�.
numbers�� ��� ���� 0 �̻� 100 �����Դϴ�.
����� ��
numbers	result
[2,1,3,4,1]	[2,3,4,5,6,7]
[5,0,2,7]	[2,5,7,9,12]*/
public class Algo9 {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int length = numbers.length;
		HashSet<Integer> st = new HashSet<>();

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				int sum = numbers[i] + numbers[j];
				st.add(sum);
			}
		}

		ArrayList<Integer> sorted = new ArrayList<>(st);

		Collections.sort(sorted);

		int[] answer = new int[sorted.size()];
		for (int i = 0; i < sorted.size(); i++) {
			answer[i] = sorted.get(i);
		}

		System.out.println(Arrays.toString(answer));
	}

}
