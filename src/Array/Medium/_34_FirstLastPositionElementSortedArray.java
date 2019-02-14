package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * 
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * 
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * 
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 *
 * link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

public class _34_FirstLastPositionElementSortedArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		int[] ans = searchRange(arr, target);

		System.out.println(ans[0] + " " + ans[1]);

		scn.close();

	}

	public static int[] searchRange(int[] nums, int target) {

		int[] ans = new int[2];
		ans[0] = firstPos(nums, target);
		ans[1] = lastPos(nums, target);

		return ans;
	}

	public static int firstPos(int[] nums, int target) {

		int ans = -1;

		int lo = 0;
		int hi = nums.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (nums[mid] < target) {
				lo = mid + 1;
			} else if (nums[mid] > target) {
				hi = mid - 1;
			} else {
				ans = mid;
				hi = mid - 1;
			}

		}

		return ans;
	}

	public static int lastPos(int[] nums, int target) {

		int ans = -1;

		int lo = 0;
		int hi = nums.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (nums[mid] < target) {
				lo = mid + 1;
			} else if (nums[mid] > target) {
				hi = mid - 1;
			} else {
				ans = mid;
				lo = mid + 1;
			}

		}

		return ans;

	}

}
