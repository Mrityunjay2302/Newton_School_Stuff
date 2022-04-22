import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int missingNumber(int[] arr)
{
	int n=arr.length+1;
	int sum=(n*(n+1))/2;
	int restSum=0;
	for(int i=0; i<n-1; i++)
	{
		restSum=arr[i]+restSum;
	}
	int missingNumber=sum-restSum;
	 return missingNumber;
}
	public static void main (String[] args) {
                   Scanner r=new Scanner(System.in);
					int N=r.nextInt();
					int a[]=new int[N-1];
					for(int i=0;i<N-1;i++)
					{
						a[i]=r.nextInt();
					}
					System.out.println(missingNumber(a));
	}
}