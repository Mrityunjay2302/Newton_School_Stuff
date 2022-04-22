import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print(largestHistogram(arr));
	}
	public static int largestHistogram(int[] arr) {
        int[] lsi = prevSmallestElement(arr);
        int[] rsi = nextSmallestElement(arr);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int area = (rsi[i] - lsi[i] - 1) * arr[i];
            max = Math.max(max, area);
        }
        return max;
    }

	public static int[] prevSmallestElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        int ci = arr.length - 2;
        int[] res = new int[arr.length];
        while (ci >= 0) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[ci]) {
                res[stack.pop()] = ci;
            }
            stack.push(ci);
            ci--;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        return res;
    }
	public static int[] nextSmallestElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int ci = 1;
        int[] res = new int[arr.length];
        while (ci < arr.length) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[ci]) {
                res[stack.pop()] = ci;
            }
            stack.push(ci);
            ci++;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = arr.length;
        }
        return res;
    }
}