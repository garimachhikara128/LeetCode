package Array.Easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 914. X of a Kind in a Deck of Cards
 * 
 * In a deck of cards, each card has an integer written on it.
 * Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:
 * 		Each group has exactly X cards.
 * 		All the cards in each group have the same integer.
 * 
 * Example 1:
 * Input: [1,2,3,4,4,3,2,1]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[3,3],[4,4]
 * 
 * Example 2:
 * Input: [1,1,1,2,2,2,3,3]
 * Output: false
 * Explanation: No possible partition.
 * 
 * Example 3:
 * Input: [1]
 * Output: false
 * Explanation: No possible partition.
 * 
 * Example 4:
 * Input: [1,1]
 * Output: true
 * Explanation: Possible partition [1,1]
 * 
 * Example 5:
 * Input: [1,1,2,2,2,2]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[2,2]
 * 
 * link : https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 */

public class _914_XKindDeckCards {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(hasGroupsSizeX(arr));

		scn.close();

	}

	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public static boolean hasGroupsSizeX(int[] deck) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < deck.length; i++) {

			if (map.containsKey(deck[i])) {
				int of = map.get(deck[i]);
				int nf = of + 1;
				map.put(deck[i], nf);
			} else {
				map.put(deck[i], 1);
			}
		}

		int ans = map.get(deck[0]);

		for (int val : map.keySet()) {
			ans = gcd(ans, map.get(val));
		}

		return ans > 1;

	}

	public static int gcd(int divident, int divisor) {

		while (divident % divisor != 0) {

			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;

		}

		return divisor;

	}

}
