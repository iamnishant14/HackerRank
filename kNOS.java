import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.HashMap;

class kNOS{
	static HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
	static class CoComparator implements Comparator<Integer>
 	{
 		@Override
     	public int compare(Integer c1, Integer c2)
     	{
         	return hash.get(c1)>hash.get(c2)?1:0;
     	}
 	}
	static void kOccur(int[] a, int n, int k){
		for(int i=0;i<n;i++){
			if(hash.containsKey(a[i])){
				int value=hash.get(a[i]);
				hash.remove(a[i]);
				hash.put(a[i],value+1);
			}
			else{
				hash.put(a[i],1);
			}
		}
		int[] b= new int[hash.keySet().size()];
		int j=0;
		for(Integer x: hash.keySet()){
			b[j]=x;
			j++;
		}
		Collections.sort(hash, new CoComparator());
		for(int i=0;i<k;i++){
			System.out.print(b[i]);
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}

		}
	}
}