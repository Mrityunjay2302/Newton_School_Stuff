import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
	// Your code here
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	long arr[] = new long[k];
	long count = 0;

	for(int i=0; i<n; i++)
	{
		int x = sc.nextInt();
		
		count += arr[(k-(x%k))%k];
		arr[x%k]++;

	}
	System.out.println(count);
	
	}
}