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
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * 
 * Example:
 * Input: 5
 * Output:
 * [
 * 		  [1],
 * 		 [1,1],
 * 		[1,2,1],
 * 	   [1,3,3,1],
 * 	  [1,4,6,4,1]
 * ]
 *
 * link : https://leetcode.com/problems/pascals-triangle/
 */

public class _118_PascalTriangle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		System.out.println(generate(n));

		scn.close();
	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> list = new ArrayList<>();

		for (int r = 0; r < numRows; r++) {

			List<Integer> sublist = new ArrayList<>();
			int val = 1;

			for (int c = 0; c <= r; c++) {
				sublist.add(val);
				val = (val * (r - c)) / (c + 1);
			}

			list.add(sublist);

		}

		return list;

	}

}
