#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


 int main(){
int q;
cin >> q;
for(int a0 = 0; a0 < q; a0++){
    string s;
    cin >> s;  
   long long int d1=0,d2=0,d3;
     int f=0;
    for(int i=0;i<=s.size()/2;i++)
        {
        d1=d1*10+((int)s[i]-'0');
         d3=d1;
         f=0;
         d2=0;
            for(int j=i+1;j<s.size();j++)
                {
               d2=d2*10+((int)s[j]-'0');
                if(d2==0 || (d2-d1)>1){f=0; break;}
                if((d2-d1)==1){f=1; d1=d2;d2=0; }
                else  { f=0;  }

            }
            if(f){cout<<"YES"<<" "<<d3<<endl; break;}

            d1=d3;

    }
    if(!f)cout<<"NO"<<endl;
    }
   return 0;
  }

