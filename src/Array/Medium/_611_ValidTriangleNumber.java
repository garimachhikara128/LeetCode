package Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 611. Valid Triangle Number
 * 
 * Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
 * 
 * Example 1:
 * Input: [2,2,3,4]
 * Output: 3
 * Explanation: 
 * Valid combinations are: 
 * 2,3,4 (using the first 2)
 * 2,3,4 (using the second 2)
 * 2,2,3
 * 
 * link : https://leetcode.com/problems/valid-triangle-number/
 */

public class _611_ValidTriangleNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(triangleNumber(arr));

		scn.close();

	}

	public static int triangleNumber(int[] nums) {

		int count = 0;

		Arrays.sort(nums);

		for (int i = nums.length - 1; i >= 0; i--) { // largest length of triangle is fixed and then check

			int j = 0;
			int k = i - 1;

			while (j < k) {

				if (nums[j] + nums[k] > nums[i]) {
					count += (k - j);
					k--;
				} else {
					j++;
				}

			}

		}

		return count;
	}

}
