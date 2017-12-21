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
    public static void printPaths(Bipartite graph,int u, int d, boolean[] visited,
                              int[] path, int path_index)
    {
        visited[u] = true;
        path[path_index] = u;
        path_index++;

        if (u == d)
        {
            for (int i = 0; i<path_index; i++)
                System.out.print(path[i] + " ");
            System.out.println();
        }
        else
        {
            Iterator<Integer> i=graph.getEdge(u).listIterator();
            while(i.hasNext()){
                int n=i.next();
                if (!visited[n])
                    printPaths(graph,n, d, visited, path, path_index);
            }
        }
        visited[u] = false;
        path_index--;
        visited[u] = false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int vertices=sc.nextInt();
        int edges=sc.nextInt();
        Bipartite graph= new Bipartite(vertices);
        int[] node_point=new int[vertices+1];
        int count=0;
        boolean[] visited = new boolean[vertices+1];
        int[] path = new int[vertices+1];
        int path_index = 0;
        while(count<edges){
            int x=sc.nextInt();
            int y=sc.nextInt();
            graph.addEdge(x,y);
            count++;
        }
        for (int i = 1; i < vertices+1; i++)
            visited[i] = false;
        int x=sc.nextInt();
        int y=sc.nextInt();
        graph.printPaths(graph,x,y,visited,path,path_index);
    }
}