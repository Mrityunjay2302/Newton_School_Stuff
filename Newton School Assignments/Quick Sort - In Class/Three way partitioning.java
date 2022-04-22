public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal)
{
	// Your code here
	int l=0, m=0, r=A.size()-1;
	while(m<=r){
		int val;
		if(A.get(m)<lowVal){
			val = 0;
		}else if(A.get(m)>=lowVal && A.get(m)<=highVal){
			val = 1;
		}else{
			val = 2;
		}
		switch(val){
			case 0:
				Collections.swap(A, m, l);
				m++;
				l++;
				break;
			case 1:
				m++;
				break;
			case 2:
				Collections.swap(A, m, r);
				r--;
				break;
		}
	}
	return A;
}