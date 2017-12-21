import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(i==0)
            {
                count++;
            }
            else
            {
              if(Character.isUpperCase(s.charAt(i))==true)
                  count++;
            }
          
        }
        System.out.println(count);
    }
}
