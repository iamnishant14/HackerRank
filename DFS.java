import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.HashMap;
class DFS
{
	private static Map<Integer,List<Integer>> adjacencyList;
	private static List<Integer> list= new ArrayList<Integer>();
	public DFS(int vertices)
	{
		adjacencyList=new HashMap<Integer,List<Integer>>();
		for(int i=1;i<=vertices;i++)
		{
			adjacencyList.put(i,new LinkedList<Integer>());
		}
	}

	public static void addEdge(int source,int destination)
	{
		if(source>adjacencyList.size()||destination>adjacencyList.size())
		{
			System.out.println("Invalid input");
			return;
		}
		List<Integer>slist=adjacencyList.get(source);
		slist.add(destination);
		List<Integer>dlist=adjacencyList.get(destination);
		dlist.add(source);
	}

	public static List<Integer> getEdge(int source)
	{
		if(source>adjacencyList.size())
			return null;
		return adjacencyList.get(source);
	}

	public static void Dfs(int start,boolean[] visited)
	{
		visited[start]=true;
		System.out.print(start+" ");
		Iterator<Integer> i=adjacencyList.get(start).listIterator();
		while(i.hasNext())
		{
			int n=i.next();
			if(!visited[n]){
				Dfs(n,visited);
			}
		}
	}
	public static boolean haveCycle(boolean[] visited)
	{
		for(int i=1;i<visited.length+1;i++)
		{
			Dfs(i,visited);
			if(list.contains(i))
				return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		DFS graph=new DFS(n);
		int m=sc.nextInt();
		int count=1;
		while(count<=m)
		{
			int start=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdge(start,destination);
			count++;
		}
		boolean[] v= new boolean[n+1];
		System.out.println("Enter starting vertex");
		int x=sc.nextInt();
		list.add(x);
		Dfs(x,v);
		System.out.println();
	}
}