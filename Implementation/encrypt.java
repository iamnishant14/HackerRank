import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int a=s.length();
        int i,j=0;
        for(i=1;i<=a;i++){
           if(a==(i*i)){
                j=i;
                 break;
           }    
           else if(a<(i*i)){
                 j=i-1;
                 if((i*j)<a)
                    j=i;   
                 break;
           }   
        }
         char[][] x= new char[j][i];
          int k,l;
        for(k=0;k<j;k++){
              for(l=0;l<i;l++){
                  if(k*(i)+l<a){  
                    x[k][l]=s.charAt(k*(i)+l);
              }
              }
        }  
         for(int r=0;r<i;r++){
              for(int p=0;p<j;p++){
                    if(x[p][r]!=(char) 0)
                    System.out.print(x[p][r]);  
              }
               System.out.print(" ");
        } 
    }
}
