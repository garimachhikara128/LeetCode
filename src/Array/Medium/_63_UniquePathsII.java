package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 14-Feb-2019
 *
 */

/**
 * 63. Unique Paths II
 * 
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. 
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * 
 * Note: m and n will be at most 100.
 * 
 * Example 1:
 * Input:
 * 	[
 * 		[0,0,0],
 * 		[0,1,0],
 * 		[0,0,0]
 * 	]
 * Output: 2
 * Explanation:
 * There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 * 
 * link : https://leetcode.com/problems/unique-paths-ii/
 */

public class _63_UniquePathsII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();

		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		System.out.println(uniquePathsWithObstacles(arr));

		scn.close();

	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

		int nr = obstacleGrid.length;
		int nc = obstacleGrid[0].length;

		int[][] strg = new int[nr][nc];

		// last cell
		strg[nr - 1][nc - 1] = obstacleGrid[nr - 1][nc - 1] == 0 ? 1 : 0;

		// last row
		for (int c = nc - 2; c >= 0; c--) {
			strg[nr - 1][c] = obstacleGrid[nr - 1][c] == 1 ? 0 : strg[nr - 1][c + 1];
		}

		// last col
		for (int r = nr - 2; r >= 0; r--) {
			strg[r][nc - 1] = obstacleGrid[r][nc - 1] == 1 ? 0 : strg[r + 1][nc - 1];
		}

		for (int i = nr - 2; i >= 0; i--) {

			for (int j = nc - 2; j >= 0; j--) {

				if (obstacleGrid[i][j] == 1) {
					strg[i][j] = 0;
				} else {
					strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
				}

			}

		}

		return strg[0][0];

	}

}
