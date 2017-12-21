import java.io.*;
import java.lang.*;
import java.util.*;

class BS
{
	public static int reverse(int x)
	{
		String s=Integer.toString(x);
		StringBuilder str=new StringBuilder();
		str.append(s);
		str.reverse();
		s=str.toString();
		return Integer.parseInt(s);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++)
		{
			int x=reverse(i);
			if((Math.abs(x-i))%k==0)
				count++;
		}
		System.out.println(count);
	}
}