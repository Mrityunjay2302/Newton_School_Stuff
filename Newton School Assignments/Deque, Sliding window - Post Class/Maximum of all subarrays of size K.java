import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    // Your code here
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();

	int arr[] = new int[n];
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
	}

	Deque<Integer> dq = new LinkedList<>();
	for(int i=0; i<n; i++)
	{
		while(!dq.isEmpty() && dq.peekFirst() <= i-k)
		{
			dq.removeFirst();
		}
		while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i])
		{
			dq.removeLast();
		}
		dq.addLast(i);
		if(i >= k-1)
		{
			System.out.print(arr[dq.peekFirst()] + " ");
		}
	}
	
	}
}