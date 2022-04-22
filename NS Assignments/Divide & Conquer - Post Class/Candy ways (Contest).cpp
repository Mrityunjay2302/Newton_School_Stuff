#pragma GCC optimize ("Ofast")
#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define VV vector
#define pb push_back
#define bitc __builtin_popcountll
#define m_p make_pair
#define infi 1e18+1
#define eps 0.000000000001
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL);
string char_to_str(char c){string tem(1,c);return tem;}
mt19937 rng(chrono::steady_clock::now().time_since_epoch().count());
template<class T>//usage rand<long long>()
T rand() {
 return uniform_int_distribution<T>()(rng);
}
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace __gnu_pbds;
template<class T>
using oset = tree<T, null_type, less<T>, rb_tree_tag, 
tree_order_statistics_node_update>;
// string to integer stoi()
// string to long long stoll()
// string.substr(position,length);
// integer to string to_string();
//////////////
auto clk=clock();
#define all(x) x.begin(),x.end()
#define S second
#define F first
#define sz(x) ((long long)x.size())
// #define int long long 
#define f80 __float128
#define pii pair<int,int>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
/////////////
const int MOD=1e9+7;
int modpow(ll a, ll n) {
 if(n==0) return 1;
 if(n==1) return a%MOD;
 if(n%2==1) return (a*modpow(a,n-1))%MOD;
 ll t = modpow(a,n/2);
 return (t*t)%MOD;
}
int modcmb(ll l, ll r) {
 ll x=1,y=1;
 rep(i,r) {
 x=(x*(l-i))%MOD;
 y=(y*(i+1))%MOD;
 }
 return (x*modpow(y,MOD-2))%MOD;
}
int main() {
#ifdef ANIKET_GOYAL
freopen("inputf.in","r",stdin);
freopen("outputf.in","w",stdout);
#endif
 int n,a,b;
 cin>>n>>a>>b;
 int ans=modpow(2,n)-1;
 int c=modcmb(n,a);
 int d=modcmb(n,b);
 ans=(ans-c+MOD)%MOD;
 ans=(ans-d+MOD)%MOD;
 cout<<ans;
}