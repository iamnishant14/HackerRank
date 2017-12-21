import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a= new int[6];
        for(int i=0;i<6;i++)
        {
         a[i]= in.nextInt();
        }
        int x=0,y=0;
        for(int i=0;i+3<6;i++)
        {
         if(a[i]>a[i+3])
             x++;
         else if(a[i]<a[i+3])
             y++;    
        }
        System.out.println(x+" "+y);
    }
}
