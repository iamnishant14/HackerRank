import java.io.*;
import java.util.*;
import java.lang.*;

class KMP
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String pat=sc.next();
		String text=sc.next();
		int M=pat.length(),N=text.length();
		int len=0;
		int count=0;
		int[] lps=new int[M];
		lps[0]=0;
		int i=1;
		while(i<M)
		{
			if(pat.charAt(i)==pat.charAt(len))
			{
				len++;
				lps[i]=len;
				i++;
			}
			else
			{
				if(len!=0)
				{
					len=lps[len-1];
				}
				else
				{
					lps[i]=0;
					i++;
				}
			}
		}
		i=0;int j=0;
		while(i<N)
		{
			if(pat.charAt(j)==text.charAt(i))
			{
				i++;
				j++;
			}
			if(j==M)
			{
				count++;
				j=lps[j-1];
			}
			else if(i<N&&pat.charAt(j)!=text.charAt(i))
			{
				if(j!=0)
					j=lps[j-1];
				else
					i+=1;
			}
		}
		System.out.println(count);

	}
}