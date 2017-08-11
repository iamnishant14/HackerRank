import java.io.*;
import java.lang.*;
import java.util.*;

class KA{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int curSum=a[0],maxSum=a[0];
			for(int i=1;i<n;i++){
				curSum=Math.max(a[i],curSum+a[i]);
				maxSum=Math.max(maxSum,curSum);
			}
			System.out.println(maxSum);
		}
	}
}