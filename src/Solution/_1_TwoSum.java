package Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/** 
 * 1. Two Sum
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target. 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice. 
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * link : https://leetcode.com/problems/two-sum/
 */

public class _1_TwoSum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		int[] ans = twoSum_A1(arr, target);

		for (int val : ans) {
			System.out.println(val);
		}

		scn.close();

	}

	// Time Complexity : O(n^2)
	// Space Complexity : O(1)
	public static int[] twoSum_A1(int[] nums, int target) {

		int[] ans = new int[2];

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
		return ans;
	}

	// Time Complexity : O(n)
	// Space Complexity : O(n)
	public static int[] twoSum_A2(int[] nums, int target) {

		int[] ans = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {

			int opposite = target - nums[i];

			if (map.containsKey(opposite) && map.get(opposite) != 1) {
				ans[0] = map.get(opposite);
				ans[1] = i;
			}

		}

		Arrays.sort(ans);

		return ans;
	}

}
