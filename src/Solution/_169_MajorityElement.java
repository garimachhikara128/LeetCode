package Solution;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 169. Majority Element
 * 
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than [ n/2 ] times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 * 
 * link : https://leetcode.com/problems/majority-element/
 */

public class _169_MajorityElement {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(majorityElement(arr));

		scn.close();
	}

	public static int majorityElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int val : nums) {

			if (map.containsKey(val)) {
				int of = map.get(val);
				map.put(val, of + 1);
			} else {
				map.put(val, 1);
			}
		}
		
		for(int val : map.keySet()) {
			
			if(map.get(val) > nums.length/2) {
				return val ;
			}
		}
		
		return 0 ;
		
		
	}

}
