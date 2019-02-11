package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 167. Two Sum II
 * 
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number. 
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * 
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2] 
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 * 
 * link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */

public class _167_TwoSumII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		int[] ans = twoSum(arr, target);

		for (int val : ans) {
			System.out.println(val);
		}

		scn.close();

	}

	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public static int[] twoSum(int[] numbers, int target) {

		int[] ans = new int[2];

		int i = 0;
		int j = numbers.length - 1;

		while (i < j) {

			if (numbers[i] + numbers[j] > target) {
				j--;
			} else if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				ans[0] = i + 1;
				ans[1] = j + 1;
				break;
			}

		}

		return ans;
	}

}
