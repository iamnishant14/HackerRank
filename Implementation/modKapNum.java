import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long t=sc.nextInt();
        long x=sc.nextInt();
        int count=0;
            for(long i=t;i<=x;i++)
            {
                String s=Long.toString(i*i);
                if(s.length()>1) 
                {
                long a=Long.parseLong(s.substring(0,s.length()/2));
                long b=Long.parseLong(s.substring(s.length()/2));
                    if(a+b==i){
                       System.out.print(i+" ");
                        count=1;
                    }
                }
                else
                    {
                    if(i==Integer.parseInt(s)){
                        System.out.print(i+" ");
                        count=1;
                    }
                }
            }
        if(count==0){
            System.out.print("INVALID RANGE");
        }
            System.out.println();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}