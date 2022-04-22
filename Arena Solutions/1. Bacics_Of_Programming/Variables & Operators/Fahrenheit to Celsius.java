import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int s = ((T - 32) * 5/9);
		System.out.println(s);
	}
}