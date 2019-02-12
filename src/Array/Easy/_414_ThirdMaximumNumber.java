package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/** 
 * 414. Third Maximum Number
 * 
 * Given a non-empty array of integers, return the third maximum number in this array. 
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 * 
 * Example 1:
 * Input: [3, 2, 1]
 * Output: 1
 * Explanation: The third maximum is 1.
 * 
 * Example 2:
 * Input: [1, 2]
 * Output: 2
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * 
 * Example 3:
 * Input: [2, 2, 3, 1]
 * Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 * 
 * link : https://leetcode.com/problems/third-maximum-number/
 */

public class _414_ThirdMaximumNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(thirdMax(arr));

		scn.close();

	}

	public static int thirdMax(int[] nums) {

		// find first max
		long m1, m2, m3;
		m1 = m2 = m3 = Long.MIN_VALUE;

		for (int val : nums) {
			if (val > m1)
				m1 = val;
		}

		// find second max
		for (int val : nums) {
			if (val > m2 && val < m1)
				m2 = val;
		}

		// find third max
		for (int val : nums) {
			if (val > m3 && val < m2)
				m3 = val;

		}

		if (m2 == Long.MIN_VALUE || m3 == Long.MIN_VALUE)
			return (int) m1;

		return (int) m3;

	}
}
