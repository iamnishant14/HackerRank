#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int t;
    cin>>t;
    for(int i=1;i<=t;i++)
    {
     int gap=i;
        while(gap<=t-1){
            cout<<" ";
            gap++;
        }
        int gap1=i;
        while(gap1>0){
            cout<<"#";
            gap1--;
        }
        cout<<endl;
         
    }
        cout<<endl;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
