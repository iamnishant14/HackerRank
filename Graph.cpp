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
		cout<<"Adjacency list :"<<endl;
		for(int i=1;i<=vertices;i++)
		{
			cout<<i<<"->";
			vector<int> v1 = graph.getEdge(i);
			for(int j=0;j<v1.size();j++)
			{
				if(j==v1.size()-1)
					cout<<v1[j];
				else
					cout<<v1[j]<<"->";
			}
			cout<<endl;
		}
		return 0;
	}