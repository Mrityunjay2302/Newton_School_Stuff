import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		if(n%3==0 || m%3==0){
			System.out.println(0);
		}else {
			int res[]=new int[3];
			int max = Math.max(n,m);
			int min = Math.min(n,m);
			int lt;
			if(max%3==2){
				lt=max/3+1;
			}else{
				lt=max/3;
			
		}
		res[2]=lt*min;
		if((max-lt)%2==0||min%2==0){
			res[0]=((max-lt)*min)/2;
			res[1]=((max-lt)*min)/2;
		}else{
			int tmax =Math.max(min,(max-lt));
			int tmin =Math.min(min,(max-lt));
			int tt=(tmax/2)+1;
			res[0]=tt*tmin;
			res[1]=(tmax-tt)*tmin;
		}
		Arrays.sort(res);
		System.out.print(res[2]-res[0]);
			


	
		}
		
		
                      
	}
}