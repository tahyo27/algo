package algo;

//���α׷��ӽ� ���� ��ȣ
//���� ����
//� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. ���� ��� "AB"�� 1��ŭ �и� "BC"�� �ǰ�, 3��ŭ �и� "DE"�� �˴ϴ�. "z"�� 1��ŭ �и� "a"�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
//
//���� ����
//������ �ƹ��� �о �����Դϴ�.
//s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
//s�� ���̴� 8000�����Դϴ�.
//n�� 1 �̻�, 25������ �ڿ����Դϴ�.
public class algo4 {

	public static void main(String[] args) {
		String s = "e F d";
		int n = 4;
		int tmp;
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			tmp = (int) ch[i];

			if (ch[i] != ' ') {
				if (tmp + n > 90 && tmp <= 90) {
					tmp = tmp - 26 + n;
					ch[i] = (char) tmp;
				} else if (tmp + n > 122 && tmp <= 122) {
					tmp = tmp - 26 + n;
					ch[i] = (char) tmp;
				} else {
					tmp = tmp + n;
					ch[i] = (char) tmp;
				}
			}
		}

		System.out.println(String.valueOf(ch));
		
	}

}
