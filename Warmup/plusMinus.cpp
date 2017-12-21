#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int t;
    float e,f,g;
    cin>>t;
    int a[t],c1=0,c2=0,c3=0;
    
     for(int i=0;i<t;i++){   
    cin>>a[i];
        }
    for(int i=0;i<t;i++){
    if(a[i]>=0){
        if(a[i]==0)
            c3+=1;
        else
            c1+=1;
    }
    else{
          if(a[i]==0)
              c3+=1;
        else
            c2+=1;
      }        
       
    }
    e=(float)c1/t;f=(float)c2/t;g=(float)c3/t;
    printf("%.6f\n%.6f\n%.6f",e,f,g);
    return 0;
}
