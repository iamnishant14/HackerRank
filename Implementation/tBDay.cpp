#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int t;
    cin >> t;
    for(int i = 0; i < t; i++){
        long int b;
        long int w;
        cin >> b >> w;
        long int x;
        long int y;
        long int z;
        cin >> x >> y >> z;
       long long int temp=0;
        if(x >(y+z))
            temp+= b*(y+z);
        else
            temp+=b*x;
        if(y >(x+z))
            temp+= w*(x+z);
        else
            temp+=w*y;
            
         cout<<temp<<endl;   
    }
    return 0;
}
