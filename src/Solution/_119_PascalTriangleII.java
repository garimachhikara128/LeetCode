package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 118. Pascal's Triangle
 * 
 * Given a non-negative index k where k <= 33, return the kth index row of the Pascal's triangle.
 * Note that the row index starts from 0.
 * 
 * Example:
 * Input: 3
 * Output: [1,3,3,1]
 *
 * link : https://leetcode.com/problems/pascals-triangle-ii/
 */

public class _119_PascalTriangleII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		System.out.println(getRow(n));

		scn.close();
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>();

		long val = 1;
		for (int c = 0; c <= rowIndex; c++) {

			list.add((int) val);
			val = (val * (rowIndex - c)) / (c + 1);

		}

		return list;
	}

}
