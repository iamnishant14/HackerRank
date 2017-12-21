#include <bits/stdc++.h>

using namespace std;

bool leap(int y) {
    if (y < 1918)
        return y % 4 == 0;
    else
        return (y % 100 != 0 && y % 4 == 0) || y % 400 == 0;
}

int main() {
    int y;
    
    cin >> y;
    
    if (y == 1918)
        cout << "26.09.1918" << endl;
    else if (leap(y))
        cout << "12.09." << y << endl;
    else
        cout << "13.09." << y << endl;
    
    return 0;
}
