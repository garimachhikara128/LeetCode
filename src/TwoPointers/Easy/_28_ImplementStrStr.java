package TwoPointers.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 28. Implement strStr()
 * 
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * 
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * 
 * link : https://leetcode.com/problems/implement-strstr/
 */

public class _28_ImplementStrStr {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String src = scn.nextLine();
		String pattern = scn.nextLine();

		System.out.println(strStr(src, pattern));

		scn.close();
	}

	public static int strStr(String haystack, String needle) {

		for (int i = 0; i <= haystack.length() - needle.length(); i++) {

			int j = 0;
			while (j < needle.length()) {

				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}

				j++;
			}
			
			if(j == needle.length()) {
				return i ;
			}

		}
		
		return -1 ;

	}

}
