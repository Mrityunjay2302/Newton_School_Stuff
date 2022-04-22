import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i=0; i<t; i++){
			int a=s.nextInt();
			int m=s.nextInt();
			System.out.println(moduloMultiplicativeInverse(a,m));
		}			  
	}

	public static int moduloMultiplicativeInverse(int a, int m){
		for (int i=1; i < m; i++){
			if ((a * i)% m == 1){
				return i;
			}
		}
		return -1;
	}
}