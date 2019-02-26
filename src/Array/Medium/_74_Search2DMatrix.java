package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 74. Search a 2D Matrix
 * 
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 * 		Integers in each row are sorted from left to right.
 * 		The first integer of each row is greater than the last integer of the previous row.
 * 
 * Example 1:
 * Input:
 * matrix = 
 * [
 * 		[1,  3,  5,  7],
 * 		[10, 11, 16, 20],
 * 		[23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 * 
 * Example 2:
 * Input:
 * matrix = 
 * [
 * 		[1,  3,  5,  7],
 * 		[10, 11, 16, 20],
 * 		[23, 30, 34, 50]
 * ]
 * target = 13
 * Output: false
 * 
 * link : https://leetcode.com/problems/search-a-2d-matrix/
 *
 */

public class _74_Search2DMatrix {

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

		int target = scn.nextInt();

		System.out.println(searchMatrix(arr, target));

		scn.close();

	}

	public static boolean searchMatrix(int[][] matrix, int target) {

		if(matrix.length == 0) {
			return false ;
		}
		
		int lo = 0;
		int hi = matrix.length * matrix[0].length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			int r = mid / matrix[0].length;
			int c = mid % matrix[0].length;

			if (matrix[r][c] < target) {
				lo = mid + 1;
			} else if (matrix[r][c] > target) {
				hi = mid - 1;
			} else {
				return true;
			}

		}

		return false;

	}
}
