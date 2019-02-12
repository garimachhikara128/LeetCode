package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 88. Merge Sorted Array
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * 
 * Example:
 * 
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 * 
 * link : https://leetcode.com/problems/merge-sorted-array/
 */

public class _88_MergeSortedArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int m = scn.nextInt();
		int[] arr1 = new int[m];

		for (int i = 0; i < m; i++) {
			arr1[i] = scn.nextInt();
		}

		int n = scn.nextInt();
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr2[i] = scn.nextInt();
		}

		merge(arr1, 3, arr2, n);

		for (int val : arr1)
			System.out.print(val + " ");

		scn.close();
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1;
		int j = n - 1;
		int k = nums1.length - 1;

		while (i >= 0 && j >= 0) {

			if (nums1[i] < nums2[j]) {
				nums1[k] = nums2[j];
				j--;
				k--;
			} else {
				nums1[k] = nums1[i];
				i--;
				k--;
			}

		}

		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}

		while (i >= 0) {
			nums1[k] = nums1[i];
			i--;
			k--;
		}

	}
}
