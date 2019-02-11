package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 121. Best Time to Buy and Sell Stock
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * Note that you cannot sell a stock before you buy one.
 * 
 * Example 1:
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: 
 * Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * 
 * Example 2:
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: 
 * In this case, no transaction is done, i.e. max profit = 0.
 * 
 * link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class _121_BestTimeBuySellStock {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(maxProfit(arr));

		scn.close();

	}

	public static int maxProfit(int[] prices) {

		if(prices.length == 0)
			return 0 ;
		
		int maxDiffTillNow = 0;
		int minNumTillNow = prices[0];

		for (int i = 1; i < prices.length; i++) {

			if (prices[i] - minNumTillNow > maxDiffTillNow) {
				maxDiffTillNow = prices[i] - minNumTillNow;
			}

			if (prices[i] < minNumTillNow) {
				minNumTillNow = prices[i];
			}

		}

		return maxDiffTillNow;

	}

}
