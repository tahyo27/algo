package algo;

import java.util.Arrays;

/*���� ���� ���α׷��ӽ� - ���ڿ� �� ������� �����ϱ�
���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� ��
������ �������� �����Ϸ� �մϴ�. ���� ��� strings�� ["sun", "bed", "car"]�̰� 
n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"�� strings�� �����մϴ�.

���� ����
strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
��� strings�� ������ ���̴� n���� Ů�ϴ�.
�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
����� ��
strings	n	return
["sun", "bed", "car"]	1	["car", "bed", "sun"]
["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
����� �� ����
����� �� 1
"sun", "bed", "car"�� 1��° �ε��� ���� ���� "u", "e", "a" �Դϴ�. 
�̸� �������� strings�� �����ϸ� ["car", "bed", "sun"] �Դϴ�.

����� �� 2
"abce"�� "abcd", "cdx"�� 2��° �ε��� ���� "c", "c", "x"�Դϴ�. 
���� ���� �Ŀ��� "cdx"�� ���� �ڿ� ��ġ�մϴ�. "abce"�� "abcd"�� ���������� �����ϸ� "abcd"�� 
�켱�ϹǷ�, ���� ["abcd", "abce", "cdx"] �Դϴ�.
*/
public class Algo10 {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		
		int length = strings.length;
        String[] answer = new String[length];
        
        Arrays.sort(strings, (s1, s2) -> {
            char ch1 = s1.charAt(n);
            char ch2 = s2.charAt(n);
            
            if(ch1 == ch2) {
                return s1.compareTo(s2);
            } else {
                return ch1 - ch2;
            }
        });
        
        for(int i = 0; i < length; i++) {
            answer[i] = strings[i];
        }
        System.out.println(Arrays.toString(answer));

	}

}
