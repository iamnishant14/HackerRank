import java.io.*;
import java.lang.*;
import java.util.*;

class AD
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String test=sc.next();
		String pat=sc.next();
		int k=sc.nextInt();
		int i=0;
		for(i=0;i<test.length()&&i<pat.length();i++)
		{
			if(test.charAt(i)!=pat.charAt(i))
				break;
		}
		int d=test.length()-i;
		int e=pat.length()-i;
		int p=k-d-e;
		if(p==0)
			System.out.println("Yes");
		else if(p<0)
			System.out.println("No");
		else
		{ 
			if(p%2==0)
				System.out.println("Yes");
			else
			{
				if(p>=(2*i))
					System.out.println("Yes");
				else
					System.out.println("No");
			}

		}
	}
}