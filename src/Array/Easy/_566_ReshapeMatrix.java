package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 566. Reshape the Matrix
 * 
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.
 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 * 
 * Example 1:
 * Input: 
 * nums = [[1,2], [3,4]]
 * r = 1, c = 4
 * Output: [[1,2,3,4]]
 * Explanation: 
 * The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
 * 
 * Example 2:
 * Input: 
 * nums = [[1,2], [3,4]]
 * r = 2, c = 4
 * Output: [[1,2], [3,4]]
 * Explanation:
 * There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
 *
 * link : https://leetcode.com/problems/reshape-the-matrix/ 
 */

public class _566_ReshapeMatrix {

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

		int nr = scn.nextInt();
		int nc = scn.nextInt();

		display(matrixReshape(A, nr, nc));

		scn.close();

	}

	public static void display(int[][] matrix) {

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {

				System.out.print(matrix[row][col] + " ");
			}

			System.out.println();
		}

	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {

		int newCells = r * c;
		int oldCells = nums.length * nums[0].length;

		if (newCells != oldCells) {
			return nums;
		}

		int count = 0;

		int[][] na = new int[r][c];

		for (int i = 0; i < na.length; i++) {

			for (int j = 0; j < na[0].length; j++) {

				int si = count / nums[0].length;
				int ei = count % nums[0].length;

				na[i][j] = nums[si][ei];
				count++;

			}
		}

		return na;

	}

}
