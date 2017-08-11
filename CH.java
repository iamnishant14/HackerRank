import java.io.*;
import java.lang.*;
import java.util.*;

class CH{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int e=0,x;
		for(int i=n-1;i>=0;i--){
			x=e+a[i];
			e=x/2+x%2;
		}
		System.out.println(e);
	}
}