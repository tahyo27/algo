package ch02;

public class Ex3_2 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i;
		j = i++; //������
		System.out.println("j=i++; ������, i=" + i +", j=" + j);
		
		i = 5; //���� �ٽ� ����������
		j= 0;
		
		++i;
		j = i; //������
		System.out.println("j=++i; ������, i=" + i +", j=" + j);
	}

}
