package ch02;

public class Ex3_2 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i;
		j = i++; //후위형
		System.out.println("j=i++; 실행후, i=" + i +", j=" + j);
		
		i = 5; //값을 다시 원래값으로
		j= 0;
		
		++i;
		j = i; //전위형
		System.out.println("j=++i; 실행후, i=" + i +", j=" + j);
	}

}
