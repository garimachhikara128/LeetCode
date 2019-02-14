package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 14-Feb-2019
 *
 */

/**
 * 79. Word Search
 * 
 * Given a 2D board and a word, find if the word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once.
 * 
 * Example:
 * board =
 * 	[
 * 		['A','B','C','E'],
 * 		['S','F','C','S'],
 * 		['A','D','E','E']
 *  ]
 *  
 *  Given word = "ABCCED", return true.
 *  Given word = "SEE", return true.
 *  Given word = "ABCB", return false.
 * 
 * link : https://leetcode.com/problems/word-search/
 */

public class _79_WordSearch {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int r = scn.nextInt();
		int c = scn.nextInt();
		char[][] arr = new char[r][c];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.next().charAt(0);
			}
		}

		String str = scn.next();

		System.out.println(exist(arr, str));

		scn.close();

	}

	public static boolean exist(char[][] board, String word) {

		boolean[][] visited = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {

				if (board[i][j] == word.charAt(0))

					if (existRec(board, word, i, j, 0, visited)) {
						return true;
					}
			}

		}

		return false;

	}

	public static boolean existRec(char[][] board, String word, int r, int c, int idx, boolean[][] visited) {

		if (idx == word.length()) {
			return true;
		}

		if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(idx)
				|| visited[r][c]) {
			return false;
		}

		visited[r][c] = true;

		if (existRec(board, word, r - 1, c, idx + 1, visited))
			return true;

		if (existRec(board, word, r + 1, c, idx + 1, visited))
			return true;

		if (existRec(board, word, r, c - 1, idx + 1, visited))
			return true;

		if (existRec(board, word, r, c + 1, idx + 1, visited))
			return true;

		visited[r][c] = false;

		return false;

	}
}
