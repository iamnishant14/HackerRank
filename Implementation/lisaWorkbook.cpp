#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,k;
    cin>>n>>k;
    int chap=1,pageno=1,quesno=1,sp=0;
    int t;
    cin>>t;
    while (chap<=n){
    if (quesno<=pageno && pageno <= (quesno+k-1 < t ? quesno+k-1 : t))
        sp++;
        pageno++;
        quesno+=k;
       if (quesno>t){
        quesno=1;
        chap++;
        cin>>t;
    }
}
    cout<<sp<<endl;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
