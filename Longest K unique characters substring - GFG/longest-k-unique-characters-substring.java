//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
         int l, r;
        int n = s.length();
        
        l = r = 0;
        
        int ans = -1;
        Map<Character, Integer> f = new HashMap<>();
        
        while (r < n) {
            char currentChar = s.charAt(r);
            f.put(currentChar, f.getOrDefault(currentChar, 0) + 1);
            
            while (f.size() > k) {
                char leftChar = s.charAt(l);
                f.put(leftChar, f.get(leftChar) - 1);
                if (f.get(leftChar) == 0)
                    f.remove(leftChar);
                
                ++l;
            }
             
            if (f.size() == k)
                ans = Math.max(ans, r - l + 1);
                
            ++r;
        }
        
        return ans;
    }
}