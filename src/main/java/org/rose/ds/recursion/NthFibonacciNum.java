package org.rose.ds.recursion;
/*
 * 0 1 1 2 3 5 8 13 21....
 * Time complexity: O(2^n) due to exponential
 * Space Complexity: O(N) due to stack space
 */

public class NthFibonacciNum {
	public static void main(String[] args) {
		int n= 1;
		System.out.println(fibo(n));
		
	}
	
	private static int fibo(int n) {
		if(n<=1)
			return n;
		return fibo(n-1)+fibo(n-2);
	}

}
