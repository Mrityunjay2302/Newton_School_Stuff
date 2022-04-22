import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;
		int y = 1;
		int count = 0;			  
		while(x<n && y<n){
		if(x<=y){
			x = x+y;
		} else{
			y = x+y;
		}
		count++;
	}
	if(n<100000)
	System.out.print(count);
	else
	System.out.print(count+1);
	}
}