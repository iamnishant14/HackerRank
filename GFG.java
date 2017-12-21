import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int findlen(String s){
        int n=s.length()+1;
        int[] a= new int[n];
        a[0]=0;
        for(int i=1;i<=n;i++){
            a[i]=a[i-1]+(s.charAt(i-1)-'0');
        }
        int max=0;
        for(int len=2;len<=n;len+=2){
            for(int i=0;i<=n-len;i++){
                if(a[i+len/2]-a[i]==a[i+len]-a[i+len/2]){
                    max=Math.max(max,len);
                }
            }
        }
        return max;
    }
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
		    String s=sc.next();
		    System.out.println(findlen(s));
		}
	}
}