package Array.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 39. Combination Sum
 * 
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 * The same repeated number may be chosen from candidates unlimited number of times.
 * 
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * 
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * 	[
 * 		[7],
 * 		[2,2,3]
 * 	]
 * 
 * Example 2:
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 *  [
 *  	[2,2,2,2],
 *  	[2,3,3],
 *  	[3,5]
 *  ]
 * 
 * link : https://leetcode.com/problems/combination-sum/
 * 
 */

public class _39_CombinationSum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		System.out.println(combinationSum(arr, target));

		scn.close();

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		return combinationSumRec2(candidates, target, 0);
	}

	public static List<List<Integer>> combinationSumRec(int[] candidates, int target, int idx) {

		if (target == 0) {
			List<List<Integer>> br = new ArrayList<>();
			br.add(new ArrayList<>());
			return br;
		}

		if (target < 0 || idx >= candidates.length) {
			List<List<Integer>> br = new ArrayList<>();
			return br;
		}

		List<List<Integer>> mr = new ArrayList<>();

		List<List<Integer>> no = combinationSumRec(candidates, target, idx + 1); // no
		List<List<Integer>> yes = combinationSumRec(candidates, target - candidates[idx], idx); // yes

		mr.addAll(no);

		for (List<Integer> rr : yes) {
			rr.add(candidates[idx]);
			mr.add(rr);
		}

		return mr;

	}

	public static List<List<Integer>> combinationSumRec2(int[] candidates, int target, int idx) {

		if (target == 0) {
			List<List<Integer>> br = new ArrayList<>();
			br.add(new ArrayList<>());
			return br;
		}

		if (target < 0 || idx >= candidates.length) {
			List<List<Integer>> br = new ArrayList<>();
			return br;
		}

		List<List<Integer>> mr = new ArrayList<>();

		for (int i = idx; i < candidates.length; i++) {
			List<List<Integer>> rr = combinationSumRec2(candidates, target - candidates[i], i);

			for (List<Integer> rrlist : rr) {
				rrlist.add(candidates[i]);
			}

			mr.addAll(rr);
		}

		return mr;

	}

}
