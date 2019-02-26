package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 667. Beautiful Arrangement II
 * Given two integers n and k, you need to construct a list which contains n different positive integers ranging from 1 to n and obeys the following requirement:
 * Suppose this list is [a1, a2, a3, ... , an], then the list [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] has exactly k distinct integers.
 * 
 * If there are multiple answers, print any of them.
 * 
 * Example 1:
 * Input: n = 3, k = 1
 * Output: [1, 2, 3]
 * Explanation: The [1, 2, 3] has three different positive integers ranging from 1 to 3, and the [1, 1] has exactly 1 distinct integer: 1.
 * 
 * Example 2:
 * Input: n = 3, k = 2
 * Output: [1, 3, 2]
 * Explanation: The [1, 3, 2] has three different positive integers ranging from 1 to 3, and the [2, 1] has exactly 2 distinct integers: 1 and 2.
 * 
 * link : https://leetcode.com/problems/beautiful-arrangement-ii/
 */

public class _667_BeautifulArrangementII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int k = scn.nextInt();

		int[] res = constructArray(n, k);

		for (int val : res) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		scn.close(); 
	}

	public static int[] constructArray(int n, int k) {

		int[] res = new int[n];
		int idx = 0;

		int left = 1;
		int right = n;

		while (left <= right) {

			if (idx < k) {
				res[idx] = (idx % 2 == 0) ? left : right;
			} else {
				res[idx] = (k % 2 == 0) ? res[idx - 1] - 1 : res[idx - 1] + 1;
			}

			if (idx % 2 == 0) {
				left++;
			} else {
				right--;
			}

			idx++;

		}

		return res;

	}

}
