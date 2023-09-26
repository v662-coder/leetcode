//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String S)
    {
        // your code here
         Stack<Character> st = new Stack<>();
        StringBuilder sb =  new StringBuilder();
        
        for(int i = 0; i<S.length(); i++)
        {
            if(S.charAt(i) == '.')
            {
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
                
                sb.append('.');
            }
            
            else{
                
                st.push(S.charAt(i));
            }
        }
        
        while(!st.isEmpty()){
            
            sb.append(st.pop());
        }
        
        
        
        return sb.toString();
    }
}