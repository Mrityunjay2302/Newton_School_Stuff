import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	    Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		for(int p=0; p<t; p++){
		   int n = scn.nextInt();
		   int[] arr = new int[n];
           
		   for(int i=0; i<n; i++){
			   arr[i] = scn.nextInt();
		   }

		   if(arr[n-1] >= arr[0]){

			  if(arr[n-1] == arr[0]){
				  System.out.println("No");
				  break;
			  } 
              
			  boolean b = false;

			  int count = 0;
              for(int i=0; i<n-1; i++){
				  if(arr[i] < arr[i+1]){
					  count++;
				  }else if(arr[i] == arr[i+1]){
					  b = true;
				  }
			  }

			  if(b == true){
				  System.out.println("No");
			  }else if(count == n-1){
				  System.out.println("No");
			  }else if(count > 1 && count < n-1){
				  System.out.println("No");
			  }else if(count == 1){
				   System.out.println("Yes");
			  }else{
				   System.out.println("No");
			  }
              

		   }else if(arr[n-1] <= arr[0]){

			  if(arr[n-1] == arr[0]){
				  System.out.println("No");
				  break;
			  }

			  boolean b = false; 
               
			  int count = 0;
              for(int i=0; i<n-1; i++){
				  if(arr[i] > arr[i+1]){
					  count++;
				  }else if(arr[i] == arr[i+1]){
					  b = true;
				  }
			  }
              
			  if(b == true){
				  System.out.println("No");
			  }else if(count == n-1){
				  System.out.println("No");
			  }else if(count > 1 && count < n-1){
				  System.out.println("No");
			  }else if(count == 1){
				   System.out.println("Yes");
			  }else{
				   System.out.println("No");
			  }
		   }
		}				  
	}
}