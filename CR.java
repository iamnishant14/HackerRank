import java.util.*;
import java.lang.*;
import java.io.*;

class CR{
	static int computeCR(int[] a, int n){
		int[] list= new int[n+1];
		list[0]=0;
		for(int i=1;i<=n;i++){
			int max=Integer.MIN_VALUE;
			for(int j=0;j<i;j++){
				max=Math.max(max,a[j]+list[i-j-1]);
			}
			list[i]=max;
		}
		return list[n];
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
			System.out.println("Cutting Rod is: "+computeCR(a,n));
		}
	}
}