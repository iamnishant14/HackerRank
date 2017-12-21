import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String a= sc.next();
        int level=0,count=0;
        boolean belowSea=false;
        for(int i=0;i<a.length();i++)
        {
            char slope = a.charAt(i);
            if(slope == 'U')
                level++;
            else
                level--;
            
            if(!belowSea && level < 0)
            {
                count++;
                belowSea = true;
            }
            
            if(level >= 0)
                belowSea = false;
        }
        System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}