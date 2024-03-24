package algo;

import java.util.Arrays;

/*문제 설명 프로그래머스 - 문자열 내 마음대로 정렬하기
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기
준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 
n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
입출력 예
strings	n	return
["sun", "bed", "car"]	1	["car", "bed", "sun"]
["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
입출력 예 설명
입출력 예 1
"sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다. 
이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다.

입출력 예 2
"abce"와 "abcd", "cdx"의 2번째 인덱스 값은 "c", "c", "x"입니다. 
따라서 정렬 후에는 "cdx"가 가장 뒤에 위치합니다. "abce"와 "abcd"는 사전순으로 정렬하면 "abcd"가 
우선하므로, 답은 ["abcd", "abce", "cdx"] 입니다.
*/
public class Algo10 {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		
		int length = strings.length;
        String[] answer = new String[length];
        
        Arrays.sort(strings, (s1, s2) -> {
            char ch1 = s1.charAt(n);
            char ch2 = s2.charAt(n);
            
            if(ch1 == ch2) {
                return s1.compareTo(s2);
            } else {
                return ch1 - ch2;
            }
        });
        
        for(int i = 0; i < length; i++) {
            answer[i] = strings[i];
        }
        System.out.println(Arrays.toString(answer));

	}

}
