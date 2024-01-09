package ch02;

import java.util.HashMap;
import java.util.Map;

//다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
//
//지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
//지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
public class Solution24 {
	public static int solution(int[][] board) {
		int length = board.length;
		int answer = 0;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++ ) {
				 if (board[i][j] == 0) { // 현재 칸이 지뢰가 없는 경우
	                    if (mine(board, i, j, length)) { // 주변 8방향에 지뢰가 없는지 확인
	                    	answer++;
	                    }
			}
			}
		}
		return answer;
	
}
	private static boolean mine(int[][] board, int row, int col, int length) {
		int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
		for (int i = 0; i < 8; i++) {
			int mvRow = row + x[i];
			int mvCol = col + y[i];

			if (mvRow >= 0 && mvRow < length && mvCol >= 0 && mvCol < length && board[mvRow][mvCol] == 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] board = { { 1, 0, 0, 1 }, { 0, 0, 1, 0 }, { 1, 1, 0, 0 }, { 0, 0, 0, 0 } };

		int result = solution(board);
		System.out.println(result);
	}
}
