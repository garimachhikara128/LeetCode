package Solution;

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
 * 18. 4Sum
 * 
 * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? 
 * Find all unique quadruplets in the array which gives the sum of target.
 * Note: The solution set must not contain duplicate quadruplets.
 * 
 * Example:
 * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
 * A solution set is:
 * [
 * 		[-1,  0, 0, 1],
 * 		[-2, -1, 1, 2],
 * 		[-2,  0, 0, 2]
 * ]
 *
 * link : https://leetcode.com/problems/4sum/
 */

public class _18_4Sum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt() ;

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		System.out.println(fourSum(arr, target));

		scn.close();
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {

		HashSet<String> set = new HashSet<>();

		List<List<Integer>> ans = new ArrayList<>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				
				int k = j + 1;
				int l = nums.length - 1;

				while (k < l) {

					int sum = nums[i] + nums[j] + nums[k] + nums[l] ;
					
					if (sum > target) {
						l--;
					} else if (sum < target) {
						k++;
					} else {

						String check = "" + nums[i] + nums[j] + nums[k] + nums[l];

						if (!set.contains(check)) {
							ArrayList<Integer> subans = new ArrayList<>();
							subans.add(nums[i]);
							subans.add(nums[j]);
							subans.add(nums[k]);
							subans.add(nums[l]);
							ans.add(subans);

							set.add(check);
						}

						k++;
						l--;
					}
				}
			}
		}

		return ans;
	}

}
