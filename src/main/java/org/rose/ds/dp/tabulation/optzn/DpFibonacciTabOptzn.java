package org.rose.ds.dp.tabulation.optzn;
/*
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class DpFibonacciTabOptzn {
	public static void main(String[] args) {
		int n = 4;
		int prev1 = 0;
		int prev = 1;
		for(int i=2;i<=n;i++) {
			int curr = prev+prev1;
			prev1 = prev;
			prev = curr;
		}
		System.out.println(prev);
	}
}
