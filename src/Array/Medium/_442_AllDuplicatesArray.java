package Array.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 442. Find All Duplicates in an Array
 * 
 * Given an array of integers, 1 <= a[i] <= n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 * Could you do it without extra space and in O(n) runtime?
 * 
 * Example:
 * Input: [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 *
 * link : https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */

public class _442_AllDuplicatesArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(findDuplicates(arr));

		scn.close();

	}

	public static List<Integer> findDuplicates(int[] nums) {

		List<Integer> ans = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {

			int val = Math.abs(nums[i]);

			if (nums[val - 1] < 0) {
				ans.add(val);
			} else {
				nums[val - 1] = -nums[val - 1];
			}

		}

		return ans;
	}

}
