import java.io.*;
import java.lang.*;
import java.util.*;

class ASP{
	public static class Node{
		int start,finish;

		void add(int start, int finish){
			this.start=start;
			this.finish=finish;
		}
	}
	public static class Sortbyroll implements Comparator<Node>
	{
		@Override
    	public boolean compare(Node a, Node b)
    	{
        	return (a.finish <= b.finish);
    	}
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		Node[] node= new Node[n];
		for(int i=0;i<n;i++){
			node[i].add(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(node,new Sortbyroll());
		int i=0;
		System.out.println(node[i].start+" "+node[i].finish);
		for(int j=1;j<n;j++){
			if(node[j].start>=node[i].finish){
				System.out.println(node[j].start+" "+node[j].finish);
				i=j;
			}
		}

	}
}