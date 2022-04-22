import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
					  Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
		long a[] = new long[n];

		for(int i=0;i<n;i++){
			a[i] = scn.nextInt();
		}
	     long sum = 0;
		 for(int i=1;i<n+1;i++){	  
			sum = sum +((n-i)^a[i-1]);
		}
		System.out.println(sum);
	}
}