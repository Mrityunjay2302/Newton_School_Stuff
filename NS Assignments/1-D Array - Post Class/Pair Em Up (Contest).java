import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=in.nextInt();
        }
        int sum =minimizethesum(arr);
        System.out.println(sum);
    }
    static int minimizethesum(int[] nums){
        Arrays.sort(nums);
        int check, sum =0;
        int l = nums.length;
        for(int i =0; i<l/2; i++){
            check = nums[i]+nums[l-i-1];
            sum = Math.max(sum, check);
        }
        return sum;
	}
}