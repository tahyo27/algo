package ch02;

public class Solution2 {
	 public int getPhoneNumberType(String phone_number) {
	        if (phone_number.matches("010-\\d{4}-\\d{4}")) {
	            return 1; // ���� 1
	        } else if (phone_number.matches("010\\d{8}")) {
	            return 2; // ���� 2
	        } else if (phone_number.matches("\\+82-10-\\d{4}-\\d{4}")) {
	            return 3; // ���� 3
	        } else {
	            return -1; // �ش� ������ �ƴ�
	        }
	    }

	       
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		System.out.println(solution.getPhoneNumberType("010-1234-5678"));    // ���� 1�� �ش�
	    System.out.println(solution.getPhoneNumberType("01012345678"));      // ���� 2�� �ش�
	    System.out.println(solution.getPhoneNumberType("+82-10-1234-5678")); // ���� 3�� �ش�
	    System.out.println(solution.getPhoneNumberType("010-12345678"));     // -1 ��ȯ (������ �ش����� ����)
	}
}
