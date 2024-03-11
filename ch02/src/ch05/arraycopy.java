package ch05;

public class arraycopy {

	public static void main(String[] args) {
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열로 만든다(result)
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc를 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		//범위 부분이 바뀌고 나머지 기존 출력 기존 배열이 길이를 충분히 가지고 있어야함
		System.out.println(num);
		
		//number으 ㅣ인덱스6 위치에 3개 복사
		System.arraycopy(abc, 0, num, 6, 4);
		System.out.println(num);

	}

}
