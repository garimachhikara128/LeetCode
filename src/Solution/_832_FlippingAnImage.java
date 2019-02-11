package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 832. Flipping an Image
 * 
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.  
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. 
 * For example, inverting [0, 1, 1] results in [1, 0, 0].
 * 
 * Example 1:
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * 
 * Example 2:
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 
 * link : https://leetcode.com/problems/flipping-an-image/
 */

public class _832_FlippingAnImage {

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

		display(flipAndInvertImage(A));
		
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

	public static int[][] flipAndInvertImage(int[][] A) {

		// flip an image horizontally
		for (int row = 0; row < A.length; row++) {

			int[] arr = A[row];

			// reverse the array
			int left = 0;
			int right = arr.length - 1;

			while (left < right) {

				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}

		}

		// inverse an image
		for (int row = 0; row < A.length; row++) {

			int[] arr = A[row];

			for (int col = 0; col < arr.length; col++) {
				arr[col] = (arr[col] == 0 ? 1 : 0);
			}
		}

		return A ;
	}

}
