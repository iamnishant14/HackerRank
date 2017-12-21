import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int e=100;int count=0;
        for(int i=(0+k)%n;count!=1;){
        if(c[i]==1)
            e-=3;
        else
            e-=1;
        if(i==0)
            count++;
        i=(i+k)%n;
    }
        System.out.println(e);
    }
}
