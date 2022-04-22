import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here

					  Scanner sc = new Scanner (System.in);
					  int n = sc.nextInt();
					  int k = sc.nextInt();
					//   long[] arr = new long[n];
                       ArrayList<Long> list = new ArrayList<Long>();
					  for(int i=0; i<n; i++) {
						  list.add(sc.nextLong());
					  }

					  Collections.sort(list);

					//   int i= 0; 
					//   int j = list.size();
					  long x = 0;
					  for(int i = 0; i<k; i++) {
						  int l = 0;
						  int m = list.size()-1;

						  long val1 = list.get(l);
						  long val2 = list.get(m);

						  if(val1==val2){
							  list.remove(l);
						  }else{
							  list.remove(m);
						  }
						  x += val2;

					  }

					  System.out.print(x);


	}
}