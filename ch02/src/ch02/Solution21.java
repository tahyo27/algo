package ch02;

import java.util.HashMap;
import java.util.Map;

//�μ��� ������
public class Solution21 {
	 public static int solution(int[] array) {
	        Map<Integer, Integer> mp = new HashMap<>();
	        int key = 0;
	        int max = 0;
	        for(int num : array) {
	            mp.put(num, mp.getOrDefault(num, 0) + 1);
	        }
	        
	        for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
	            if(entry.getValue() > max) {
	                max = entry.getValue();
	                System.out.println("����� ���� " + max);
	                key = entry.getKey();
	                System.out.println("������ ó�� max��: " + max);
	            } else if (max == entry.getValue()) {
	            	key = -1;   
	            	System.out.println("�ƽ��� ������ Ű��" + key);
	            }
	        }
	        
	        return key;
	    }
	 

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 3, 3, 4,4,4, 5,5,5,5};
		System.out.println(solution(array));
	}
}


