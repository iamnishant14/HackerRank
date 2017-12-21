#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int num;
    cin>>num;
    for(int i=0;i<num;i++)
    {
        int a,b,c;
        cin>>a>>b>>c;
        if((b+c-1)%a==0)
            cout<<a<<endl;
            else 
            cout<<((b+c-1)%a)<<endl;
    }
    return 0;
}