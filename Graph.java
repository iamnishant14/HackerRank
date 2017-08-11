import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Graph
{
	private Map<Integer,List<Integer>> adj;

	public Graph(int n)
	{
		adj=new HashMap<Integer,List<Integer>>();
		for(int i=0;i<n;i++)
		{
			adj.put(i,new LinkedList<Integer>());
		}
	}

	public void addEdge(int start,int finish)
	{
		if(start>adj.size()||finish>adj.size())
		{
			System.out.println("Invalid input for node");
			return;
		}
		List<Integer> slist=adj.get(start);
		slist.add(finish);
		List<Integer> flist=adj.get(finish);
		flist.add(start);
	}

	public List<Integer> getEdge(int start)
	{
		if(start>adj.size())
		{
			System.out.println("Invalid starting edge");
			return null;
		}
		return adj.get(start);
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int start,finish,vertices,edges;
		int count2=1,count=0;
		boolean[] visited; 
		try
		{
		vertices=sc.nextInt();
		edges=sc.nextInt();
		visited=new boolean[vertices];
		Graph adjacencyList=new Graph(vertices);
		//Create adjacencyList
		while(count2<=edges)
		{
			start=sc.nextInt();
			finish=sc.nextInt();
			adjacencyList.addEdge(start,finish);
			count2++;
		}
		//Display adjacencyList
		for(int i=0;i<vertices;i++)
		{
			List<Integer> vList=adjacencyList.getEdge(i);
			if(vList.size()==0)
				count+=vertices-1;
			int count1=0;
			for(int j=0;j<vList.size();j++)
			{
				count1++;
			}
			count+=(vertices-count1);
		}
	}
	catch(InputMismatchException e)
	{
		System.out.println("Error in Input Format. \nFormat : <start index> <finish index>");
	}
	catch(NullPointerException e)
	{
		System.out.println("null");
	}
	System.out.println(count);
}
}
