package Array.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 14-Feb-2019
 *
 */

/**
 * 120. Triangle
 * 
 * Given a triangle, find the minimum path sum from top to bottom. 
 * Each step you may move to adjacent numbers on the row below.
 * 
 * For example, given the following triangle
 * 	[
 * 		  [2],
 * 	     [3,4],
 * 	    [6,5,7],
 * 	   [4,1,8,3]
 *  ]
 * 
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * 
 * link : https://leetcode.com/problems/triangle/
 */

public class _120_Triangle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		List<List<Integer>> list = new ArrayList<>();
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {

			List<Integer> sublist = new ArrayList<>();

			for (int j = 0; j <= i; j++) {
				sublist.add(scn.nextInt());
			}

			list.add(sublist);
		}

		System.out.println(minimumTotal_A2(list));

		scn.close();

	}

	// Space Complexity : O(n^2)
	public static int minimumTotal(List<List<Integer>> triangle) {

		int[][] strg = new int[triangle.size()][triangle.size()];
		strg[0][0] = triangle.get(0).get(0);

		for (int row = 1; row < strg.length; row++) {

			List<Integer> presentRow = triangle.get(row);

			for (int col = 0; col < presentRow.size(); col++) {

				if (col == 0) {
					strg[row][col] = presentRow.get(col) + strg[row - 1][col];
				} else if (col == presentRow.size() - 1) {
					strg[row][col] = presentRow.get(col) + strg[row - 1][col - 1];
				} else {
					strg[row][col] = presentRow.get(col) + Math.min(strg[row - 1][col - 1], strg[row - 1][col]);
				}

			}

		}

		int min = Integer.MAX_VALUE;
		for (int val : strg[strg.length - 1]) {
			min = Math.min(min, val);
		}

		return min;

	}

	// Space Complexity : O(n)
	public static int minimumTotal_A2(List<List<Integer>> triangle) {

		int[] strg = new int[triangle.size()];

		strg[0] = triangle.get(0).get(0);

		for (int row = 1; row < strg.length; row++) {

			List<Integer> presentRow = triangle.get(row);

			for (int col = presentRow.size() - 1; col >= 0; col--) {

				if (col == presentRow.size() - 1) {
					strg[col] = presentRow.get(col) + strg[col - 1];
				} else if (col == 0) {
					strg[col] = presentRow.get(col) + strg[col];
				} else {
					strg[col] = presentRow.get(col) + Math.min(strg[col - 1], strg[col]);
				}

			}
		}

		int min = Integer.MAX_VALUE;
		for (int val : strg) {
			min = Math.min(min, val);
		}

		return min;

	}

}
