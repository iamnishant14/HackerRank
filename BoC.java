import java.io.*;
import java.lang.*;
import java.util.*;

class BoC{
	static int computeBOC(int n, int k){
		int[] c= new int[k+1];
		for(int i=0;i<k+1;i++){
			c[i]=0;
		}
		c[0]=1;
		for(int i=1;i<=n;i++){
			for(int j=Math.min(i,k);j>0;j--){
				c[j]+=c[j-1];
			}
		}
		return c[k];
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			System.out.println(computeBOC(n,k));
		}
	}
}