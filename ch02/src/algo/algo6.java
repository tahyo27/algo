package algo;

import java.util.HashMap;
import java.util.Map;

/*�׿��� ���ε��� ���ڳ��̸� �ϰ� �ֽ��ϴ�. �׿��� ���ε����� ���ڸ� �ǳ� �� �Ϻ� �ڸ����� ���ܾ�� �ٲ� ī�带 �ǳ��ָ� ���ε��� ���� ���ڸ� ã�� �����Դϴ�.

������ ������ �Ϻ� �ڸ����� ���ܾ�� �ٲٴ� �����Դϴ�.

1478 �� "one4seveneight"
234567 �� "23four5six7"
10203 �� "1zerotwozero3"
�̷��� ������ �Ϻ� �ڸ����� ���ܾ�� �ٲ�����ų�, Ȥ�� �ٲ��� �ʰ� �״���� ���ڿ� s�� �Ű������� �־����ϴ�. s�� �ǹ��ϴ� ���� ���ڸ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

����� �� ���ڿ� �����Ǵ� ���ܾ�� ���� ǥ�� �����ϴ�.

����	���ܾ�
0	zero
1	one
2	two
3	three
4	four
5	five
6	six
7	seven
8	eight
9	nine
���ѻ���
1 �� s�� ���� �� 50
s�� "zero" �Ǵ� "0"���� �����ϴ� ���� �־����� �ʽ��ϴ�.
return ���� 1 �̻� 2,000,000,000 ������ ������ �Ǵ� �ùٸ� �Է¸� s�� �־����ϴ�.*/

public class Algo6 {

	public static void main(String[] args) {
		int answer = 0;
		String s = "one4seveneight";
		Map<String, Integer> hm = new HashMap<>();
		
		hm.put("zero", 0);
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);
		hm.put("six", 6);
		hm.put("seven", 7);
		hm.put("eight", 8);
		hm.put("nine", 9);

		StringBuilder num = new StringBuilder();
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				num.append(ch);
			} else {
				str.append(ch);
				String tmp = str.toString();
				if (hm.containsKey(tmp)) {
					num.append(hm.get(tmp));
					str.setLength(0);
				}
			}
		}

		answer = Integer.parseInt(num.toString());
		System.out.println("answer: " + answer);
	}

}
