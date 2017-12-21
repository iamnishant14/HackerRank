import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math.*;

public class Solution {

    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          int t= sc.nextInt();
          double x=0;
          while(t>0){
              int a=sc.nextInt();
              int b=sc.nextInt();
              int count=0;
              int n = 1;
              int perfSq = 0;
   

    while (perfSq <= b){


        if (perfSq >= a && perfSq <= b)
            count++;

            perfSq = n*n;
            n++;


    }
                System.out.println(count);
                
                t--;  
          }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}