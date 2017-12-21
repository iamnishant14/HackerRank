import java.io.*;
import java.util.*;

public class Solution {
    
    public static int Triplets( ArrayList<Integer> e, int n, int d ) {
        int count = 0;
        for( Integer v : e ) {
            if( e.contains( (v + d) ) && e.contains( (v + 2*d) ) )
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), d = in.nextInt();
        ArrayList<Integer> elements = new ArrayList<>();
        for( int i = 0; i < n; i++ ) {
            elements.add( in.nextInt() );
        }
        System.out.println( Triplets(elements, n, d) );
    }
}