import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int end=(n-p)/2;
        int start=p/2;
        System.out.println(Math.min(start,end));
        // your code goes here
    }
}
