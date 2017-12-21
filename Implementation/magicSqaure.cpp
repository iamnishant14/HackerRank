#include <bits/stdc++.h>
using namespace std;

int main() {
    int sum, min = 57;
    int x[9], m[4][9] = {{8,1,6,3,5,7,4,9,2}, {6,1,8,7,5,3,2,9,4},
                         {8,3,4,1,5,9,6,7,2}, {6,7,2,1,5,9,8,3,4}};
    for(int i = 0; i < 9; i++)
        cin >> x[i];
    for(int k = 0; k < 8; k++){
        sum = 0;
        for(int i = 0; i < 9; i++){
            if(k/2) m[k/2][i] = 10 - m[k/2][i];
            sum += abs(x[i] - m[k/2][i]);
        }
        if(min > sum) min = sum;
    }
    cout << min;
    return 0;
}
