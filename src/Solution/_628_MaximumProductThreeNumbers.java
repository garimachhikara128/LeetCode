package Solution;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 628. Maximum Product of Three Numbers
 * 
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 * 
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 * 
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 * 
 * link : https://leetcode.com/problems/maximum-product-of-three-numbers/
 */

public class _628_MaximumProductThreeNumbers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(maximumProduct(arr));

		scn.close();
	}

	public static int maximumProduct(int[] nums) {

		Arrays.sort(nums);

		int l1 = nums[nums.length - 1];
		int l2 = nums[nums.length - 2];
		int l3 = nums[nums.length - 3];

		int product1 = l1 * l2 * l3;

		int s1 = nums[0];
		int s2 = nums[1];

		int product2 = s1 * s2 * l1;

		return Math.max(product1, product2);

	}

}
