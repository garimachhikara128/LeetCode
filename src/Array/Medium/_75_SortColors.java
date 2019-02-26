package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 75. Sort Colors
 * 
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * 
 * Note: You are not suppose to use the library's sort function for this problem.
 * 
 * Example:
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * 
 * link : https://leetcode.com/problems/sort-colors/
 *
 */

public class _75_SortColors {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];
		for(int i=0 ; i < arr.length ; i++) {
			arr[i] = scn.nextInt() ;
		}
		
		sortColors(arr);

		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

		scn.close();

	}

	public static void sortColors(int[] nums) {

		int i = 0;
		int j = 0;
		int k = nums.length - 1;

		while (j < k) {

			if (nums[j] == 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;

				i++;
				j++;
			} else if (nums[j] == 1) {
				j++;

			} else if (nums[j] == 2) {

				int temp = nums[j];
				nums[j] = nums[k];
				nums[k] = temp;

				k--;
			}

		}

	}

}
