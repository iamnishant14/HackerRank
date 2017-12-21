#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int t;
    cin>>t;
    int a[t][t],sum1=0,sum2=0;
    for(int i=0;i<t;i++){
        for(int j=0;j<t;j++){
     cin>>a[i][j];
      if(i==j)     
     sum1+=a[i][j];     
       }
        sum2+=a[i][t-i-1]; 
    }
    if(sum1>=sum2)
       cout<<sum1-sum2;
    else 
        cout<<sum2-sum1;/* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
