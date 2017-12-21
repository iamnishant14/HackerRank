#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t,n,c,m,a,b,d;
    cin>>t;
    while(t--){
        cin>>n>>c>>m;
        int answer=0;
        answer+=n/c;
        a=n/c;
        while(a>=m){
        answer+=a/m;
        a=a/m+a%m;    
       }
       /*if(a==m)
            d=1;
            else
            d=0;
        answer=a+d;
        // Computer answer
        */
        cout<<answer<<endl;
    }
    return 0;
}
