package Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/** 
 * 766. Toeplitz Matrix
 * 
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 * 
 * Example 1:
 * Input:
 * 		matrix = [
 * 						[1,2,3,4],
 * 						[5,1,2,3],
 * 						[9,5,1,2]
 * 				 ]
 * Output: True
 * Explanation: In the above grid, the diagonals are:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
 * In each diagonal all elements are the same, so the answer is True.
 * 
 * Example 2:
 * Input:
 * 		matrix = [
 * 						[1,2],
 * 						[2,2]
 * 				 ]
 * Output: False
 * Explanation:	The diagonal "[1, 2]" has different elements.
 * 
 * link : https://leetcode.com/problems/toeplitz-matrix/
 */

public class _766_ToeplitzMatrix {

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

		System.out.println(isToeplitzMatrix(A));

		scn.close();

	}

	public static boolean isToeplitzMatrix(int[][] matrix) {

		int r = matrix.length;
		int c = matrix[0].length;

		int[] sum = new int[r + c - 1];

		Arrays.fill(sum, 100); // 100 bcz it wont be present in array elements as mentioned in question

		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {

				int diff = j - i;

				if (sum[diff + r - 1] == 100) {
					sum[diff + r - 1] = matrix[i][j];
				} else if (sum[diff + r - 1] != matrix[i][j]) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isToeplitzMatrix_A2(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if (i >= 1 && j >= 1 && matrix[i][j] != matrix[i - 1][j - 1]) {
					return false;
				}
			}
		}

		return true;
	}

}
