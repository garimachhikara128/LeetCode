package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/** 
 * 840. Magic Squares In Grid
 * 
 * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.
 * Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).
 * 
 * Example 1:
 * Input: 
 * 	[	
 * 		[4,3,8,4],
 * 		[9,5,1,9],
 * 		[2,7,6,2]	
 * 	]
 * Output: 1
 * Explanation: 
 * The following subgrid is a 3 x 3 magic square:
 * 438
 * 951
 * 276
 * 
 * while this one is not:
 * 384
 * 519
 * 762
 * 
 * In total, there is only one magic square inside the given grid.
 * 
 * link : https://leetcode.com/problems/magic-squares-in-grid/
 */

public class _840_MagicSquaresInGrid {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int r = scn.nextInt();
		int c = scn.nextInt();

		int[][] A = new int[r][c];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = scn.nextInt();
			}
		}

		System.out.println(numMagicSquaresInside(A));
		
		scn.close(); 

	}

	public static int numMagicSquaresInside(int[][] grid) {

		int count = 0;

		for (int r = 0; r <= grid.length - 3; r++) {

			for (int c = 0; c <= grid[0].length - 3; c++) {

				// if (grid[r + 1][c + 1] != 5) {
				// continue;
				// }

				if (isNumber1To9(grid, r, c)) {
					
					boolean r1s = grid[r][c] + grid[r][c + 1] + grid[r][c + 2] == 15;
					boolean r2s = grid[r + 1][c] + grid[r + 1][c + 1] + grid[r + 1][c + 2] == 15;
					boolean r3s = grid[r + 2][c] + grid[r + 2][c + 1] + grid[r + 2][c + 2] == 15;

					boolean c1s = grid[r][c] + grid[r + 1][c] + grid[r + 2][c] == 15;
					boolean c2s = grid[r][c + 1] + grid[r + 1][c + 1] + grid[r + 2][c + 1] == 15;
					boolean c3s = grid[r][c + 2] + grid[r + 1][c + 2] + grid[r + 2][c + 2] == 15;

					boolean d1s = grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] == 15;
					boolean d2s = grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] == 15;

					if (r1s && r2s && r3s && c1s && c2s && c3s && d1s && d2s) {
						count++;
					}
					
				}

			}

		}

		return count;

	}

	public static boolean isNumber1To9(int[][] grid, int r, int c) {

		boolean[] visited = new boolean[10];

		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {

				if (grid[i][j] >= 10 || visited[grid[i][j]] == true) {
					return false;
				}

				visited[grid[i][j]] = true;
			}
		}

		return true;

	}

}
