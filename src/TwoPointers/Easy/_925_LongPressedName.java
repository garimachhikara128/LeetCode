package TwoPointers.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 925. Long Pressed Name
 * 
 * Your friend is typing his name into a keyboard.  
 * Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
 * You examine the typed characters of the keyboard.  
 * Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
 * 
 * Example 1:
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 * Explanation: 'a' and 'e' in 'alex' were long pressed.
 * 
 * Example 2:
 * Input: name = "saeed", typed = "ssaaedd"
 * Output: false
 * Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
 * 
 * Example 3:
 * Input: name = "leelee", typed = "lleeelee"
 * Output: true
 * 
 * Example 4:
 * Input: name = "laiden", typed = "laiden"
 * Output: true
 * Explanation: It's not necessary to long press any character.
 * 
 * link : https://leetcode.com/problems/long-pressed-name/
 */

public class _925_LongPressedName {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String name = scn.next();
		String typed = scn.next();

		System.out.println(isLongPressedName(name, typed));

		scn.close();
	}

	public static boolean isLongPressedName(String name, String typed) {

		int i = 0;
		int j = 0;

		while (i < name.length() && j < typed.length()) {

			char chname = ' ';
			char chtyped = ' ';
			int c1 = 1;
			int c2 = 1;

			// count the no. of consecutive duplicates in name
			while (i < name.length() - 1 && name.charAt(i) == name.charAt(i + 1)) {
				c1++;
				i++;
			}
			chname = name.charAt(i);

			// count the no. of consecutive duplicates in typed
			while (j < typed.length() - 1 && typed.charAt(j) == typed.charAt(j + 1)) {
				c2++;
				j++;
			}
			chtyped = typed.charAt(j);

			// in name & typed both should have same char and count of name char > count of
			// typed char
			if (c1 > c2 || chname != chtyped) {
				return false;
			}

			i++;
			j++;

		}

		return i == name.length() && j == typed.length();

	}
}
