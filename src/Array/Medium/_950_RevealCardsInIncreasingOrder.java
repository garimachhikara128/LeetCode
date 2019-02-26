package Array.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 950. Reveal Cards In Increasing Order
 * 
 * In a deck of cards, every card has a unique integer.  
 * You can order the deck in any order you want.
 * Initially, all the cards start face down (unrevealed) in one deck.
 * 
 * Now, you do the following steps repeatedly, until all cards are revealed:
 * Take the top card of the deck, reveal it, and take it out of the deck.
 * If there are still cards in the deck, put the next top card of the deck at the bottom of the deck.
 * If there are still unrevealed cards, go back to step 1.  Otherwise, stop.
 * 
 * Return an ordering of the deck that would reveal the cards in increasing order.
 * The first entry in the answer is considered to be the top of the deck.
 * 
 * Example 1:
 * Input: [17,13,11,2,3,5,7]
 * Output: [2,13,3,11,5,17,7]
 * Explanation:  
 * We get the deck in the order [17,13,11,2,3,5,7] (this order doesn't matter), and reorder it.
 * After reordering, the deck starts as [2,13,3,11,5,17,7], where 2 is the top of the deck.
 * We reveal 2, and move 13 to the bottom.  The deck is now [3,11,5,17,7,13].
 * We reveal 3, and move 11 to the bottom.  The deck is now [5,17,7,13,11].
 * We reveal 5, and move 17 to the bottom.  The deck is now [7,13,11,17].
 * We reveal 7, and move 13 to the bottom.  The deck is now [11,17,13].
 * We reveal 11, and move 17 to the bottom.  The deck is now [13,17].
 * We reveal 13, and move 17 to the bottom.  The deck is now [17].
 * We reveal 17.
 * 
 * Since all the cards revealed are in increasing order, the answer is correct.
 * 
 * link : https://leetcode.com/problems/reveal-cards-in-increasing-order/
 *
 */

public class _950_RevealCardsInIncreasingOrder {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int[] ans = deckRevealedIncreasing(arr);

		for (int val : ans) {
			System.out.print(val + " ");
		}
		System.out.println();

		scn.close();

	}

	public static int[] deckRevealedIncreasing(int[] deck) {

		Arrays.sort(deck);
		
		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 0; i < deck.length; i++) {
			list.addLast(i);
		}

		int[] ans = new int[deck.length];

		for (int val : deck) {

			ans[list.removeFirst()] = val;

			if (!list.isEmpty()) {
				list.addLast(list.removeFirst());
			}

		}
		
		return ans ;

	}

}
