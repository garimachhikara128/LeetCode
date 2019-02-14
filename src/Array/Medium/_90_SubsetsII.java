package Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Garima Chhikara
 * @date 14-Feb-2019
 *
 */

/**
 * 90. Subsets II
 * 
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
 * Note: The solution set must not contain duplicate subsets.
 * 
 * Example:
 * Input: [1,2,2]
 * Output:
 * 		[
 * 			[2],
 * 			[1],
 * 			[1,2,2],
 * 			[2,2],
 * 			[1,2],
 * 			[]
 * 		]
 * 
 * link : https://leetcode.com/problems/subsets-ii/
 */

public class _90_SubsetsII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(subsetsWithDup(arr));

		scn.close();

	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {

		Arrays.sort(nums);

		Set<String> set = new HashSet<>();

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

			if (!set.contains(subans.toString()))
				ans.add(subans);

			set.add(subans.toString());

		}

		return ans;

	}

}
