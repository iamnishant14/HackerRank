
#pragma comment(linker, "/STACK:66777216")
#define _CRT_SECURE_NO_WARNINGS
#include <unordered_set>
#include <unordered_map>
#include <functional>
#include <algorithm>
#include <iostream>
#include <sstream>
#include <fstream>
#include <cassert>
#include <iomanip>
#include <cstring>
#include <cstdio>
#include <bitset>
#include <string>
#include <vector>
#include <ctime>
#include <queue>
#include <stack>
#include <cmath>
#include <set>
#include <map>
#include <vector>
using namespace std;

typedef long long LL;
typedef long double LD;
#define pb push_back
#define mp make_pair
#define all(v) (v).begin(), (v).end()
#define sz(v) (int)(v).size()

int main()
{
#ifdef harhro94
   freopen("input.txt", "r", stdin);
   //freopen("output.txt", "w", stdout);
#else
#define task "matrix"
   //freopen(task".in", "r", stdin);
   //freopen(task".out", "w", stdout);
#endif

   int n;
   cin >> n;
   vector<string> a(n);
   for (int i = 0; i < n; ++i)
      cin >> a[i];

   for (int i = 0; i < n; ++i)
   {
      for (int j = 0; j < n; ++j)
      {
         if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
            cout << a[i][j];
         else
         {
            if (a[i][j] > a[i][j - 1] && a[i][j] > a[i][j + 1] && a[i][j] > a[i - 1][j] && a[i][j] > a[i + 1][j])
               cout << 'X';
            else
               cout << a[i][j];
         }
      }
      cout << endl;
   }

#ifdef harhro94
   cerr << fixed << setprecision(3) << "\nExecution time = " << clock() / 1000.0 << "s\n";
#endif
   return 0;
}