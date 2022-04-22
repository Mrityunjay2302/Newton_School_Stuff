#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define m 1000000007
int main() {
     int N,F;
	 cin>>N>>F;
	 for( int i=N;--i>0;){
		 F=((F&1)==0)?F>>1:(m+F)>>1;
	 }
	 cout<<F;
	 
	// Your code here
	return 0;
}