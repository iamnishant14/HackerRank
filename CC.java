import java.io.*;
import java.util.*;
import java.lang.*;

class CC{


	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int a[]= new int[m];
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
		}
		long[] table = new long[n+1];
        Arrays.fill(table, 0);
        table[0] = 1;
        for (int i=0; i<m; i++)
            for (int j=a[i]; j<=n; j++)
                table[j] += table[j-a[i]];
        System.out.println(table[n]);
	}
}