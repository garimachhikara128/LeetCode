package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 605. Can Place Flowers
 * 
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. 
 * However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 * 
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 * 
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 *
 * link : https://leetcode.com/problems/can-place-flowers/
 */

public class _605_CanPlaceFlowers {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int num = scn.nextInt();

		System.out.println(canPlaceFlowers(arr, num));

		scn.close();

	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		int newFlowersPlanted = 0;

		for (int i = 0; i < flowerbed.length; i++) {

			if (flowerbed[i] == 0) {

				if ((i - 1 >= 0 && flowerbed[i - 1] == 0) || i - 1 < 0) {

					if ((i + 1 < flowerbed.length && flowerbed[i + 1] == 0) || i + 1 >= flowerbed.length) {
						newFlowersPlanted++;
						flowerbed[i] = 1;
					}
				}
			}
		}

		if (newFlowersPlanted >= n) {
			return true;
		} else {
			return false;
		}

	}

}
