package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/** 
 * 867. Transpose Matrix
 * 
 * Given a matrix A, return the transpose of A.
 * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
 * 
 * Example 1:
 * Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * 
 * Example 2:
 * Input: [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 * 
 * link : https://leetcode.com/problems/transpose-matrix/
 */

public class _867_TransposeMatrix {

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

		display(transpose(A));
		
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

	public static int[][] transpose(int[][] A) {

		int[][] ans = new int[A[0].length][A.length];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				ans[j][i] = A[i][j];
			}
		}

		return ans;

	}
}
