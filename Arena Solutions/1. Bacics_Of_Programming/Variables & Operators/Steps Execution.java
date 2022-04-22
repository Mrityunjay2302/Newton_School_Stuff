import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 int add = num+8;
	 int devide = add/3;
	 int mod = devide%5;
	 int product = mod*5;
	 int display = product;
	 System.out.print(display);
	}
}