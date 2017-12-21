#include <iostream>
using namespace std;

int height(int n) {
    if(n==0)return 1;
    int t=1, height=1;
    while(t<=n){
        if(t%2==0)height+=1;
        else
            height*=2;
        t++;
    }
    return height;
    
}
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << height(n) << endl;
    }
}
