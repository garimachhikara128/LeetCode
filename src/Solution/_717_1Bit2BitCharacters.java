package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 717. 1-bit and 2-bit Characters
 * 
 * We have two special characters. 
 * The first character can be represented by one bit 0. 
 * The second character can be represented by two bits (10 or 11).
 * 
 * Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
 * 
 * Example 1:
 * Input: bits = [1, 0, 0]
 * Output: True
 * Explanation: 
 * The only way to decode it is two-bit character and one-bit character. 
 * So the last character is one-bit character.
 * 
 * Example 2:
 * Input: bits = [1, 1, 1, 0]
 * Output: False
 * Explanation: 
 * The only way to decode it is two-bit character and two-bit character. 
 * So the last character is NOT one-bit character.
 *
 * link : https://leetcode.com/problems/1-bit-and-2-bit-characters/
 */

public class _717_1Bit2BitCharacters {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(isOneBitCharacter(arr));

		scn.close();

	}

	public static boolean isOneBitCharacter(int[] bits) {

		boolean ans = true;

		int i = 0;
		while (i < bits.length) {

			if (bits[i] == 1) {
				i = i + 2;
				ans = false;
			} else {
				i = i + 1;
				ans = true;
			}
		}

		return ans;
	}

}
