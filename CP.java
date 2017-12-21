import java.io.*;
import java.lang.*;
import java.util.*;

class CP{
	static int[] dp=new int[1000000];
	public static int change(int n){
		if(n==1)
			return 1;
		if(n==0)
			return 0;
		if(dp[n]!=-1){
			return dp[n];
		}
		return dp[n]=Math.max(change(n/2)+change(n/3)+change(n/4),n);
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			for(int i=0;i<=n;i++){
				dp[i]=-1;
			}
			int cost=change(n);
			System.out.println(cost);
		}
	}
}