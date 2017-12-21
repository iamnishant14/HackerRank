import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.HashMap;

class JM{
	private static Map<Integer,List<Integer>> adjacencyList;
	private static List<Integer> list= new ArrayList<Integer>();
	private static int count=0;
	public JM(int vertices)
	{
		adjacencyList=new HashMap<Integer,List<Integer>>();
		for(int i=0;i<vertices;i++)
		{
			adjacencyList.put(i,new LinkedList<Integer>());
		}
	}

	public static void addEdge(int source,int destination)
	{
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
		count++;
		Iterator<Integer> i=adjacencyList.get(start).listIterator();
		while(i.hasNext())
		{
			int n=i.next();
			if(!visited[n]){
				Dfs(n,visited);
			}
		}
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int e=sc.nextInt();
		int ans=n*(n-1)/2;
		JM graph = new JM(n);
		boolean[] visited= new boolean[n];
    	Arrays.fill(visited, false);
		while(e>0){
			int p,q;
			p = sc.nextInt();
			q=sc.nextInt();
			graph.addEdge(p,q);
			e--;
		}
		for(int i=0;i<n;i++){
        count=0;
        graph.Dfs(i,visited);
        ans=ans-count*(count-1)/2;
    	}
		System.out.println(ans);
	}
}