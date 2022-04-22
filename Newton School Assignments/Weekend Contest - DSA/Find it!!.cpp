#include<bits/stdc++.h>
using namespace std;

int main(){
    long long int k;
    cin>>k;
    int i=1;
    while(true){
        if((pow(i,2)+3*i)==k){
            cout<<i<<endl;
            break;
        }else if((pow(i,2)+3*i)>k){
            cout<<-1<<endl;
            break;
        }
        i++;
    }
    return 0;
}