package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 14-Feb-2019
 *
 */

/**
 * 62. Unique Paths
 * 
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 * Above is a 7 x 3 grid. How many possible unique paths are there?
 * 
 * Note: m and n will be at most 100.
 * 
 * Example 1:
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * 
 * Example 2:
 * Input: m = 7, n = 3
 * Output: 28
 *
 * link : https://leetcode.com/problems/unique-paths/
 */

public class _62_UniquePaths {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();

		System.out.println(uniquePaths(m, n));

		scn.close();

	}

	public static int uniquePaths(int m, int n) {

		int[][] strg = new int[m][n];

		for (int i = strg.length - 1; i >= 0; i--) {

			for (int j = strg[0].length - 1; j >= 0; j--) {

				if (i == strg.length - 1 || j == strg[0].length - 1) {
					strg[i][j] = 1;
				} else {
					strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
				}

			}

		}

		return strg[0][0];

	}

}
