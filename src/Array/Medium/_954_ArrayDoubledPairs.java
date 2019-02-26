package Array.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 954. Array of Doubled Pairs
 * 
 * Given an array of integers A with even length, return true if and only if it is possible to reorder it such that A[2 * i + 1] = 2 * A[2 * i] for every 0 <= i < len(A) / 2.
 * 
 * Example 1:
 * Input: [3,1,3,6]
 * Output: false
 * 
 * Example 2:
 * Input: [2,1,2,6]
 * Output: false
 * 
 * Example 3:
 * Input: [4,-2,2,-4]
 * Output: true
 * Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
 * 
 * Example 4:
 * Input: [1,2,4,16,8,4]
 * Output: false
 * 
 * link : https://leetcode.com/problems/array-of-doubled-pairs/
 */

public class _954_ArrayDoubledPairs {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] A = new int[n];

		for (int i = 0; i < A.length; i++) {
			A[i] = scn.nextInt();
		}

		System.out.println(canReorderDoubled(A));
		
		scn.close(); 
	}

	public static boolean canReorderDoubled(int[] A) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int val : A) {
			if (map.containsKey(val)) {
				map.put(val, map.get(val) + 1);
			} else {
				map.put(val, 1);
			}
		}

		Arrays.sort(A);
		for (int key : A) {

			if (map.get(key) <= 0 || !map.containsKey(2 * key) || map.get(2 * key) <= 0) {
				continue;
			}

			map.put(key, map.get(key) - 1);
			map.put(2 * key, map.get(2 * key) - 1);

		}

		for (int key : map.keySet()) {
			if (map.get(key) != 0) {
				return false;
			}
		}
		
		return true ;

	}

}
