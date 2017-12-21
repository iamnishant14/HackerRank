#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

string min(int a){
    string x;
    switch(a){
        case 1:x="one";
        break;
        case 2:x="two";
        break;
        case 3:x="three";
        break;
        case 4:x="four";
        break;
        case 5:x="five";
        break;
        case 6:x="six";
        break;
        case 7:x="seven";
        break;
        case 8:x="eight";
        break;
        case 9:x="nine";
        break;
        case 10:x="ten";
        break;
        case 11:x="eleven";
        break;
        case 12:x="twelve";
        break;
        case 13:x="thirteen";
        break;
        case 14:x="fourteen";
        break;
        case 15:x="fifteen";
        break;
        case 16:x="sixteen";
        break;
        case 17:x="seventeen";
        break;
        case 18:x="eighteen";
        break;
        case 19:x="nineteen";
        break;
        case 20:x="twenty";
        break;
        case 21:x="twenty one";
        break;
        case 22:x="twenty two";
        break;
        case 23:x="twenty three";
        break;
        case 24:x="twenty four";
        break;
        case 25:x="twenty five";
        break;
        case 26:x="twenty six";
        break;
        case 27:x="twenty seven";
        break;
        case 28:x="twenty eight";
        break;
        case 29:x="twenty nine";
        break; 
        case 30:x="half";
        break;      
    }
    return x;
}
string hour(int a){
    string x;
    switch(a){
        case 1:x="one";
        break;
        case 2:x="two";
        break;
        case 3:x="three";
        break;
        case 4:x="four";
        break;
        case 5:x="five";
        break;
        case 6:x="six";
        break;
        case 7:x="seven";
        break;
        case 8:x="eight";
        break;
        case 9:x="nine";
        break;
        case 10:x="ten";
        break;
        case 11:x="eleven";
        break;
        case 12:x="twelve";
        break;
        
        }
    return x;
}
int main() {
    int h, m;
    string h1,m1;
    cin>>h;
    cin>>m;
    if(m<30&&m!=00&&m!=30&&m!=15){
        m1=min(m);
        h1=hour(h);
        cout<<m1<<" "<<"minutes"<<" "<<"past"<<" "<<h1<<endl;
    }
    else if(m>30&&m!=45){
        m1=min(60-m);
        h1=hour(h+1);
        cout<<m1<<" "<<"minutes"<<" "<<"to"<<" "<<h1<<endl;
        }
    else if(m==30){
        m1=min(m);
        h1=hour(h);
        cout<<m1<<" "<<"past"<<" "<<h1<<endl;
    }
    else if(m==00){
        h1=hour(h);
        cout<<h1<<" "<<"o'"<<" "<<"clock"<<endl;
    }
    else if(m==15||m==45){
        if(m==15){
            h1=hour(h);
        cout<<"quarter"<<" "<<"past"<<" "<<h1<<endl;
        }
        else{
            h1=hour(h+1);
        cout<<"quarter"<<" "<<"to"<<" "<<h1<<endl;
    }
    }
    
        
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
