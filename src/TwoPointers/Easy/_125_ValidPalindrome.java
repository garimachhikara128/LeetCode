package TwoPointers.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 125. Valid Palindrome
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * 
 * Example 2:
 * Input: "race a car"
 * Output: false
 * 
 * link : https://leetcode.com/problems/valid-palindrome/
 */

public class _125_ValidPalindrome {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(isPalindrome(str));

		scn.close();
	}

	public static boolean isPalindrome(String s) {

		s = s.toLowerCase();

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}

			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}

			if (left < right) {

				if (s.charAt(left) != s.charAt(right)) {
					return false;
				}

				left++;
				right--;
			}

		}

		return true;

	}

}
