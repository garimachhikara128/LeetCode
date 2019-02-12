package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 485. Max Consecutive Ones
 * 
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * 
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * 
 * link : https://leetcode.com/problems/max-consecutive-ones/
 */

public class _485_MaxConsecutiveOnes {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(findMaxConsecutiveOnes(arr));

		scn.close();
	}

	public static int findMaxConsecutiveOnes(int[] nums) {

		int maxOnes = 0;
		int presentOnes = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 1) {
				presentOnes++;

				if (presentOnes > maxOnes) {
					maxOnes = presentOnes;
				}
			} else {
				presentOnes = 0;
			}
		}

		return maxOnes;

	}
}
