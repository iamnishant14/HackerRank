import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
    
    static char vow[],con[];
    
	public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		if(T>=1 && T<=200){
		    String S[]=new String[T];
		    for(int i=0;i<T;i++)
		        S[i]=br.readLine();
		        
		    for(int i=0;i<T;i++){
		        if(S[i].length()>=1 && S[i].length()<=1000){
		        String s=updateStr(S[i]);
		        System.out.println(s);
		        }
		 }
		}
	}
	
	public static String updateStr(String s){
	    String newstr="";
	    int v=0,c=0;
	    
	    for(int i=0;i<s.length();i++)
	        if(isVowel(s.charAt(i)))
	            v++;
	        else
	            c++;
	    
	    vow=new char[v];
	    con=new char[c];
	    
	    int j=0,k=0;
	    for(int i=0;i<s.length();i++)
	        if(isVowel(s.charAt(i)))
	            vow[j++]=s.charAt(i);
	        else
	            con[k++]=s.charAt(i);
	    
	    sort(vow,v);
	    sort(con,c);
	    
	    if(isVowel(s.charAt(0))){
	        j=0;k=0;
	        for(int i=0;i<s.length();i++){
	            if(j<v && k<c){
	                if(i%2!=0)
	                    newstr+=con[k++];
	                else
	                    newstr+=vow[j++];
	            }
	        }
	    }
	    else{
	        j=0;k=0;
	        for(int i=0;i<s.length();i++){
	            if(j<v && k<c){
	                if(i%2==0)
	                    newstr+=con[k++];
	                else
	                    newstr+=vow[j++];
	            }
	        }
	   }
	    
	    while(j<v)
	        newstr+=vow[j++];
	    
	    while(k<c)
	        newstr+=con[k++];
	    
	    
	    return newstr;
	    
	}
	
	public static boolean isVowel(char c){
	    char v[]={'a','e','i','o','u','A','E','I','O','U'};
	    int f=0;
	    for(int i=0;i<5;i++)
	        if(c==v[i]){
	            f=1;
	            break;
	        }
        if(f==0)
            return false;
        return true;
	}
	
	public static void sort(char arr[],int n){
	    char t;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-i-1;j++){
	            if(arr[j]>arr[j+1]){
	                t=arr[j+1];
	                arr[j+1]=arr[j];
	                arr[j]=t;
	            }
	        }
	    }
	}
}