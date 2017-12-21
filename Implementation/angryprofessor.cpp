#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
   int t,n,k;
    cin>>t;
    for(int i=0;i<t;i++){
        cin>>n>>k;
        int a[n],count=0;
        for(int j=0;j<n;j++){
            cin>>a[j];
        }
        for(int j=0;j<n;j++){
            if(a[j]<=0)
                count+=1;
        }
        if(count>=k){
            cout<<"NO"<<endl;
    }
      //  else if(count==k)
        //    cout<<"NO"<<endl;
        else{
            cout<<"YES"<<endl;
        } count=0;
    }
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
