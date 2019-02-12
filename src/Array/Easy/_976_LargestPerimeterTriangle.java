package Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 976. Largest Perimeter Triangle
 * 
 * Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3 of these lengths.
 * If it is impossible to form any triangle of non-zero area, return 0.
 * 
 * Example 1:
 * Input: [2,1,2]
 * Output: 5
 * 
 * Example 2:
 * Input: [1,2,1]
 * Output: 0
 * 
 * Example 3:
 * Input: [3,2,3,4]
 * Output: 10
 * 
 * Example 4:
 * Input: [3,6,2,3]
 * Output: 8
 * 
 * link : https://leetcode.com/problems/largest-perimeter-triangle/
 */

public class _976_LargestPerimeterTriangle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(largestPerimeter(arr));

		scn.close();

	}

	public static int largestPerimeter(int[] A) {

		Arrays.sort(A);

		for (int i = A.length - 1; i >= 2; i--) {

			int s1 = A[i];
			int s2 = A[i - 1];
			int s3 = A[i - 2];

			if (s2 + s3 > s1) {
				return s1 + s2 + s3;
			}

		}

		return 0;

	}
}
