import java.io.*;
import java.util.*;
import java.util.LinkedList;
 

class euler
{
    private int V; 
    private LinkedList<Integer> adj[];
 
    
    euler(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    void addEdge(int v, int w)
    {
        adj[v].add(w);
        adj[w].add(v); 
    }
 
    
    void DFSUtil(int v,boolean visited[])
    {
        
        visited[v] = true;
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    boolean isConnected()
    {
        
        boolean visited[] = new boolean[V];
        int i;
        for (i = 0; i < V; i++)
            visited[i] = false;
 
        for (i = 0; i < V; i++)
            if (adj[i].size() != 0)
                break;
 
        if (i == V)
            return true;
 
        DFSUtil(i, visited);
 
        for (i = 0; i < V; i++)
           if (visited[i] == false && adj[i].size() > 0)
                return false;
 
        return true;
    }
 
    
    int isEulerian()
    {
        
        if (isConnected() == false)
            return 0;
 
       
        int odd = 0;
        for (int i = 0; i < V; i++)
            if (adj[i].size()%2!=0)
                odd++;
 
        
        if (odd > 2)
            return 0;
 
        return (odd==2)? 1 : 2;
    }
 
    void test()
    {
        int res = isEulerian();
        if (res == 0)
            System.out.println("graph is not Eulerian");
        else if (res == 1)
            System.out.println("graph has a Euler path");
        else
           System.out.println("graph has a Euler cycle");
    }
 

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int v=sc.nextInt();
        euler g1 = new euler(v);
        int e=sc.nextInt();
        while(e>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            g1.addEdge(x, y);
            g1.addEdge(y, x);
            e--;
        }
        g1.test();
    }
}