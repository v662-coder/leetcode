//{ Driver Code Starts
import java.util.Scanner;



class PrintPattern
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    void printPat(int n)
    {
         for(int k=0; k<n; k++)
		{
			//Inner loop for printing the numbers in each row
			for(int i=n; i>0; i--)
			{
				//Innermost loop for printing the numbers based on column position
				for(int j=0; j<n-k; j++)
				{
					//Printing the value of i followed by a space
					System.out.print(i + " ");
				}
				
			}
			//Printing a delimiter after each row
			System.out.print("$");
		}
    }
}