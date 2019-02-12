package Array.Easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 219. Contains Duplicate II
 * 
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * 
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * 
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 * 
 * link : https://leetcode.com/problems/contains-duplicate-ii/
 */

public class _219_ContainsDuplicateII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();
		System.out.println(containsNearbyDuplicate(arr, k));

		scn.close();

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {

				int oi = map.get(nums[i]);

				if (Math.abs(i - oi) <= k) {
					return true;
				}

			}

			map.put(nums[i], i);

		}

		return false;

	}

}
