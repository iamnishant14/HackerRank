import java.io.*;
import java.lang.*;
import java.util.*;

class CE
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='O')
					count++;
			}
			for(int i=0;i<s.length();i++)
			{
				int j=i;
				while(j<s.length()&&s.charAt(j)!='*')
			}
			System.out.println(count);
		}
	}
}