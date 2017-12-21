#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <set>
using namespace std;


int main() {
    int t;
    cin>>t;
    while(t>0)
   {
       int stones,a1,b1;
        cin>>stones>>a1>>b1;
        stones-=1;
        int a=max(a1,b1);
        int b=min(a1,b1);
        int diff=a-b;
        int current=b*stones;
        int max=a*stones;
        set<int>s;
        if(a==b)
            cout<<current<<" ";
        else
        {
            while(current<=max){
                s.insert(current);
                current+=diff;
            }
          
        }
          while(!s.empty())
          {
               cout <<*s.begin()<<" ";
               s.erase(s.begin());
          }
        cout<<endl;
    t--;
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
