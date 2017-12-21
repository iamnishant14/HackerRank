#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int D1,D2,M1,M2,Y1,Y2,fine;
    cin>>D2>>M2>>Y2;
    cin>>D1>>M1>>Y1;
    if(M1==M2&&Y1==Y2&&D2>D1)
        fine=15*(D2-D1);
    else if(Y1==Y2&&M2>M1)
        fine=500*(M2-M1);
    else if(Y2>Y1)
        fine=10000;
    else
        fine=0;
        
        cout<<fine<<endl;
        
    
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
