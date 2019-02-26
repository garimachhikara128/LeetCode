package Array.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 18-Feb-2019
 *
 */

/**
 * 228. Summary Ranges
 * 
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * 
 * Example 1:
 * Input:  [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
 * 
 * Example 2:
 * Input:  [0,2,3,4,6,8,9]
 * Output: ["0","2->4","6","8->9"]
 * Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.
 * 
 * link : https://leetcode.com/problems/summary-ranges/submissions/
 * 
 */
public class _228_SummaryRanges {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(summaryRanges(arr));

		scn.close();

	}

	public static List<String> summaryRanges(int[] nums) {

		List<String> ans = new ArrayList<>();

		if(nums.length == 0) {
			return ans ;
		}
		
		int start = nums[0];
		int end = nums[0];

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] == end + 1) {
				end = nums[i];
			} else {

				if (start == end) {
					ans.add(start + "");
				} else {
					String str = start + "->" + end;
					ans.add(str);
				}

				start = nums[i];
				end = nums[i];
			}

		}

		if (start == end) {
			ans.add(start + "");
		} else {
			String str = start + "->" + end;
			ans.add(str);
		}

		return ans;

	}

}
