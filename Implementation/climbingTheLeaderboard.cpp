#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin>>n;
    int score;
    set<int> s;
    for(int i=0;i<n;++i){ 
        cin>>score;
        s.insert(score);
    }
    set<int>::iterator it = s.begin();
    int rank = s.size()+1;
    int m;
    cin>>m;
    while(m--){
        cin>>score;
        while(*it<=score && it!=s.end()){
            ++it;--rank;
        }
        cout<<rank<<endl;
    }
    return 0;
}
