import java.io.*;
import java.lang.*;
import java.util.*;

class CT{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		while(x-->0){
			int v=sc.nextInt();
			int v1=sc.nextInt();
			int l=sc.nextInt();
			int t=sc.nextInt();
			int t1=l/v;
			int t2=l/(v+v1);
			if(t1-t2>=t){
				System.out.println("1.0");
			}
			else{
				System.out.println((double)(t1-t2)/t);
			}
		}
	}
}