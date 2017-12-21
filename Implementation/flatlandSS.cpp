#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n; 
int m; 
cin>>n>>m;
int result=0;
int tmp;
int c[m];
for(int c_i = 0; c_i < m; c_i++){
   cin>>c[c_i];

}

if(n==m){
    result=0;
}
else{
    for(int i=0;i<n;i++){
        tmp = abs(c[0]-i);
        for(int j = 0;j<m;j++){
            if(abs(c[j]-i)<tmp){
                tmp = abs(c[j]-i);
            }

        }
        if(tmp>result)
            result = tmp;
    }
}

cout<<result;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
