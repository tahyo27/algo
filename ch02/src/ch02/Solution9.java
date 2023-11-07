package ch02;

public class Solution9 {
	public static String solution(String my_string, int[][] queries) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		sb1.append(my_string);
		System.out.println(sb1.toString());
		for (int i = 0; i < queries.length; i++) {
			sb2.append(sb1.substring(queries[i][0], queries[i][1] + 1));
			sb2.reverse();
			sb1.delete(queries[i][0], queries[i][1] + 1);
			sb1.insert(queries[i][0], sb2.toString());
			sb2.delete(0, sb2.length());
		}
		return sb1.toString();
	}

	public static void main(String[] args) {
		String my_string = "rermgorpsam";
		int[][] queries = { { 2,3 } , { 0,7 }, { 5,9 }, {6, 10}};
		System.out.println(solution(my_string, queries));
//		for (String x : solution(l, r)) {
//			System.out.println(x + "");
//		}
	}

}
