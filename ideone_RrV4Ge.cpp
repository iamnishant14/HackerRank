#include <iostream>
#include <queue>
using namespace std;

int main() {
       int m,n;
       cin>>m>>n;
	   int a[m][n];
	   bool v[m][n];
	   int count=0;
	   for(int i=0;i<m;i++){
	   	for(int j=0;j<n;j++){
	   		cin>>a[i][j];
	   		if(a[i][j]==1)
	   		count++;
	   	}
	   }
	   int s;
	   cin>>s;
	   while(s>0)
	   {
	   for(int i=0;i<m;i++){
	   	for(int j=0;j<n;j++){
	   		v[i][j]=false;
	   	}
	   }	
	   int p,q;
	   cin>>p>>q;
	   int z[8]={-1,-1,0,1,1,1,0,-1};
	   int b[8]={0,1,1,1,0,-1,-1,-1};
	   queue<int> x,y;
	   x.push(p-1);y.push(q-1);
	   int count1=0;
	   while(!x.empty()&&!y.empty())
	   {
	   	 int A=x.front();
	   	 int B=y.front();
	   	    x.pop();
	        y.pop();
	     v[A][B]=true;   
	   	for(int i=0;i<8;i++)
	   	{
	   		if(A+z[i]>=m||A+z[i]<0||B+b[i]>=n||B+b[i]<0)
	   		   continue;
	   		if(v[A+z[i]][B+b[i]]==true)
	   		   continue;
	   	    if(a[A+z[i]][B+b[i]]==1)
	   	    {
	   	        count1++;
	   	        v[A+z[i]][B+b[i]]=true;
	   	    }
	   	    if(a[A+z[i]][B+b[i]]==0)
	   	    {
	   	        x.push(A+z[i]);
	   	        y.push(B+b[i]);
	   	    }
	   	}
	   }     
	      cout<<count-count1<<endl;
	   s--;
	   }
	   
	// your code goes here
	return 0;
}