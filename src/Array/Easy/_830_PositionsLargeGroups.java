package Array.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 830. Positions of Large Groups
 * 
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 * Call a group large if it has 3 or more characters.  
 * We would like the starting and ending positions of every large group.
 * The final answer should be in lexicographic order.
 * 
 * Example 1:
 * Input: "abbxxxxzzy"
 * Output: [[3,6]]
 * Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
 * 
 * Example 2:
 * Input: "abc"
 * Output: []
 * Explanation: We have "a","b" and "c" but no large group.
 * 
 * Example 3:
 * Input: "abcdddeeeeaabbbcd"
 * Output: [[3,5],[6,9],[12,14]]
 * 
 * link : https://leetcode.com/problems/positions-of-large-groups/
 */

public class _830_PositionsLargeGroups {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(largeGroupPositions(str));

		scn.close();

	}

	public static List<List<Integer>> largeGroupPositions(String S) {

		List<List<Integer>> ans = new ArrayList<>();

		int count = 1;
		int si = -1;

		for (int i = 0; i < S.length() - 1; i++) {

			if (S.charAt(i) == S.charAt(i + 1)) {
				count++;

				if (si == -1)
					si = i;

			} else {

				if (count >= 3) {

					List<Integer> subans = new ArrayList<>();
					subans.add(si);
					subans.add(i);

					ans.add(subans);

				}
				count = 1;
				si = -1;

			}

		}

		if (count >= 3) {

			List<Integer> subans = new ArrayList<>();
			subans.add(si);
			subans.add(S.length() - 1);

			ans.add(subans);

		}

		return ans;

	}

}
