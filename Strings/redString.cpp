#include <cmath>
#include <cstdio>
#include <vector>
#include <string>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    string s;
    cin>>s;
    vector<char>v(s.begin(),s.end());
    for(int i=1;i<v.size();++i)
    {
        if(v[i]==v[i-1])
        {
           v.erase(v.begin()+i);
           v.erase(v.begin()+i-1);
           i=1;
        }
    }
    if(v.size()==0||(v[0]==v[1]))
        cout<<"Empty String"<<endl;
    else
        for(int i=0;i<v.size();i++){
        cout<<v[i];
    }
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
