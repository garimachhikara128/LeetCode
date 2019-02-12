package Array.Easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 697. Degree of an Array
 * 
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
 * 
 * Example 1:
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation: 
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 * 
 * Example 2:
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 * 
 *  link : https://leetcode.com/problems/degree-of-an-array/
 */

public class _697_DegreeArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(findShortestSubArray(arr));

		scn.close();

	}

	public static int findShortestSubArray(int[] nums) {

		int degree = 0;

		HashMap<Integer, Integer> frequency = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int val = nums[i];
			if (frequency.containsKey(val)) {

				int of = frequency.get(val);
				int nf = of + 1;
				frequency.put(val, nf);

				if (nf > degree)
					degree = nf;

			} else {
				frequency.put(val, 1);
			}
		}

		HashMap<Integer, Integer> firstIndex = new HashMap<>();
		HashMap<Integer, Integer> lastIndex = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (!firstIndex.containsKey(nums[i])) {
				firstIndex.put(nums[i], i);
			}

		}

		for (int i = nums.length - 1; i >= 0; i--) {

			if (!lastIndex.containsKey(nums[i])) {
				lastIndex.put(nums[i], i);
			}

		}

		int min = Integer.MAX_VALUE;

		for (Integer key : frequency.keySet()) {

			if (frequency.get(key) >= degree) {

				int val = lastIndex.get(key) - firstIndex.get(key) + 1;

				if (val < min)
					min = val;

			}

		}

		return min;

	}

}
