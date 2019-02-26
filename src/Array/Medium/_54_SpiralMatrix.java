package Array.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 54. Spiral Matrix
 * 
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * 
 * Example 1:
 * Input:
 * 	[
 * 		[ 1, 2, 3 ],
 * 		[ 4, 5, 6 ],
 * 		[ 7, 8, 9 ]
 * 	]
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * Example 2:
 * Input:
 *  [
 *  	[1, 2, 3, 4],
 *  	[5, 6, 7, 8],
 *  	[9,10,11,12]
 *  ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * link : https://leetcode.com/problems/spiral-matrix/
 *
 */

public class _54_SpiralMatrix {

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

		System.out.println(spiralOrder(arr));

		scn.close();

	}

	public static List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> list = new ArrayList<>();

		if (matrix.length == 0) {
			return list;
		}

		int minRow = 0;
		int minCol = 0;
		int maxRow = matrix.length - 1;
		int maxCol = matrix[0].length - 1;

		int count = 0;
		int nel = matrix.length * matrix[0].length;

		while (count < nel) {

			for (int col = minCol; col <= maxCol && count < nel; col++) {
				list.add(matrix[minRow][col]);
				count++;
			}
			minRow++;

			for (int row = minRow; row <= maxRow && count < nel; row++) {
				list.add(matrix[row][maxCol]);
				count++;
			}
			maxCol--;

			for (int col = maxCol; col >= minCol && count < nel; col--) {
				list.add(matrix[maxRow][col]);
				count++;
			}
			maxRow--;

			for (int row = maxRow; row >= minRow && count < nel; row--) {
				list.add(matrix[row][minCol]);
				count++;
			}

			minCol++;

		}

		return list;

	}
}
