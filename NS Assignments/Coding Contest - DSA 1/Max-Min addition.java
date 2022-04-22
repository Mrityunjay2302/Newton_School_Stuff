import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
					  String Anumber = sc.next();
					  long Noperation = Long.parseLong(sc.next());  
					  
					  int max = -1, min = +10;
					  long sum = 0;
					  
					  for(long i=0; i<Noperation;i++){
						  int x = 0;
						for(int j=0;j<Anumber.length();j++){
							x = Character.getNumericValue(Anumber.charAt(j));
							if(x>max) max = x;
							if(x<min) min = x;
							if(x==0) break;
							
						} if(x==0) break;
				
						sum = Long.parseLong(Anumber)+max*min;
						Anumber = sum+"";
						sum = 0; max = -1; min = +10;
						

					  }
					  System.out.println(Anumber);
					  
	}

}