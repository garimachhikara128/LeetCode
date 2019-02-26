package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 11. Container With Most Water
 * 
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container and n is at least 2.
 * 
 * link : https://leetcode.com/problems/container-with-most-water/
 */

public class _11_ContainerWithMostWater {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(maxArea(arr));
		
		scn.close(); 

	}

	public static int maxArea(int[] height) {

		int maxWater = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {

			int currWater = Math.min(height[left], height[right]) * (right - left);

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}

			if (currWater > maxWater) {
				maxWater = currWater;
			}

		}

		return maxWater ;
	}

}
