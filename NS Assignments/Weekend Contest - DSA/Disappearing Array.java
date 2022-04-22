import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static List <Integer> findDisappearedNumbers(int[] arr, int N)
    {
        List <Integer> result = new ArrayList <Integer>();
        HashSet <Integer> mark = new HashSet <Integer>();
        for(int i : arr)
            mark.add(i);
        for(int i = 1 ; i <= N ; i++)
            if(!mark.contains(i))
                result.add(i);
        return result;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		List <Integer> result = findDisappearedNumbers(arr,N);
        if(result.size() == 0)
            System.out.println("");
        else
            for(int i : result)
                System.out.print(i + " ");
                      // Your code here
	}
}