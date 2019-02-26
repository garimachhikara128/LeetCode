package TwoPointers.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 344. Reverse String
 * 
 * Write a function that reverses a string. 
 * The input string is given as an array of characters char[].
 * 
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
 * 
 * Example 1:
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * 
 * Example 2:
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * 
 * link : https://leetcode.com/problems/reverse-string/
 */

public class _344_ReverseString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.next();

		char[] carr = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			carr[i] = s.charAt(i);
		}

		reverseString(carr);

		for (char val : carr) {
			System.out.print(val);
		}
		System.out.println();

		scn.close();
	}

	public static void reverseString(char[] s) {

		int left = 0;
		int right = s.length - 1;

		while (left < right) {

			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left++;
			right--;

		}

	}
}
