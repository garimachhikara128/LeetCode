package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 565. Array Nesting
 * 
 * A zero-indexed array A of length N contains all integers from 0 to N-1. 
 * Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } subjected to the rule below.
 * 
 * Suppose the first element in S starts with the selection of element A[i] of index = i, the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy, we stop adding right before a duplicate element occurs in S.
 * 
 * Example 1:
 * Input: A = [5,4,0,3,1,6,2]
 * Output: 4
 * Explanation: 
 * A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2. 
 * One of the longest S[K]: S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
 * 
 * link : https://leetcode.com/problems/array-nesting/
 * 
 */

public class _565_ArrayNesting {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(arrayNesting_A2(arr));

		scn.close();

	}

	// O(n^2)
	public static int arrayNesting_A1(int[] nums) {

		int maxCount = 0;

		for (int i = 0; i < nums.length; i++) {

			int count = 0;
			boolean[] visited = new boolean[nums.length];

			int j = i;

			while (visited[j] == false) {
				visited[j] = true;
				j = nums[j];
				count++;
			}

			if (count > maxCount) {
				maxCount = count;
			}
		}

		return maxCount;

	}

	// O(n)
	public static int arrayNesting_A2(int[] nums) {

		boolean[] visited = new boolean[nums.length];
		int maxCount = 0;

		for (int i = 0; i < nums.length; i++) {

			if (visited[i] == false) {
				
				int count = 0;

				int j = i;

				while (visited[j] == false) {
					visited[j] = true;
					j = nums[j];
					count++;
				}

				if (count > maxCount) {
					maxCount = count;
				}
			}
		}

		return maxCount;

	}
}
