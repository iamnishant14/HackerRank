import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.HashMap;

class BFS
{
	private static Map<Integer,LinkedList<Integer>> adjacencyList;

	public BFS(int n)
	{
		adjacencyList= new HashMap<Integer,LinkedList<Integer>>();
		for(int i=0;i<n;i++)
		{
			adjacencyList.put(i+1,new LinkedList<Integer>());
		}
	}

	public void addEdge(int source ,int destination)
	{
		if(source>adjacencyList.size()||destination>adjacencyList.size())
		{
			System.out.println("Invalid input");
			return;
		}
		List<Integer> slist=adjacencyList.get(source);
		slist.add(destination);
		List<Integer> dlist=adjacencyList.get(destination);
		dlist.add(source);
	}

	public static List<Integer> getEdge(int source)
	{
		if(source>adjacencyList.size())
		{
			return null;
		}
		return adjacencyList.get(source);
	}

	public static void Bfs(int start, int vertices)
	{
		boolean[] visited=new boolean[vertices+1];
		LinkedList<Integer>bfs=new LinkedList<Integer>();
			visited[start]=true;
			bfs.add(start);
			while(bfs.size()!=0)
			{
				int z=bfs.poll();
				System.out.print(z+" ");
				Iterator<Integer> i=adjacencyList.get(z).listIterator();
				while(i.hasNext())
				{
					int n= i.next();
					if(!visited[n])
					{
						visited[n]=true;
						bfs.add(n);
					}
				}
			}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		BFS graph= new BFS(n);
		int m=sc.nextInt();
		int count=0;
		while(count<m)
		{
			int source=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdge(source,destination);
			count++;
		}
		Bfs(1,n);
		System.out.println();
	}
}