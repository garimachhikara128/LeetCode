package TwoPointers.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 844. Backspace String Compare
 * 
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. 
 * # means a backspace character.
 * 
 * Example 1:
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * 
 * Example 2:
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * 
 * Example 3:
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * 
 * Example 4:
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * 
 * link : https://leetcode.com/problems/backspace-string-compare/
 */

public class _844_BackspaceStringCompare {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String S = scn.next();
		String T = scn.next();

		System.out.println(backspaceCompare(S, T));

		scn.close();
	}

	public static boolean backspaceCompare(String S, String T) {

		StringBuilder sbS = new StringBuilder();
		StringBuilder sbT = new StringBuilder();

		for (int i = 0; i < S.length(); i++) {

			if (S.charAt(i) == '#') {
				if (sbS.length() > 0) {
					sbS.deleteCharAt(sbS.length() - 1);
				}
			} else {
				sbS.append(S.charAt(i));
			}
		}

		for (int i = 0; i < T.length(); i++) {

			if (T.charAt(i) == '#') {
				if (sbT.length() > 0) {
					sbT.deleteCharAt(sbT.length() - 1);
				}
			} else {
				sbT.append(T.charAt(i));
			}
		}
		
		return sbS.toString().equals(sbT.toString()) ;

	}

}
