import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner s = new Scanner(System.in);
					  //System.out.println("Enter number:");
					  int n = s.nextInt();
					  //System.out.println("The FizzBuzz numberwill be:");
					  for (int i = 1; i <= n; i++) {
						  if (i % 3 == 0 && i % 5 == 0) {
						  System.out.print("FizzBuzz");
						  } else if (i % 3 == 0) {
							  System.out.print("Fizz");
						  } else if (i % 5 == 0) {	
							  System.out.print("Buzz");
						  } else {
							   System.out.print(i);
						  }
						  System.out.print(" ");
					  }
					  s.close();
						  
					  
	}
}