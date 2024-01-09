package ch02;

import java.util.HashMap;
import java.util.Map;

//���� �׸��� ���� ���ڰ� �ִ� ������ ���ڿ� ������ ��, �Ʒ�, ��, �� �밢�� ĭ�� ��� ������������ �з��մϴ�.
//
//���ڴ� 2���� �迭 board�� 1�� ǥ�õǾ� �ְ� board���� ���ڰ� �ż� �� ���� 1��, ���ڰ� ���� ���� 0�� �����մϴ�.
//���ڰ� �ż��� ������ ���� board�� �Ű������� �־��� ��, ������ ������ ĭ ���� return�ϵ��� solution �Լ��� �ϼ����ּ���.
public class Solution24 {
	public static int solution(int[][] board) {
		int length = board.length;
		int answer = 0;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++ ) {
				 if (board[i][j] == 0) { // ���� ĭ�� ���ڰ� ���� ���
	                    if (mine(board, i, j, length)) { // �ֺ� 8���⿡ ���ڰ� ������ Ȯ��
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
