import java.io.*;
import java.lang.*;
import java.util.*;

class EP{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			int[] a= new int[n];
			int sum=0;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				sum+=a[i];
			}
			int[] left= new int[n];
			left[0]=0;
			int count=0;
			for(int i=1;i<n;i++){
				left[i]=left[i-1]+a[i-1];
				if(sum-(left[i]+a[i])==left[i]){
					System.out.println(i+1);
					count=1;
					break;
				}
			}
			if(n==1){
				System.out.println(n);
			}
			if(count==0&&n>1){
				System.out.println("-1");
			}
		}
	}
}