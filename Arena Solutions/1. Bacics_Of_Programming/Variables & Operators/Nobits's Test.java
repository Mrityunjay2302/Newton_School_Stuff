import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int Q = sc.nextInt();
		int ans;
		if(Q==0)
		{
			ans = -1;
		}
		else
		{
			ans = Math.floorDiv(D,Q);
		}
		System.out.println(ans);

	}
}