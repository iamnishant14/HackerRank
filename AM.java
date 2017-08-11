import java.io.*;
import java.lang.*;
import java.util.*;

class AM
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); //No of vertices
		int[][] a=new int[n][n]; // Adjacent matrix for all nodes(vertices). 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=0;
			}
		}
		int m=sc.nextInt(); //No of edges.
		for(int i=0;i<m;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			a[x-1][y-1]=1;
			a[y-1][x-1]=1;
		}
		//Print the graph
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+"->");
			for(int j=0;j<n;j++)
			{
				int count=0;
				if(a[i][j]==1)
				{
					if(j==n-1)
						System.out.print(j+1);
					else
						System.out.print((j+1)+"->");
				}
			}
			System.out.print("->null");
			System.out.println("");
		}
	}
}