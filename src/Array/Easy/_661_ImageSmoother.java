package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 661. Image Smoother
 * 
 * Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.
 * 
 * Example 1:
 * Input:
 * 		[
 * 			[1, 1, 1],
 * 		 	[1, 0, 1],
 * 			[1, 1, 1]
 *		]
 *
 * Output:
 *		[
 *			[0, 0, 0],
 *			[0, 0, 0],
 *			[0, 0, 0]
 *		]
 *
 * Explanation:
 * For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
 * For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
 * For the point (1,1): floor(8/9) = floor(0.88888889) = 0
 * 
 * link : https://leetcode.com/problems/image-smoother/
 */

public class _661_ImageSmoother {

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

		display(imageSmoother(A));
		
		scn.close();

	}

	public static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] imageSmoother(int[][] M) {

		int[] rowArr = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
		int[] colArr = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };

		int[][] ans = new int[M.length][M[0].length];

		for (int row = 0; row < M.length; row++) {

			for (int col = 0; col < M[0].length; col++) {

				int ones = 0;
				int total = 0;

				for (int idx = 0; idx < rowArr.length; idx++) {

					int nr = row + rowArr[idx];
					int nc = col + colArr[idx];

					if (nr >= 0 && nr < M.length && nc >= 0 && nc < M[0].length) {

						if (M[nr][nc] != 0)
							ones += M[nr][nc];

						total ++ ;

					}
				}

				ans[row][col] = ones / total;
			}
		}

		return ans;
	}

}
