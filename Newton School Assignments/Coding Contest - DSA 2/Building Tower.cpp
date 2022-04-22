#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
    long int n,a[1000000]={0},ind,i,max;
    scanf("%ld",&n);
    max=n;
    for(i=0;i<n;i++)
    {
        scanf("%ld",&ind);
        a[ind]=ind;
        if(ind==max)
        {
            while(a[ind]!=0)
            {
                printf("%ld ",a[ind]);
                ind--;
            }
            max=ind;
            printf("\n");
        }
        else
          printf("\n");
    }
    return 0;
	
}