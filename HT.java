import java.io.*;
import java.lang.*;
import java.util.*;

class HT{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			int[] a= new int[n];
			int[] b= new int[n];
			int[] c= new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				b[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				c[i]=sc.nextInt();
			}
			Arrays.sort(a);Arrays.sort(b);Arrays.sort(c);
			int i=0,j=0,k=0,maxm=Integer.MAX_VALUE,temp_min=Integer.MAX_VALUE,temp_max=Integer.MAX_VALUE,temp_mid=Integer.MAX_VALUE;
			while(i<n&&j<n&&k<n){
				int min=Math.min(a[i],Math.min(b[j],c[k]));
				int max=Math.max(a[i],Math.max(b[j],c[k]));
				int sum=a[i]+b[j]+c[k];
				int diff=max-min;
				if(maxm>diff){
					maxm=diff;
					temp_max=max;
					temp_min=min;
					temp_mid=sum-(max+min);
				}
				if(min==a[i]){
					i++;
				}
				else if(min==b[j]){
					j++;
				}
				else{
					k++;
				}
			}
			System.out.println(temp_max+" "+temp_mid+" "+temp_min);
		}
	}
}