//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        int i = 0, j = S.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (S.charAt(i) != S.charAt(j))
                return 0;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return  1;
    }
};