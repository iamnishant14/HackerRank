import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        LinkedList l= new LinkedList();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        while(k>0){
            int x=(int)l.removeLast();
            l.addFirst(x);
            k--;
        }
        for(int i=0;i<q;i++){
            int z=sc.nextInt();
            System.out.println(l.get(z));
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}