package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 59. Spiral Matrix II
 * 
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n^2 in spiral order.
 * 
 * Example:
 * Input: 3
 * Output:
 * 	[
 * 		[ 1, 2, 3 ],
 * 		[ 8, 9, 4 ],
 * 		[ 7, 6, 5 ]
 * 	]
 * 
 * link : https://leetcode.com/problems/spiral-matrix-ii/
 *
 */

public class _59_SpiralMatrixII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[][] ans = generateMatrix(n);

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

		scn.close();

	}

	public static int[][] generateMatrix(int n) {

		int[][] ans = new int[n][n];

		int minRow = 0;
		int minCol = 0;
		int maxRow = ans.length - 1;
		int maxCol = ans[0].length - 1;

		int count = 1;
		int nel = n * n;

		while (count <= nel) {

			for (int col = minCol; col <= maxCol && count <= nel; col++) {
				ans[minRow][col] = count;
				count++;
			}
			minRow++;

			for (int row = minRow; row <= maxRow && count <= nel; row++) {
				ans[row][maxCol] = count;
				count++;
			}
			maxCol--;

			for (int col = maxCol; col >= minCol && count <= nel; col--) {
				ans[maxRow][col] = count;
				count++;
			}
			maxRow--;

			for (int row = maxRow; row >= minRow && count <= nel; row--) {
				ans[row][minCol] = count ;
				count++;
			}
			minCol++;

		}

		return ans;

	}
}
