package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 26. Remove Duplicates from Sorted Array
 * 
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Example 1:
 * Given nums = [1,1,2], Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the returned length.
 * 
 * Example 2:
 * Given nums = [0,0,1,1,1,2,2,3,3,4], Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * It doesn't matter what values are set beyond the returned length.
 *
 * link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

public class _26_RemoveDuplicatesSortedArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int res = removeDuplicates(arr);

		for (int i = 0; i < res; i++) {
			System.out.println(arr[i]);
		}
		scn.close();

	}

	public static int removeDuplicates(int[] nums) {

		int pos = 1;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] != nums[i + 1]) {

				nums[pos] = nums[i + 1];
				pos++;
			}

		}

		return pos;

	}

}
