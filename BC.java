import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Vector;
import java.util.stream.*;
class BC{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int m=sc.nextInt();
			int n=sc.nextInt();
			int[] x= new int[n];
			int[] y= new int[m];
			for(int i=1;i<m;i++){
				y[i]=sc.nextInt();
			} 
			for(int i=1;i<n;i++){
				x[i]=sc.nextInt();
			}
			int count=1;
			int count1=1;
			int max_old_x=1,max_old_y=1;
			Vector<Integer> x_new = new Vector(IntStream.of(x).boxed().collect(Collectors.toList()));
			Vector<Integer> y_new = new Vector(IntStream.of(y).boxed().collect(Collectors.toList()));
			int cost=0;
			while(count<=m+n){
				count++;
				Collections.sort(x_new);Collections.sort(y_new);
				int max=0;int max_x=0;int max_y=0;
				if(x_new.size()==0|| y_new.size()==0){
					if(x_new.size()!=0)
						max=x_new.lastElement();
					else if(y_new.size()!=0)
						max=y_new.lastElement();
					else
						break;
				}
				else{
					max_x=x_new.lastElement();
					max_y=y_new.lastElement();
					if(max_x>=max_y){
						max=max_x;
						if(x_new.size()>0)
							x_new.remove(x_new.size()-1);
					}
					else{
						max=max_y;
						if(y_new.size()>0)
							y_new.remove(y_new.size()-1);
					}
				}
				//cost+=count1*max;
				//System.out.println(cost);
				if(max==max_x){
					cost+=max*max_old_y;
					max_old_x++;
				}
				else{
					cost+=max*max_old_x;
					max_old_y++;
				}
			}
			System.out.println(cost%1000000007);
		}
	}
}