#include <iostream>
#include <vector>
using namespace std;

class Graph
{
	private: 
		int v;
		vector<int> *adj;

	public: Graph(int v)
	{
		this->v=v;
		adj=new vector<int>[v+1];
	}

	public : void addEdge(int source,int destination)
	{
		if(source>v||destination>v)
		{
			cout<<"Wrong input entered";
			return;
		}
		adj[source].push_back(destination);
		adj[destination].push_back(source);
	}
	public: vector<int> getEdge(int source)
	{
		return adj[source];
	}
};
	int main()
	{
		int vertices;
		cin>>vertices;
		Graph graph(vertices);
		int e;
		cin>>e;
		int count=1;
		while(count<=e)
		{
			int source,destination;
			cin>>source>>destination;
			graph.addEdge(source,destination);
			count++;
		}
      int query;
      cin>>query;
		for(int i=1;i<=query;i++)
		{
			int x,y;
          	int temp=0;
          cin>>x>>y;
			vector<int> v1 = graph.getEdge(x);
			for(int j=0;j<v1.size();j++)
			{
				if(v1[j]==y){
                  temp=1;
                  cout<<"YES"<<endl;
                }
			}
          if(temp==0)
            cout<<"NO"<<endl;
		}
		return 0;
	}