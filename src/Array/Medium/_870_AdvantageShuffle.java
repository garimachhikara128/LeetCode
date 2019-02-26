package Array.Medium;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 26-Feb-2019
 *
 */

/**
 * 870. Advantage Shuffle
 * 
 * Given two arrays A and B of equal size, the advantage of A with respect to B is the number of indices i for which A[i] > B[i].
 * Return any permutation of A that maximizes its advantage with respect to B.
 * 
 * Example 1:
 * Input: A = [2,7,11,15], B = [1,10,4,11]
 * Output: [2,11,7,15]
 * 
 * Example 2:
 * Input: A = [12,24,8,32], B = [13,25,32,11]
 * Output: [24,32,8,12]
 *
 * link :https://leetcode.com/problems/advantage-shuffle/
 */

public class _870_AdvantageShuffle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] A = new int[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = scn.nextInt();
		}

		int[] B = new int[n];
		for (int i = 0; i < B.length; i++) {
			B[i] = scn.nextInt();
		}

		int[] res = advantageCount(A, B);

		for (int val : res) {
			System.out.print(val + " ");
		}
		System.out.println();

		scn.close();
	}

	public static class Pair implements Comparable<Pair> {
		int num;
		int idx;

		public Pair(int num, int idx) {
			this.num = num;
			this.idx = idx;
		}

		@Override
		public int compareTo(Pair o) {
			return o.num - this.num;
		}
	}

	public static int[] advantageCount(int[] A, int[] B) {

		int[] res = new int[A.length];

		PriorityQueue<Pair> pq = new PriorityQueue<>();

		for (int i = 0; i < B.length; i++) {
			Pair np = new Pair(B[i], i);
			pq.add(np);
		}

		Arrays.sort(A);

		int lo = 0;
		int hi = A.length - 1;

		while (!pq.isEmpty()) {
			Pair item = pq.poll();

			if (item.num < A[hi]) {
				res[item.idx] = A[hi];
				hi--;
			} else {
				res[item.idx] = A[lo];
				lo++;
			}
		}

		return res;

	}

}
