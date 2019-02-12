package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/** 
 * 283. Move Zeroes
 * 
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * 
 * link : https://leetcode.com/problems/move-zeroes/
 */

public class _283_MoveZeroes {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		moveZeroes(arr);

		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

		scn.close();
	}

	public static void moveZeroes(int[] nums) {

		int countNonZero = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				swap(nums, countNonZero, i);
				countNonZero++;
			}
		}

	}

	public static void swap(int[] nums, int i, int j) {

		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
