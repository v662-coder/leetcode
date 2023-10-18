//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int missingNumber(int nums[], int n) {
        // Your Code Here
        
    int N = nums.length + 1;
        
        // Perform cyclic sort to place each element at its correct index
        for (int i = 0; i < N - 1; i++) {
            while (nums[i] > 0 && nums[i] < N && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        
        // Find the first element that is not in its correct position
        for (int i = 0; i < N - 1; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all elements are in their correct positions, the missing number is N
        return N;
    }
}