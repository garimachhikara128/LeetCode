package Solution;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 532. K-diff Pairs in an Array 
 * 
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. 
 * Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.
 *  
 * Example 1:
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of unique pairs.
 * 
 * Example 2:
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 * 
 * Example 3:
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 *
 * link : https://leetcode.com/problems/k-diff-pairs-in-an-array/
 */

public class _531_KDiffPairsArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();
		System.out.println(findPairs(arr, k));

		scn.close();

	}

	public static int findPairs(int[] nums, int k) {

		if(k < 0)
			return 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int val = nums[i];

			if (map.containsKey(val)) {
				map.put(val, map.get(val) + 1);
			} else {
				map.put(val, 0);
			}
		}

		int count = 0;

		for (int val : map.keySet()) {

			if (k == 0) {

				if (map.get(val) > 0)
					count += 1;

			} else {
				if (map.containsKey(val + k)) {
					count++;
				}
			}

		}

		return count;

	}

}
