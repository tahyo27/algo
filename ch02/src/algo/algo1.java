package algo;

//ũ�Ⱑ ���� �κ� ���ڿ� / ���α׷��ӽ�
//���� ����
//���ڷ� �̷���� ���ڿ� t�� p�� �־��� ��, t���� p�� ���̰� ���� �κй��ڿ� �߿���, �� �κй��ڿ��� ��Ÿ���� ���� p�� ��Ÿ���� ������ �۰ų� ���� ���� ������ Ƚ���� return�ϴ� �Լ� solution�� �ϼ��ϼ���.
//
//���� ���, t="3141592"�̰� p="271" �� ���, t�� ���̰� 3�� �κ� ���ڿ��� 314, 141, 415, 159, 592�Դϴ�. �� ���ڿ��� ��Ÿ���� �� �� 271���� �۰ų� ���� ���� 141, 159 2�� �Դϴ�.
//
//���ѻ���
//1 �� p�� ���� �� 18
//p�� ���� �� t�� ���� �� 10,000
//t�� p�� ���ڷθ� �̷���� ���ڿ��̸�, 0���� �������� �ʽ��ϴ�.
//18�ڸ��� int �ڸ� �ʰ��ؼ� ������ �ٲ������
public class Algo1 {

	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		int length = p.length();
		int count = 0;
		int idx = 0;

		while (idx + length <= t.length()) {
			int x = Integer.parseInt(t.substring(idx, idx + length));
			int y = Integer.parseInt(p);
			if (x <= y)
				count++;
			idx++;
		}
		System.out.println("count�� ��:" + count);
	}

}
