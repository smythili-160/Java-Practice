import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int max=Integer.MIN_VALUE;
		    int min_key=Integer.MAX_VALUE;
		    int[] b=new int[n];
		    for(int i=0;i<n;i++){
                b[i]=count(a,a[i]);
		        max=Integer.max(max,b[i]);
		        
		    }
		    for(int i=0;i<n;i++){
		        if(b[i]==max){
		            min_key=Integer.min(min_key,a[i]);
		        }
		        
		    }
		    System.out.println(min_key+" "+max);
		    
		}

	}
	public static int count(int[] a,int num){
	    int n=0;
	    for (int i=0;i<a.length;i++ ){
	        a[i]=num;
	        n++;
	    } 
	    return n;
	}
}
