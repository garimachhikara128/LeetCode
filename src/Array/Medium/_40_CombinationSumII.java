package Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 40. Combination Sum II
 * 
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 * Each number in candidates may only be used once in the combination.
 * 
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * 
 * Example 1:
 * Input: candidates = [10,1,2,7,6,1,5], target = 8,
 * A solution set is:
 * 	[
 * 		[1, 7],
 * 		[1, 2, 5],
 * 		[2, 6],
 * 		[1, 1, 6]
 *  ]
 *  
 *  Example 2:
 *  Input: candidates = [2,5,2,1,2], target = 5,
 *  A solution set is:
 *  [
 *  	[1,2,2],
 *  	[5]
 *  ]
 * 
 * link : https://leetcode.com/problems/combination-sum-ii/
 * 
 */

public class _40_CombinationSumII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		System.out.println(combinationSum2(arr, target));

		scn.close();

	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		
		Arrays.sort(candidates);
		return combinationSumRec(candidates, target, 0, true);
	}

	public static List<List<Integer>> combinationSumRec(int[] candidates, int target, int idx, boolean flag) {

		if (target == 0) {
			List<List<Integer>> br = new ArrayList<>();
			br.add(new ArrayList<>());
			return br;
		}

		if (target < 0 || idx >= candidates.length) {
			List<List<Integer>> br = new ArrayList<>();
			return br;
		}

		if (idx >= 1&& candidates[idx] == candidates[idx - 1] && flag) {
			List<List<Integer>> br = new ArrayList<>();
			return br;
		}

		List<List<Integer>> mr = new ArrayList<>();

		for (int i = idx; i < candidates.length; i++) {

//			if (i > idx && candidates[i] == candidates[i - 1]) {
//				continue;
//			}

			List<List<Integer>> rr = combinationSumRec(candidates, target - candidates[i], i + 1, false);

			for (List<Integer> rrlist : rr) {
				rrlist.add(candidates[i]);
			}

			mr.addAll(rr);
		}

		return mr;

	}

}
