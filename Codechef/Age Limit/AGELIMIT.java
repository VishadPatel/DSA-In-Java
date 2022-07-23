/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int i=0;i< T; i++){
		    
		    int X = scan.nextInt();
		    int Y = scan.nextInt();
		    int A = scan.nextInt();
		    
		    scan.nextLine();
		    
		    if(A >= X && A <= X ){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
		
	}
}
