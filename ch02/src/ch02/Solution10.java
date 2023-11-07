package ch02;

public class Solution10 {
	public static String solution(String myString, int[] indices) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
        sb.append(myString);
        System.out.println(sb.toString());
        for(int i = 0; i < indices.length; i++){
          
           System.out.println("j=" + j);
           if(i == 0)  {
                sb.deleteCharAt(indices[i]);
                System.out.println(sb.toString());
           } else {
               if(indices[i] == 0) {
                   sb.deleteCharAt(0);
                   System.out.println(sb.toString());
               } else {
                   sb.deleteCharAt(indices[i]-j); 
                   System.out.println(sb.toString());
               }
           }
           j++;   
        }
        return sb.toString();
	}
	 public static boolean contains(int[] arr, int target) {
	        for (int num : arr) {
	            if (num == target) {
	                return true;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		 String myString = "apporoograpemmemprs";
	        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3}; // 제거할 문자열의 인덱스 배열

	        String result = solution(myString, indices);
	        System.out.println(result); // 결과 출력
//		}
	}

}
