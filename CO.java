import java.io.*;
import java.lang.*;
import java.util.*;

class CO{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int[] lis=new int[n];
			if(a[0]==1){
				lis[0]=1;
			}
			else{
				lis[0]=0;
			}
			int max=0;
			for(int i=1;i<n;i++){
				if(a[i]==1){
					lis[i]=lis[i-1]+1;
				}
				else{
					lis[i]=0;
				}
				if(lis[i]>max){
					max=lis[i];
				}
			}
			System.out.println(max);
		}
	}
}