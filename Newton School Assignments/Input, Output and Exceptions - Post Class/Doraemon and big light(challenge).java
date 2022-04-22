static boolean EqualOrNot(int h1, int h2, int v1,int v2){
//Enter your code here

        if(v1==v2) return false;
        int x=((h1-h2)/(v2-v1));
        boolean ans=((h1+x*v1)==(h2+x*v2));
        return ans;
}