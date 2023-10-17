//{ Driver Code Starts
import java.util.*;
class FormatingArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			GfG g=new GfG();
			int[] b=g.formatArray(a,n);
			int flag=1;
			if(b.length==a.length){
				for(int i=1;i<n;i+=2)
					if(b[i]<b[i-1])
						flag=0;
				if(flag==0)
					System.out.println("0");
				else{
					Arrays.sort(a);
					Arrays.sort(b);
					for(int i=0;i<n;i++){
						if(a[i]!=b[i])
							flag=0;
					}
					System.out.println(flag);
				}
			}
			else
				System.out.println("0");
		}
	}
}

// } Driver Code Ends


class GfG
{
	public int[] formatArray(int[] a,int n)
        {
        // add code here.
        for(int i=1;i<n;i+=2){
			//Checking if the element at the odd index is smaller than the element at the even index.
			//If it is smaller, we swap the elements.
			if(a[i]<a[i-1]){
				a[i]+=a[i-1];
				a[i-1]=a[i]-a[i-1];
				a[i]=a[i]-a[i-1];
			}
		}
		//Returning the formatted array.
		return a;
	}
}