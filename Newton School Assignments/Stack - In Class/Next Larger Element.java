import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int[] nextGreaterEle(int[] arr){
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		int ci = 1;
		int[] res = new int[arr.length];
        while (ci < arr.length) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[ci]) {
                res[stack.pop()] = arr[ci];
            }
            stack.push(ci);
            ci++;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        return res;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int ans[] = nextGreaterEle(arr);
		for(int i=0; i<ans.length; i++){
			System.out.print(ans[i]+" ");
		}
	}
}