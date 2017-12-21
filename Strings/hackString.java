import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
        String s = in.next();
      String k="hackerrank";
        char[] c=new char[10];
       c=k.toCharArray();
        int d=0,j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c[j]){
                d++;
                j++;
                if(d==10){
                    break;
                }
            }
        }
        if(d==10)
            System.out.println("YES");
        else
         System.out.println("NO");
    }
    }
}
