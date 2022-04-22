import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code her
		Scanner sc=new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i = 0; i< t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(arrStu(arr, n));
        }
    }
    public static String arrStu(int[] arr, int n ){
		int[] newArr = new int[n];
		for(int i = 0; i<n ;i++){
			newArr[i] = arr[i];
		}
		Arrays.sort(newArr);
		int count = 0;
		for(int i = 0 ; i< n ;i++){
			if(arr[i] != newArr[i]) count++;
		}
		if(count > 2) return "NO";
		else return "YES";
	}
}