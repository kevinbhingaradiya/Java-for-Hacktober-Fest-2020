

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static boolean isPrime(int n){
        if(n==1)
        return false;
        
        if(n==2 || n==3)
        return true;
        
        if(n%2==0 || n%3==0)
        return false;
        
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0 || n % (i+2) == 0)
            return false;
        }
        return true;
    }
    
	public static void main (String[] args) {
		//code
		
	Scanner sc=new Scanner(System.in);
	int count=sc.nextInt();
	
	
	for(int i=0;i<count;i++)
	{
	    int low=sc.nextInt();
	    int high=sc.nextInt();
	    
	    for(int j=low;j<=high;j++)
	    {
	        if(isPrime(j))
	        System.out.print(j+" ");
	    }
	    System.out.print("\n");
	}
	}
}
