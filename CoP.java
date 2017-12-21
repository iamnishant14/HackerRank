import java.io.*;
import java.util.*;
import java.lang.*;

class CoP{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int m=sc.nextInt();
			int n=sc.nextInt();
			int[] a= new int[m];
			int[] b= new int[n];
			for(int i=0;i<m;i++){
				a[i]= sc.nextInt();
			}
			for(int i=0;i<n;i++){
				b[i]= sc.nextInt();
			}
			int x= sc.nextInt();
			int l=0,r=n-1,count=0;
			while(l<m&&r>=0){
				if(a[l]+b[r]==x){
					count++;
					l++;r--;
				}
				else if(a[l]+b[r]<x){
					l++;
				}
				else{
					r--;
				}
			}
			System.out.println(count);
		}
	}
}