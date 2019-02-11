package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 849. Maximize Distance to Closest Person
 * 
 * In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty. 
 * There is at least one empty seat, and at least one person sitting.
 * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 
 * Return that maximum distance to closest person.
 * 
 * Example 1:
 * Input: [1,0,0,0,1,0,1]
 * Output: 2
 * Explanation: 
 * If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
 * If Alex sits in any other open seat, the closest person has distance 1.
 * Thus, the maximum distance to the closest person is 2.
 * 
 * Example 2:
 * Input: [1,0,0,0]
 * Output: 3
 * Explanation: 
 * If Alex sits in the last seat, the closest person is 3 seats away.
 * This is the maximum distance possible, so the answer is 3.
 * 
 * link : https://leetcode.com/problems/maximize-distance-to-closest-person/
 */

public class _849_MaximizeDistanceClosestPerson {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(maxDistToClosest(arr));

		scn.close();
	}

	public static int maxDistToClosest(int[] seats) {

		int[] l = new int[seats.length];
		l[0] = (seats[0] == 0 ? Integer.MAX_VALUE : 1);

		for (int i = 1; i < seats.length; i++) {
			l[i] = (seats[i] == 1 ? i + 1 : l[i - 1]);
		}

		int[] r = new int[seats.length];
		r[r.length - 1] = (seats[seats.length - 1] == 0 ? Integer.MAX_VALUE : seats.length);

		for (int i = seats.length - 2; i >= 0; i--) {
			r[i] = (seats[i] == 1 ? i + 1 : r[i + 1]);
		}

		int maxDist = Integer.MIN_VALUE;

		for (int i = 0; i < seats.length; i++) {

			int ld = Integer.MAX_VALUE;
			int rd = Integer.MAX_VALUE;

			if (l[i] != Integer.MAX_VALUE)
				ld = (i + 1) - l[i];

			if (r[i] != Integer.MAX_VALUE)
				rd = r[i] - (i + 1);

			int diff = Math.min(ld, rd);

			if (diff > maxDist) {
				maxDist = diff;
			}
		}

		return maxDist;
	}

}
