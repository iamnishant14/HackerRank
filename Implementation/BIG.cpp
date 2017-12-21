#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;


int main() {
      int t;
      cin>>t;
      for(int i=0;i<t;i++){
       string s,s1;
        cin>>s;
        s1=s;    
        next_permutation(s.begin(),s.end());  
        if(s1==s)
              cout<<"no answer"<<endl;
        else if(s>s1)
              cout<<s<<endl;
        else 
            cout<<"no answer"<<endl;  
      }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
