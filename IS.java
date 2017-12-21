import java.io.*;
import java.util.*;
import java.lang.*;

class IS
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(b);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print((j+1)+" ");
					break;
				}
			}
		}
		System.out.println("");

	}
}