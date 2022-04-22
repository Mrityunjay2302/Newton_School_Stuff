import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] arr = new int[2];
        for(int i = 0; i < n; i++) {
            arr[str.charAt(i) - 'a']++;
        }
        if(arr[0] > arr[1]) {
            System.out.print(arr[1]);
        } else {
            System.out.print(arr[0]);
        }
	}
}