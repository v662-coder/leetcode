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
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        // code here
        long reversed = 0;
        int numOfBits = 32; // Number of bits in a 32-bit integer

        for (int i = 0; i < numOfBits; i++) {
            // Shift the reversed number to the left (to make space for the next bit)
            reversed <<= 1;
            
            // Get the least significant bit of X using bitwise AND and add it to reversed
            reversed |= (X & 1);
            
            // Right-shift X to get the next bit to be considered
            X >>= 1;
        }

        return reversed;

    }
};