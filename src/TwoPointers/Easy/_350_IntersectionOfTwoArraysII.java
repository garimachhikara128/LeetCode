package TwoPointers.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 350. Intersection of Two Arrays II
 * 
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * 
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * 
 * link : https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */

public class _350_IntersectionOfTwoArraysII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		int[] nums1 = new int[n1];

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = scn.nextInt();
		}

		int n2 = scn.nextInt();
		int[] nums2 = new int[n2];

		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = scn.nextInt();
		}

		int[] res = intersect_A1(nums1, nums2);

		for (int val : res) {
			System.out.print(val + " ");
		}
		System.out.println();

		scn.close();

	}

	public static int[] intersect_A1(int[] nums1, int[] nums2) {

		ArrayList<Integer> list = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int val : nums1) {

			if (map.containsKey(val)) {
				map.put(val, map.get(val) + 1);
			} else {
				map.put(val, 1);
			}
		}

		for (int val : nums2) {

			if (map.containsKey(val) && map.get(val) > 0) {
				list.add(val);
				map.put(val, map.get(val) - 1);
			}
		}

		int[] res = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			res[i] = list.get(i);
		}

		return res;
	}

	public static int[] intersect_A2(int[] nums1, int[] nums2) {

		ArrayList<Integer> list = new ArrayList<>();

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0;
		int j = 0;

		while (i < nums1.length && j < nums2.length) {

			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				list.add(nums1[i]);
				i++;
				j++;
			}

		}

		int[] res = new int[list.size()];

		for (int k = 0; k < list.size(); k++) {
			res[k] = list.get(k);
		}

		return res;
	}
}
