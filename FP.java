import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.HashMap;

class FP{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int count=0;
			HashMap<Integer,Integer> s= new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(s.containsKey(a[i]*a[j])){
						count=1;
					}
					else{
						s.put(a[i]*a[j],count);
					}
				}
			}
			System.out.println(count);
		}
	}
}