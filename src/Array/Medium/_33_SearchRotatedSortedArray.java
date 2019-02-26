package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 33. Search in Rotated Sorted Array
 * 
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * 
 * You are given a target value to search. 
 * If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 *
 * link : https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

public class _33_SearchRotatedSortedArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		System.out.println(search(arr, target));

		scn.close();

	}

	public static int search(int[] nums, int target) {

		int lo = 0;
		int hi = nums.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[lo] <= nums[mid]) {
				if (target >= nums[lo] && target <= nums[mid]) {
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			} else if (nums[mid] < nums[hi]) {
				if (target >= nums[mid] && target <= nums[hi]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}

		}

		return -1;
	}
}
