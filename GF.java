import java.io.*;
import java.util.*;
import java.lang.*;

class GF{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++){
				a[i]= sc.nextInt();
			}
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++){
				int temp=a[i];
				int j=i;
				while(j+1<n&&a[j+1]>a[j]){
					temp+=a[j+1];
					j++;
				}
				if(max<temp){
					max=temp;
				}
				if(j+1==n-1){
					break;
				}
			}
			System.out.println(max);
		}
	}
}