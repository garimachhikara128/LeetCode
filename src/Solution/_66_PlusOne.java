package Solution;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 66. Plus One
 * 
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * 
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * 
 * Example 2:
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * 
 * link : https://leetcode.com/problems/plus-one/
 */

public class _66_PlusOne {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		display(plusOne(arr));

		scn.close();

	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static int[] plusOne(int[] digits) {

		ArrayList<Integer> list = new ArrayList<>();

		int carry = 1;

		for (int i = digits.length - 1; i >= 0; i--) {

			int sum = carry + digits[i];
			list.add(sum % 10);
			carry = sum / 10;

		}

		if (carry != 0)
			list.add(carry);

		int[] ans = new int[list.size()];

		for (int i = 0; i < ans.length; i++) {
			ans[i] = list.get(list.size() - 1 - i);
		}

		return ans;
	}
}
