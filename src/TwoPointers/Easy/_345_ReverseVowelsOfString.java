package TwoPointers.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 345. Reverse Vowels of a String
 * 
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * 
 * Example 1:
 * Input: "hello"
 * Output: "holle"
 * 
 * Example 2:
 * Input: "leetcode"
 * Output: "leotcede"
 * 
 * link : https://leetcode.com/problems/reverse-vowels-of-a-string/
 */

public class _345_ReverseVowelsOfString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(reverseVowels(str));

		scn.close();
	}

	public static String reverseVowels(String s) {

		StringBuilder sb = new StringBuilder(s);

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			while (left < s.length() && !isVowel(sb.charAt(left))) {
				left++;
			}

			while (right >= 0 && !isVowel(sb.charAt(right))) {
				right--;
			}

			if (left < right) {
				char leftchar = sb.charAt(left);
				char rightchar = sb.charAt(right);

				sb.setCharAt(left, rightchar);
				sb.setCharAt(right, leftchar);

				left++;
				right--;
			}

		}
		
		return sb.toString() ;

	}

	public static boolean isVowel(char c) {

		c = Character.toLowerCase(c) ;
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
			return true;
		} else {
			return false;
		}
	}

}
