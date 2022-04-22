import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Long> st = new Stack<>();
		
		for(int i = 0; i < n; i++){
			long x = sc.nextLong(); // 7
			while(!st.empty() && st.peek() >= x){
				st.pop();
			}
			if(st.empty()){
				System.out.print("-1 ");
			}
			else{
				System.out.print(st.peek()+" ");
			}
			st.push(x);
		} 
	}
}