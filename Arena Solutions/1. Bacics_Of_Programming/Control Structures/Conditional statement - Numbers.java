import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	    Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 1) System.out.println("one");
		else if(num == 2) System.out.println("two");
		else if(num == 3) System.out.println("three");
		else if(num == 4) System.out.println("four");
		else if(num == 5) System.out.println("five");
		else System.out.println("Greater than 5");
	}
}