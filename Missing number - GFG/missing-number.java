//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n-1; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.missingNumber(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public static int missingNumber(int nums[], int N)
    {
          int i=0;
          while(i<nums.length){
              int correct=nums[i];
              if(nums[i]<nums.length && nums[i] !=nums[correct]){
                  swap(nums,i,correct);
              }
              else{
                  i++;
              }
          }
          for(int index=0;index<nums.length;index++){
              if(nums[index] !=index){
                  return index;
              }
          }
          return nums.length;
    }
     static void swap(int[]nums,int start,int end){
        int temp= nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}