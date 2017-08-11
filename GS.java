import java.io.*;
import java.util.*;
import java.lang.*;

class GS{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			Vector<Integer>v=new Vector<Integer>(n);
			int count=1;
			for(int i=0;i<n;i++){
				if(i>1){
					count=v.get(i-1)+v.get(i-2)+1;
				}
				else if(i>0){
					count+=1;
				}
				v.addElement(count);
			}
			for(int i=0;i<n;i++){
				System.out.print(v.get(i)+" ");
			}
		}
	}
}