package org.rose.ds.recursion;
/*
 * Time Complexity: O(2^N)
 * Space Complexity: O(N)
 */

public class ClimbingStairs {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(stairs(n));
	}

	private static int stairs(int n) {
		if(n == 0)
			return 1; // if we at 0th index of stair then return 1
		if(n == 1)
			return 1; // if we at 1th index of stair then return 1
		return stairs(n-1)+stairs(n-2);		
	}
}
