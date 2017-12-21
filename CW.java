import java.io.*;
import java.util.*;
import java.lang.*;

class CW{
	public static void calPoint(Vector<Integer> v,int g,int seed,int p){
		for(int i=1;i<v.size();i++){
			v.add(i,(v.get(i-1)*g+seed)%p);
		}
	}
	public static int calCount(Vector<Integer> v, int start,int end,int count){
		int x=v.get(start);
		int clock=start,antiClock=start;
		if(start+x>v.size()){
			clock=start+x-v.size();
		}
		if(start-x<0){
			antiClock=v.size()-(start-x);
		}
		if(start==end){
			return count;
		}
		else{
			if(Math.abs(clock-end)>=Math.abs(antiClock-end)){
				return calCount(v,clock,end,count+1);
			}
			else
				return calCount(v,antiClock,end,count+1);
		}
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		Vector<Integer> v= new Vector<Integer>();
		int start=sc.nextInt();
		int end=sc.nextInt();
		v.add(0,sc.nextInt());
		int g= sc.nextInt();
		int seed=sc.nextInt();
		int p=sc.nextInt();
		calPoint(v,g,seed,p);
		int count1=0;
		int count=calCount(v,start,end,count1);
		if(count==0){
			System.out.println("-1");
		}
		else
			System.out.println(count);
 	}
}