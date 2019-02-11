package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/** 
 * 724. Find Pivot Index 
 * 
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 * 
 * Example 1:
 * Input: nums = [1, 7, 3, 6, 5, 6]
 * Output: 3
 * Explanation: 
 * The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
 * Also, 3 is the first index where this occurs.
 * 
 * Example 2:
 * Input: nums = [1, 2, 3]
 * Output: -1
 * Explanation: 
 * There is no index that satisfies the conditions in the problem statement.
 * 
 * link : https://leetcode.com/problems/find-pivot-index/
 */

public class _724_FindPivotIndex {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(pivotIndex(arr));

		scn.close();

	}

	public static int pivotIndex(int[] nums) {

		int sum1 = 0;
		int sum2 = 0;

		for (int val : nums) {
			sum2 += val;
		}

		for (int pivot = 0; pivot < nums.length; pivot++) {

			sum2 -= nums[pivot];

			if (sum1 == sum2) {
				return pivot;
			}

			sum1 += nums[pivot];

		}

		return -1;

	}

}
