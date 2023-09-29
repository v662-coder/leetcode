//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String[] element = br.readLine().split(" ");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [] = new int[N];
		    int brr [] = new int[M];
		    String[] elements = br.readLine().split(" ");
		    for(int i=0; i<N; i++)
		        arr[i] = Integer.parseInt(elements[i]);
		        
		    String[] ele = br.readLine().split(" ");
		    for(int i=0; i<M; i++)
		        brr[i] = Integer.parseInt(ele[i]);
		    
		    int X = Integer.parseInt(br.readLine());
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> ans;
		    ans = obj.printClosest(arr, brr, N, M, X);
		    System.out.println(Math.abs(ans.get(0) + ans.get(1) - X));
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
         int left = 0;
        int right = m - 1;
        int diff = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse through arr and brr using two pointers
        while (left < n && right >= 0) {
            int sum = arr[left] + brr[right];
            
            // Check if this pair has a smaller difference with x
            if (Math.abs(sum - x) < diff) {
                diff = Math.abs(sum - x);
                result.clear();
                result.add(arr[left]);
                result.add(brr[right]);
            }

            // If the sum is less than x, increment the left pointer
            if (sum < x) {
                left++;
            }
            // If the sum is greater than or equal to x, decrement the right pointer
            else {
                right--;
            }
        }

        return result;
    }
}