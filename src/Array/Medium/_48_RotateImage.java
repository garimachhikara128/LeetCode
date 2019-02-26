package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 48. Rotate Image
 * 
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Note:
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
 * DO NOT allocate another 2D matrix and do the rotation.
 * 
 * Example 1:
 * Given input matrix = 
 * 	[
 * 		[1,2,3],
 * 		[4,5,6],
 * 		[7,8,9]
 *  ],
 * rotate the input matrix in-place such that it becomes:
 *  [
 *  	[7,4,1],
 *  	[8,5,2],
 *  	[9,6,3]
 *  ]
 *  
 * Example 2:
 * Given input matrix =
 *  [
 *  	[ 5, 1, 9,11],
 *  	[ 2, 4, 8,10],
 *  	[13, 3, 6, 7],
 *  	[15,14,12,16]
 *  ], 
 * rotate the input matrix in-place such that it becomes:
 *  [
 * 		[15,13, 2, 5],
 * 		[14, 3, 4, 1],
 * 		[12, 6, 8, 9],
 * 		[16, 7,10,11]
 *  ]
 * 
 * link : https://leetcode.com/problems/rotate-image/
 *
 */

public class _48_RotateImage {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int cols = scn.nextInt();

		int[][] arr = new int[rows][cols];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		rotate(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		scn.close();

	}

	public static void rotate(int[][] matrix) {

		// swap the rows
		int left = 0;
		int right = matrix.length - 1;

		while (left < right) {
			int[] temp = matrix[left];
			matrix[left] = matrix[right];
			matrix[right] = temp;

			left++;
			right--;

		}

		// transpose
		for (int i = 0; i < matrix.length; i++) {

			for (int j = i; j < matrix[0].length; j++) {

				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;

			}
		}

	}
}
