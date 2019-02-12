package Array.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 448. Find All Numbers Disappeared in an Array
 * 
 * Given an array of integers where 1 <= a[i] <= n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 * 
 * Example:
 * Input: [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 *
 * link : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */

public class _448_FindNumbersDisappearedArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(findDisappearedNumbers(arr));
		
		scn.close();
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {

			int val = Math.abs(nums[i]) - 1;

			if (nums[val] > 0) {
				nums[val] = -nums[val];
			}

		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}

		return list;

	}

}
