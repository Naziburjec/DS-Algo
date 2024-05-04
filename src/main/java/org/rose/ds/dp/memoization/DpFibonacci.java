package org.rose.ds.dp.memoization;
/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * 
 */

import java.util.Arrays;

public class DpFibonacci {
	public static void main(String[] args) {
		int n = 4;
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(fibo(n, dp));
	}
	private static int fibo(int n, int []dp) {
		if(n<=1)
			return n;
		if(dp[n] != -1)
			return dp[n];
		return dp[n] = fibo(n-1, dp)+fibo(n-2,dp);		
	}
}

/*
 if dp is n size:
 ----------------
public class DpFibonacci {
	public static void main(String[] args) {
		int n = 4;
		int dp[] = new int[n];
		Arrays.fill(dp, -1);
		System.out.println(fibo(n, dp));
	}
	private static int fibo(int n, int []dp) {
		if(n<=1)
			return n;
		if(dp[n-1] != -1)
			return dp[n-1];
		return dp[n-1] = fibo(n-1, dp)+fibo(n-2,dp);		
	}
}

*/

