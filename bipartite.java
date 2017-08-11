import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.HashMap;

class Bipartite
{
	private static Map<Integer,LinkedList<Integer>> adjacencyList;
	public Bipartite(int n)
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
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int vertices=sc.nextInt();
		int edges=sc.nextInt();
		Bipartite graph= new Bipartite(vertices);
		int[] node_point=new int[vertices+1];
		int count=0;
		for(int i=1;i<vertices+1;i++)
			node_point[i]=0;
		while(count<edges){
			int x=sc.nextInt();
			int y=sc.nextInt();
			graph.addEdge(x,y);
			if(node_point[x]==0)
				node_point[y]=1;
			else
				node_point[y]=0;
			count++;
		}
		Set<Integer> list= new HashSet<Integer>();
		Set<Integer>list_1= new HashSet<Integer>();
		for(int i=1;i<vertices+1;i++){
			List<Integer> slist=graph.getEdge(i);
			int point=node_point[i];
			Iterator<Integer> j=slist.listIterator();
			while(j.hasNext())
			{
				int n=j.next();
				if(node_point[n]!=point){
					if(point==1&&list.contains(n)==false)
						list.add(n);
					else if(point==0&&list_1.contains(n)==false)
						list_1.add(n);
				}
			}
		}
		if(list.size()==0|| list_1.size()==0)
			System.out.println("Graph is not Bipartite");
		else{
			System.out.println(list);
			System.out.println(list_1);
		}
	}
}

boolean isBipartite(int G[][],int src)
    {
        // Create a color array to store colors assigned to all veritces.
        // Vertex number is used as index in this array. The value '-1'
        // of  colorArr[i] is used to indicate that no color is assigned
        // to vertex 'i'.  The value 1 is used to indicate first color
        // is assigned and value 0 indicates second color is assigned.
        int colorArr[] = new int[V];
        for (int i=0; i<V; ++i)
            colorArr[i] = -1;
 
        // Assign first color to source
        colorArr[src] = 1;
 
        // Create a queue (FIFO) of vertex numbers and enqueue
        // source vertex for BFS traversal
        LinkedList<Integer>q = new LinkedList<Integer>();
        q.add(src);
 
        // Run while there are vertices in queue (Similar to BFS)
        while (q.size() != 0)
        {
 
            // Dequeue a vertex from queue
            int u = q.poll();
 
            // Find all non-colored adjacent vertices
            for (int v=0; v<V; ++v)
            {
                // An edge from u to v exists and destination v is
                // not colored
                if (G[u][v]==1 && colorArr[v]==-1)
                {
                    // Assign alternate color to this adjacent v of u
                    colorArr[v] = 1-colorArr[u];
                    q.add(v);
                }
 
                // An edge from u to v exists and destination v is
                // colored with same color as u
                else if (G[u][v]==1 && colorArr[v]==colorArr[u])
                    return false;
            }
        }
        // If we reach here, then all adjacent vertices can
        //  be colored with alternate color
        return true;
    }