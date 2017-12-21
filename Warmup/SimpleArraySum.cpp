#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int t;
    cin>>t;
    int a[t],sum=0;
    for(int i=0;i<t;i++)
    {
      cin>>a[i];
        sum+=a[i];
        }
    cout<<sum<<endl;/* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
