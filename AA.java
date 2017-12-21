import java.io.*;
import java.util.*;
import java.lang.*;

class AA{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String x=sc.next();
			String y=sc.next();
			char[] c=x.toCharArray();
			char[] c1=y.toCharArray();
			Arrays.sort(c);
			Arrays.sort(c1);
			String m=new String(c);
			String n=new String(c1);
			if(m.equals(n)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}