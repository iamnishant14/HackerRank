#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
char bom[200][200];
    int man[208][208],a,b;
    long long int c;
    cin>>a>>b>>c;
    for(int i=0;i<a;i++)
        for(int j=0;j<b;j++)
        {
        char ch;
        cin>>ch;
        if(ch=='.')
            man[i+1][j+1]=0;
        else
            man[i+1][j+1]=3;
    }
     if(c>100000000)
         {
    if(c%2==0)
        c=2;
    else if(c%4==1)
        c=5;
    else if(c%4==3) 
        c=3;
        }
    for(long long int z=1;z<=c;z++)
        {
        long int k=z%2;
        if (z==1)
            {
            
            
        for(int i=1;i<a+1;i++)
        for(int j=1;j<b+1;j++)
        {
        
           if( man[i][j]==3)
               {
               man[i][j]=man[i][j]-1;
           }
    }
     
        }
        else if(k==0)
            {
            
           for(int i=1;i<a+1;i++)
        for(int j=1;j<b+1;j++)
        {
        
           if( man[i][j]==0)
               {
               man[i][j]=3;
           }
                else
                    man[i][j]=man[i][j]-1;
    }
          

        }
        else if((k==1)&&(z!=1))
            {
            
            
        for(int i=1;i<a+1;i++)
        for(int j=1;j<b+1;j++)
        {
        
           if( man[i][j]==3)
               {
               man[i][j]=man[i][j]-1;
           }
            else if(man[i][j]==1)
                {
                man[i][j]=0;
                if(man[i+1][j]!=1)
                man[i+1][j]=0;
                man[i-1][j]=0;
                if(man[i][j+1]!=1)
                man[i][j+1]=0;
                man[i][j-1]=0;
            }
    }
                
    }
    }   

    for(int i=1;i<a+1;i++)
         {
        for(int j=1;j<b+1;j++)
        {
        if(man[i][j]==0)
            {
            cout<<".";
        }
            else
                cout<<"O";
    }
         cout<<endl;
     }
             cout<<endl<<endl;   

    return 0;
}