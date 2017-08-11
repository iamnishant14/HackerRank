import java.io.*;
import java.lang.*;
import java.util.*;

class EN{
	public static int check(int n){
		int count=0;
		while(n>0){
			int z=n&1;
			//System.out.println(z+" "+n);
			if(z==1)
				count++;
			n=n>>1;
		}
		return count;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			int z=check(n);
			System.out.println(z);
			if(z%2==0){
				System.out.println("Evil Number");
			}
			else{
				System.out.println(" No Evil");
			}
		}
	}
}