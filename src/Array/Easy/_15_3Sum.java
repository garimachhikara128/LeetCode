package Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 15. 3Sum
 * 
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 * Note: The solution set must not contain duplicate triplets.
 * 
 * Example: 
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * A solution set is:
 * [
 * 		[-1, 0, 1],
 * 		[-1, -1, 2]
 * ]
 *
 * link : https://leetcode.com/problems/3sum/
 */

public class _15_3Sum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt() ;

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(threeSum(arr));

		scn.close();
	}

	public static List<List<Integer>> threeSum(int[] nums) {

		HashSet<String> set = new HashSet<>();

		List<List<Integer>> ans = new ArrayList<>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {

			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {

				if (nums[i] + nums[j] + nums[k] > 0) {
					k--;
				} else if (nums[i] + nums[j] + nums[k] < 0) {
					j++;
				} else {

					String check = "" + nums[i] + nums[j] + nums[k];

					if (!set.contains(check)) {
						ArrayList<Integer> subans = new ArrayList<>();
						subans.add(nums[i]);
						subans.add(nums[j]);
						subans.add(nums[k]);
						ans.add(subans);

						set.add(check);
					}

					j++;
					k--;
				}
			}
		}

		return ans;
	}

}
