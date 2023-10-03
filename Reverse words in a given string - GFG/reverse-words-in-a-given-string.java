//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
          String[] words = S.split("\\.");
        
        // Initialize a StringBuilder to build the reversed string.
        StringBuilder reversed = new StringBuilder();
        
        // Iterate through the words in reverse order and append them to reversed.
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(".");
            }
        }
        
        // Convert the StringBuilder to a string and return the result.
        return reversed.toString();
    }
}