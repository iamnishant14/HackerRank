import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
    int m=5,x,s=0;
    int n=in.nextInt();
    for(int i=0;i<n;i++){

        x=(m/2)*3;           
        s=s+(m/2);
         m=x;
     }
    System.out.print(s);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}