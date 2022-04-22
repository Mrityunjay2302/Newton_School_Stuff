#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define max1 10000001
bool a[max1];
    long b[max1];

void pre(){
	b[0]=0;b[1]=0;
	for(int i=0; i<max1; i++){
		a[i]=false;
	}
	long cnt=0;
	for(int i = 2; i<max1; i++){
		if(a[i]==false){
			cnt++;
			for(int j=i+i; j<max1; j=j+i){a[j]=true;}
		}
		b[i]=cnt;
	}
}	
int main() {
	pre();
	int t;
	cin>>t;
	while(t--){
		long n;
		cin>>n;

		cout<<(b[n]-b[(n)/2])<<endl;
	}

	
}