package ch02;

//�μ��� ������
public class Solution20 {
	 public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        int[] answer = new int[2];
	        int numer = numer1*denom2 + numer2*denom1;
	        System.out.println("numer" + numer);
	        int denom = denom1*denom2;
	        System.out.println("denom" + denom);
	        int gcbval = gcb(numer, denom);
	        System.out.println("gcbval" + gcbval);
	        answer[0] = numer / gcbval;
	        answer[1] = denom / gcbval;
	        
	        return answer;
	    }
	    public static int gcb(int a, int b) {
	        if(b == 0) return a;
	        else return gcb(b, a % b);
	    }

	public static void main(String[] args) {
		
		System.out.println(Solution20.solution(9, 2, 1, 3));
	}
}


