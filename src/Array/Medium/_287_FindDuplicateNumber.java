package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 287. Find the Duplicate Number
 * 
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. 
 * Assume that there is only one duplicate number, find the duplicate one.
 * 
 * Example 1:
 * Input: [1,3,4,2,2]
 * Output: 2
 * 
 * Example 2:
 * Input: [3,1,3,4,2]
 * Output: 3
 * 
 * Note:
 * 		You must not modify the array (assume the array is read only).
 * 		You must use only constant, O(1) extra space.
 * 		Your runtime complexity should be less than O(n2).
 * 		There is only one duplicate number in the array, but it could be repeated more than once.
 *
 * link : https://leetcode.com/problems/find-the-duplicate-number/
 */

public class _287_FindDuplicateNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(findDuplicate(arr));

		scn.close();

	}

	public static int findDuplicate(int[] nums) {
		return 0;
	}

}
