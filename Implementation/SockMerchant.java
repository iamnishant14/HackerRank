import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap h= new HashMap();
        for(int c_i=0; c_i < n; c_i++)
        {
            int x=in.nextInt();
            if(h.containsKey(x)==true)
            {
                int y=(int)h.get(x);
                h.remove(x);
                h.put(x,y+1);
            }
            else
            {
                h.put(x,1);
            }
        }
        Set set = h.entrySet();
        Iterator i=set.iterator();
        int count=0;
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            count+=((int)me.getValue())/2;
        }
        System.out.println(count);
}
}