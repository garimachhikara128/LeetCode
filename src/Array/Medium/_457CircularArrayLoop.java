package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 457. Circular Array Loop
 * 
 * You are given a circular array nums of positive and negative integers. 
 * If a number k at an index is positive, then move forward k steps. 
 * Conversely, if it's negative (-k), move backward k steps. 
 * Since the array is circular, you may assume that the last element's next element is the first element, and the first element's previous element is the last element.
 * Determine if there is a loop (or a cycle) in nums. 
 * A cycle must start and end at the same index and the cycle's length > 1. 
 * Furthermore, movements in a cycle must all follow a single direction. 
 * In other words, a cycle must not consist of both forward and backward movements.
 * 
 * Example 1:
 * Input: [2,-1,1,2,2]
 * Output: true
 * Explanation: There is a cycle, from index 0 -> 2 -> 3 -> 0. The cycle's length is 3.
 * 
 * Example 2:
 * Input: [-1,2]
 * Output: false
 * Explanation: The movement from index 1 -> 1 -> 1 ... is not a cycle, because the cycle's length is 1. By definition the cycle's length must be greater than 1.
 * 
 * Example 3:
 * Input: [-2,1,-1,-2,-2]
 * Output: false
 * Explanation: The movement from index 1 -> 2 -> 1 -> ... is not a cycle, because movement from index 1 -> 2 is a forward movement, but movement from index 2 -> 1 is a backward movement. All movements in a cycle must follow a single direction.
 *
 * link : https://leetcode.com/problems/circular-array-loop/
 * 
 */

public class _457CircularArrayLoop {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(circularArrayLoop(arr));

		scn.close();

	}

	public static boolean circularArrayLoop(int[] nums) {

		boolean[] visited = new boolean[nums.length];

		for (int i = 0; i < nums.length; i++) {

			boolean f = false ;
			boolean b = false ;
			boolean isCycle = false ;
			
			if(nums[i] > 0) {
				f = true ;
			}else {
				b = true ;
			}
			
			
			
			
			
			
			
			
		}

	}

}
