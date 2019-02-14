package Array.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 14-Feb-2019
 *
 */

/**
 * 78. Subsets
 * 
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * Note: The solution set must not contain duplicate subsets.
 * 
 * Example: 
 * Input: nums = [1,2,3]
 * Output:
 * 		[
 * 			[3],
 * 			[1],
 * 			[2],
 * 			[1,2,3],
 * 			[1,3],
 * 			[2,3],
 * 			[1,2],
 * 			[]
 * 		]
 * 
 * link : https://leetcode.com/problems/subsets/
 */

public class _78_Subsets {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(subsets(arr));

		scn.close();

	}

	public static List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < Math.pow(2, nums.length); i++) {

			int n = i;

			List<Integer> subans = new ArrayList<>();
			int c = 0;

			while (n != 0) {

				if (n % 2 != 0) {
					subans.add(nums[c]);
				}

				c++;
				n = n / 2;

			}

			ans.add(subans);

		}

		return ans;

	}

}
