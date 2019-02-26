package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 81. Search in Rotated Sorted Array II
 * 
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
 * 
 * You are given a target value to search. 
 * If found in the array return true, otherwise return false.
 * 
 * Example 1:
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 * 
 * Example 2:
 * Input: nums = [2,5,6,0,0,1,2], target = 3
 * Output: false
 *
 * link : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 */

public class _81_SearchRotatedSortedArrayII {

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

	public static boolean search(int[] nums, int target) {

		
	}
}
