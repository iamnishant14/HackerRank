#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,k;
    cin>>n>>k;
    int a[n],sum=0;
    for(int i=0;i<n;i++){
        cin>>a[i];
        if(i!=k)
            sum+=a[i];
    }
    long int avg=sum/2;
    long int charge;
    cin>>charge;
    if((charge-avg)==0)
        cout<<"Bon Appetit"<<endl;
    else
        cout<<charge-avg<<endl;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
