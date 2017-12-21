import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n+1];
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            a[x]=i;
        }
        for(int i=1;i<=n;i++)
        {
            System.out.println(a[a[i]]);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}
