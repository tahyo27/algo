package ch02;

public class Solution2 {
	 public int getPhoneNumberType(String phone_number) {
	        if (phone_number.matches("010-\\d{4}-\\d{4}")) {
	            return 1; // 유형 1
	        } else if (phone_number.matches("010\\d{8}")) {
	            return 2; // 유형 2
	        } else if (phone_number.matches("\\+82-10-\\d{4}-\\d{4}")) {
	            return 3; // 유형 3
	        } else {
	            return -1; // 해당 유형이 아님
	        }
	    }

	       
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		System.out.println(solution.getPhoneNumberType("010-1234-5678"));    // 유형 1에 해당
	    System.out.println(solution.getPhoneNumberType("01012345678"));      // 유형 2에 해당
	    System.out.println(solution.getPhoneNumberType("+82-10-1234-5678")); // 유형 3에 해당
	    System.out.println(solution.getPhoneNumberType("010-12345678"));     // -1 반환 (유형에 해당하지 않음)
	}
}
