package ch02;

import java.util.ArrayList;
import java.util.List;

public class Solution17 {
	public static List<String> solution(String myStr) {
		List<String> result = new ArrayList<>();
		StringBuilder currentSegment = new StringBuilder();
		System.out.println("이거테스트1" + result.toString());

		for (char c : myStr.toCharArray()) {
			System.out.println("이거테스트2" + result.toString());
			if (c == 'a' || c == 'b' || c == 'c') {
				if (currentSegment.length() > 0) {
					System.out.println("이거테스트3" + result.toString());
					result.add(currentSegment.toString());
					System.out.println("이거테스트4" + result.toString());
					currentSegment = new StringBuilder();
				}
				
			} else {
				currentSegment.append(c);
			}
		}
		System.out.println("이거테스트3" + result.toString());
		if (currentSegment.length() > 0) {
			result.add(currentSegment.toString());
		}
		System.out.println("이거테스트" + result.toString());
		if (result.size() == 0) {
			result = new ArrayList<>();
			result.add("EMPTY");
		}

		return result;
	}

	public static void main(String[] args) {
		String myStr = "cabab";
		List<String> result = solution(myStr);
		System.out.println(result); // 결과: ["onlettu", "etom", "to"]
	}

}
