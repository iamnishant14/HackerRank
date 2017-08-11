import java.io.*;
import java.lang.*;
import java.util.*;

class KSmall{
	static int[] a=new int[1000];
	public static int findKSMall(int l,int r,int k){
		if(k>0&&k<=r-l+1){
			int pos=partition(l,r);
			if(pos-l==k-1){
				return a[pos];
			}
			if(pos-l>k-1){
				return findKSMall(l,pos-1,k);
			}
			return findKSMall(pos+1,r,k-pos+l-1);
		}
		return Integer.MAX_VALUE;
	}
	public static int partition(int l, int r){
		int x=a[r],i=l;
		for(int j=l;j<=r-1;j++){
			if(a[j]<x){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
		}
		int temp=a[i];
		a[i]=a[r];
		a[r]=temp;
		return i;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			System.out.println(findKSMall(0,n-1,k));
		}
	}
}