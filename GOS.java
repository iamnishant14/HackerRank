import java.io.*;
import java.util.*;
import java.lang.*;

class GOS
{
	public static boolean KMP(String text,String pat)
	{
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
				j=lps[j-1];
				return true;
			}
			else if(i<N&&pat.charAt(j)!=text.charAt(i))
			{
				if(j!=0)
					j=lps[j-1];
				else
					i+=1;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			int k=sc.nextInt();
			Vector<String> result=new Vector<String>();
			int len=0;
			int flag=0;
			for(int i=1;i<s.length();i++)
			{
				String one=s.substring(0,i);
				String two=s.substring(s.length()-i);
				if(one.equals(two)==true)
				{
					result.addElement(one);
				}
			}
			if(result.size()==0)
			{
				System.out.println("Puchi is a cheat!");
			}
			else
			{
				for(int i=result.size()-1;i>=0;i--)
				{
					String pat=result.get(i);
					String text=s.substring(pat.length(),k);
					boolean state=KMP(text,pat);
					if(state==true)
					{
						flag=1;
						System.out.println(pat);
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("Puchi is a cheat!");
				}
			}
		}
	}
}