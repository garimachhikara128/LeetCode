package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 268. Missing Number
 * 
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * 
 * Example 1:
 * Input: [3,0,1]
 * Output: 2
 * 
 * Example 2:
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * 
 * link : https://leetcode.com/problems/missing-number/
 */

public class _268_MissingNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(missingNumber(arr));

		scn.close();

	}

	public static int missingNumber(int[] nums) {

		int sum = 0;
		for (int val : nums) {
			sum += val;
		}

		int n = nums.length;
		int total = (n * (n + 1)) / 2;

		int ans = total - sum;

		return ans;
	}
}
