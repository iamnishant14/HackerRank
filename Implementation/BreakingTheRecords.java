import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int max=score[0],min=score[0];
        int count=0,count1=0;
        for(int i=1;i<n;i++){
            if(score[i]>max){
                count++;
                max=score[i];
            }
            if(score[i]<min){
                count1++;
                min=score[i];
            }
        }
        System.out.println(count+" "+count1);
        // your code goes here
    }
}
