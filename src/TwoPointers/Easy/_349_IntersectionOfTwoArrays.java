package TwoPointers.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 349. Intersection of Two Arrays
 * 
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * 
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * 
 * link : https://leetcode.com/problems/intersection-of-two-arrays/
 */

public class _349_IntersectionOfTwoArrays {

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

		int[] res = intersection(nums1, nums2);

		for (int val : res) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		scn.close(); 

	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		ArrayList<Integer> list = new ArrayList<>();

		HashSet<Integer> set1 = new HashSet<>();

		for (int val : nums1) {
			set1.add(val);
		}

		for (int val : nums2) {
			if (set1.contains(val)) {
				list.add(val);
				set1.remove(val);
			}
		}

		int[] res = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			res[i] = list.get(i);
		}

		return res;

	}

}
