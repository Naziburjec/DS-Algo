package org.rose.ds.arrays;



public class TwoMissingNum {
  public static void findTwoMissingNums(int arr[], int n){
    boolean[] array = new boolean[n+1];
    for(int i=0; i<n-2; i++)
      array[arr[i]]=true;
    for(int i=1;i<=n;i++)
      if(!array[i])
        System.out.print(i+" ");
        
 }

  public static void main(String [] args) {
    int arr[] = {1, 3, 5, 6}; 
    int n = 2 + arr.length;
    findTwoMissingNums(arr,n);
  }
}
