import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int k = sc.nextInt();
		for(int i = 0; i < k; i++){
			String s = sc.next();
			if(str.indexOf(s) == -1){
				System.out.println("NO");
				return;
			}
			str = str.substring(0, str.indexOf(s)) +
				 str.substring(str.indexOf(s)+s.length());
			//System.out.println(str);
		}
		System.out.println("YES");
	}
}