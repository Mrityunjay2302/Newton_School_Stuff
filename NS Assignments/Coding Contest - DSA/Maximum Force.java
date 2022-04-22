import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] arr = new long[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		long ans[] = new long[n];
		for(int i = 0; i < n; i++){
			ans[i] = arr[i] * arr[i];
		}
		Arrays.sort(ans);
		long maxForce = 0;
		for(int i = n-1; k > 0; k--){
			
			maxForce = maxForce + ans[i];
			i--;
		}

		System.out.println(maxForce);
	}
}