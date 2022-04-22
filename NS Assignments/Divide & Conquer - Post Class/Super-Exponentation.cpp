#include <bits/stdc++.h>
using namespace std;
#define mem(a, b) memset(a, (b), sizeof(a))
#define fore(i,a) for(int i=0;i<a;i++)
#define fore1(i,j,a) for(int i=j;i<a;i++)
#define print(ar) for(int i=0;i<ar.size();i++)cout<<ar[i]<<" ";
#define END cout<<'\n'
const double pi=acos(-1.0);
typedef pair<int, int> PII;
typedef vector<long long> VI;
typedef vector<string> VS;
typedef vector<PII> VII;
typedef vector<VI> VVI;
typedef map<int,int> MPII;
typedef set<int> SETI;
typedef multiset<int> MSETI;
typedef long int li;
typedef unsigned long int uli;
typedef long long int ll;
typedef unsigned long long int ull;
ll fastexp (ll a, ll b, ll n) {
 ll res = 1;
 while (b) {
 if (b & 1) res = res*a%n;
 a = a*a%n;
 b >>= 1;
 }
 return res;
}
void fast(){
ios::sync_with_stdio(0);
cin.tie(0);
cout.tie(0);
}
int main()
 { 
 fast();
 ll a,b,c;
int t, n, k;
cin >> t;
while(t--) {
 cin >> a >>b >>c;
 ll mod = 1e9+7;
 ll k = fastexp(b,c,mod-1);
 ll ans= fastexp(a,k,mod);
cout<<ans<<endl;
}}