#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    string s;
    cin>>s;
    long int n;
    cin>>n;
    long int full=n/(s.length());
    long int part=n%(s.length());
    long int fulllen=0,partlen=0;
    for(int i=0;i<s.length();i++){
        if(s[i]=='a')
            fulllen++;
    }
    for(int i=0;i<part;i++)
    {
        if(s[i]=='a')
            partlen++;
    }
    cout<<(fulllen*full)+partlen<<endl;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
