#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
   int w,t,a,b,y;
    cin>>w>>t;
    vector<int>v;
    for(int j=0;j<w;j++){
            cin>>y;
        v.push_back(y);
            }
    for(int i=0;i<t;i++){
        cin>>a>>b;
        vector<int>x;
        for(int k=a;k<=b;k++){
            x.push_back(v[k]);
        }
        sort(x.begin(),x.end());
        cout<<x[0]<<endl;
        
            
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
