import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static ArrayList <Integer> list;
    static HashSet<Integer> hset;
					   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=1;i<=t;i++) {
            int pro = sc.nextInt();
            int step = sc.nextInt();

            list = new ArrayList<>();
            list.add(pro);
            for (int j = 0; j < step; j++) {
                problem(list, list.size());
            }
            hset = new HashSet<>(list);
            System.out.println(hset.size());

        }
    }

    private static void problem(ArrayList<Integer> lists, int size) {

        for (int i=0;i<size;i++){
            int a=lists.get(i);
            list.add(a-3);
            list.add(a+3);
            list.add(a*2);
        }


    }

	
}