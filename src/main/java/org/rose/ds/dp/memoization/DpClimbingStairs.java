package org.rose.ds.dp.memoization;
/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

import java.util.Arrays;

public class DpClimbingStairs {
	public static void main(String[] args) {
		int n = 4;
		int dp [] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0]=1;
		dp[1]=1;
		System.out.println(stairs(n,dp));
	}

	private static int stairs(int n, int []dp) {
		if(n == 0)
			return dp[0]; 
		if(n == 1)
			return dp[0]; 
		return dp[n] = stairs(n-1,dp)+stairs(n-2,dp);		
	}

}
