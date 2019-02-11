package Solution;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 16. 3Sum Closest
 * 
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. 
 * You may assume that each input would have exactly one solution.
 * 
 * Example:
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * link : https://leetcode.com/problems/3sum-closest/
 */

public class _16_3SumClosest {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		System.out.println(threeSumClosest(arr, target));

		scn.close();
	}

	public static int threeSumClosest(int[] nums, int target) {

		Arrays.sort(nums);

		int gsum = nums[0] + nums[1] + nums[2];

		for (int i = 0; i < nums.length; i++) {

			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {

				int sum = nums[i] + nums[j] + nums[k];

				if (Math.abs(target - sum) < Math.abs(target - gsum)) {
					gsum = sum;
				}

				if (sum > target) {
					k--;
				} else if (sum < target) {
					j++;
				} else {
					break;
				}
			}

			if (gsum == target) {
				break;
			}
		}

		return gsum;

	}

}
