package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 746. Min Cost Climbing Stairs
 * 
 * On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
 * Once you pay the cost, you can either climb one or two steps. 
 * You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.
 * 
 * Example 1:
 * Input: cost = [10, 15, 20]
 * Output: 15
 * Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
 * 
 * Example 2:
 * Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * Output: 6
 * Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
 * 
 * link : https://leetcode.com/problems/min-cost-climbing-stairs/
 */

public class _746_MinCostClimbingStairs {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(minCostClimbingStairs(arr));

		scn.close();

	}

	public static int minCostClimbingStairs(int[] cost) {

		int[] strg = new int[cost.length + 1];
		strg[strg.length - 1] = 0;
		strg[strg.length - 2] = cost[cost.length - 1];

		for (int i = strg.length - 3; i >= 0; i--) {

			int step1 = strg[i + 1];
			int step2 = strg[i + 2];

			strg[i] = Math.min(step1, step2) + cost[i];
		}

		return Math.min(strg[0], strg[1]);

	}

}
