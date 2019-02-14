package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 14-Feb-2019
 *
 */

/**
 * 495. Teemo Attacking
 * 
 * In LOL world, there is a hero called Teemo and his attacking can make his enemy Ashe be in poisoned condition. 
 * Now, given the Teemo's attacking ascending time series towards Ashe and the poisoning time duration per Teemo's attacking, you need to output the total time that Ashe is in poisoned condition.
 * You may assume that Teemo attacks at the very beginning of a specific time point, and makes Ashe be in poisoned condition immediately.
 * 
 * Example 1:
 * Input: [1,4], 2
 * Output: 4
 * Explanation: 
 * At time point 1, Teemo starts attacking Ashe and makes Ashe be poisoned immediately. 
 * This poisoned status will last 2 seconds until the end of time point 2. 
 * And at time point 4, Teemo attacks Ashe again, and causes Ashe to be in poisoned status for another 2 seconds. 
 * So you finally need to output 4.
 * 
 * Example 2:
 * Input: [1,2], 2
 * Output: 3
 * Explanation: 
 * At time point 1, Teemo starts attacking Ashe and makes Ashe be poisoned. 
 * This poisoned status will last 2 seconds until the end of time point 2. 
 * However, at the beginning of time point 2, Teemo attacks Ashe again who is already in poisoned status. 
 * Since the poisoned status won't add up together, though the second poisoning attack will still work at time point 2, it will stop at the end of time point 3. 
 * So you finally need to output 3.
 *
 * link : https://leetcode.com/problems/teemo-attacking/
 */

public class _495_TeemoAttacking {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();

		System.out.println(findPoisonedDuration(arr, k));
		
		scn.close(); 

	}

	public static int findPoisonedDuration(int[] timeSeries, int duration) {

		int count = 0;

		int timeTillLast = 0;

		for (int i = 0; i < timeSeries.length; i++) {

			if (timeSeries[i] >= timeTillLast) {
				count += duration;
			} else {
				count += duration - (timeTillLast - timeSeries[i]);
			}

			timeTillLast = timeSeries[i] + duration;

		}

		return count;
	}

}
