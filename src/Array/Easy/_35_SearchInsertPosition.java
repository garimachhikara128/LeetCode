package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/** 
 * 35. Search Insert Position
 * 
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * 
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 * 
 * Example 2:
 * Input: [1,3,5,6], 2
 * Output: 1
 * 
 * Example 3:
 * Input: [1,3,5,6], 7
 * Output: 4
 * 
 * Example 4:
 * Input: [1,3,5,6], 0
 * Output: 0
 *  
 * link : https://leetcode.com/problems/search-insert-position/
 */

public class _35_SearchInsertPosition {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();
		System.out.println(searchInsert(arr, k));

		scn.close();

	}

	public static int searchInsert(int[] nums, int target) {


		int lo = 0;
		int hi = nums.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (nums[mid] < target) {
				lo = mid + 1;
			} else if (nums[mid] > target) {
				hi = mid - 1;
			} else {
				return mid;
			}

		}

		return lo;

	}

}
