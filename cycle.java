import java.io.*;
import java.util.*;

class cycle
{
    private int V;   
    private LinkedList<Integer> adj[]; 
 
    // Constructor
    cycle(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    void addEdge(int v,int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
 
    Boolean isCyclicUtil(int v, Boolean visited[], int parent)
    {
        visited[v] = true;
        Integer i;
 
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();
 
            
            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }
 
          
            else if (i != parent)
                return true;
        }
        return false;
    }
 
    Boolean isCyclic()
    {
        
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
       
        for (int u = 0; u < V; u++)
            if (!visited[u]) 
                if (isCyclicUtil(u, visited, -1))
                    return true;
 
        return false;
    }
 
 
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Graph g1 = new Graph(n);
        int e=sc.nextInt();
        while(e>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            g1.addEdge(x, y);
            g1.addEdge(y,x);
            e--;
        }
        if (g1.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");

    }
}