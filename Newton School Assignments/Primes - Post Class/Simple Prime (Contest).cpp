#include "bits/stdc++.h"
#pragma GCC optimize "03"
using namespace std;
#define int long long int
#define ld long double
#define pi pair<int, int>
#define pb push_back
#define fi first
#define se second
#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)
#ifndef LOCAL
#define endl '\n'
#endif
const int N = 1e6 + 5;
const int mod = 1e9 + 7;
const int inf = 1e9 + 9;
int a[N];
signed main() {
IOS;
vector<int> v;
v.push_back(0);
for(int i = 2; i < N; i++){
if(a[i]) continue;
v.push_back(i);
for(int j = i*i; j < N; j += i)
a[j] = 1;
}
int p = 0;
for(auto &i: v){
i += p;
p = i;
}
int t; cin >> t;
while(t--){
int l, r;
cin >> l >> r;
cout << v[r] - v[l-1] << endl;
}
return 0;
}