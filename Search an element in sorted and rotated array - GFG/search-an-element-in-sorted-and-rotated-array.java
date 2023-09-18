//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int Search(int array[], int target)
	{
	    // code here
	     int l = 0;
    int r = array.length - 1;

    while (l <= r) {
      int m = l+(r-l) / 2;
      if (array[m] == target)
        return m;
      if (array[l] <= array[m]) 
      { 
        if (array[l] <= target && target < array[m])
          r = m - 1;
        else
          l = m + 1;
      } else 
      { 
        if (array[m] < target && target <= array[r])
          l = m + 1;
        else
          r = m - 1;
      }
    }

    return -1;
	}
} 

