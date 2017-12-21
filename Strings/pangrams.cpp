#include <bits/stdc++.h>
using namespace std;
int main()
{
    string a; getline(cin, a);map <char,int> he;
    for (int g=0;g<a.length(); g++)
    {
        if (a[g]>='A' && a[g]<='Z')
        {
            a[g]=char(a[g]-'A'+'a');
            he[a[g]]++; 
        }
        if (a[g]>='a' && a[g]<='z')
        {
            he[a[g]]++; 
        }
    }
    for (int g=0; g<26; g++)
    {
        if (!he[char('a'+g)])
        {
            cout << "not pangram"; return 0; 
        }
    }cout << "pangram"; 
    return 0; 
    
}
