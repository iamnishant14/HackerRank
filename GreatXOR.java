import java.io.*;
import java.util.*;
import java.lang.*;

class GreatXOR{
	public static long countXOR(long x){
		long count=0;
		int zeroes=Long.numberOfLeadingZeros(x);
		while(count<64-zeroes){
			x^=1L<<count;
			count++;
		}
		return x;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0){
			long x=sc.nextLong();
			System.out.println(countXOR(x));
			n--;
		}
	}
}