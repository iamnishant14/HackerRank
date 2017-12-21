#include <iostream>
#include <vector>
#include <queue>
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
			return;
		}
		adj[source].push_back(destination);
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
		int e=vertices-1;
		int count=1;
		while(count<=e)
		{
			int source,destination;
			cin>>source>>destination;
			graph.addEdge(source,destination);
			count++;
		}
		int level;
		cin>>level;
		queue<int>q;
		q.push(1);
		bool visited[vertices+1];
		visited[1]=true;
		int count1=1,temp=0;
		int num=0;
		while(!q.empty())
		{
			int z=q.front();
			q.pop();
			vector<int> v=graph.getEdge(z);
			count1++;
			if(count1==level)
					{
						num=v.size();
						break;
					}
			for(int i=0;i<v.size();i++)
			{
				if(!visited[v[i]])
				{
					visited[v[i]]=true;
					q.push(v[i]);
				}
			}
		}
		cout<<num<<endl;
		return 0;
	}