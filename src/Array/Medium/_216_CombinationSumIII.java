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
 * 216. Combination Sum III
 * 
 * Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
 * Note:
 * All numbers will be positive integers.
 * The solution set must not contain duplicate combinations.
 * 
 * Example 1:
 * Input: k = 3, n = 7
 * Output: [[1,2,4]]
 * 
 * Example 2:
 * Input: k = 3, n = 9
 * Output: [[1,2,6], [1,3,5], [2,3,4]]
 * 
 * link : https://leetcode.com/problems/combination-sum-iii/
 * 
 */

public class _216_CombinationSumIII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int k = scn.nextInt();
		int n = scn.nextInt();

		System.out.println(combinationSum3(k, n));

		scn.close();

	}

	public static List<List<Integer>> combinationSum3(int k, int n) {

		return combinationSumRec(k, n, 0, 0);
	}

	public static List<List<Integer>> combinationSumRec(int k, int n, int sum, int last) {

		if (k == 0 && sum == n) {
			List<List<Integer>> br = new ArrayList<>();
			br.add(new ArrayList<>());
			return br;
		}

		if (k < 0) {
			List<List<Integer>> br = new ArrayList<>();
			return br;
		}

		List<List<Integer>> mr = new ArrayList<>();

		for (int i = last + 1; i <= 9; i++) {

			List<List<Integer>> rr = combinationSumRec(k - 1, n, sum + i, i);

			for (List<Integer> rrlist : rr) {
				rrlist.add(i);
			}

			mr.addAll(rr);
		}

		return mr;

	}

}
