#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int s, n, m,sum=-1; cin>>s>>n>>m;
    int a[n],b[m];
    for(int ai = 0; ai<n; ai++) cin>>a[ai];
    for(int bi = 0; bi<m; bi++){ cin>>b[bi];
    for(int i=0; i<n; i++){
       int sum1=b[bi]+ a[i]; 
        if((sum< sum1 && sum1<=s)) sum=sum1; 
    }
}
  cout<<sum;
    return 1;
}
