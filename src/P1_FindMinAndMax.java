/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P1_FindMinAndMax {

	public static void main(String[] args) {
        Scanner console = new Scanner( System.in );
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        // YOUR CODE STARTS HERE
        int sentinel = -1;
        	System.out.print("Type a number (or " + sentinel + " to stop): ");
        
        int input = console.nextInt();
        while (input !=sentinel) {
        	     if (input < min) {
        	    	  min = input;
        	     }else if (input > max) {
        	    	 max = input;
        	     }
        }


        // YOUR CODE ENDS HERE
        
        System.out.println( "Maximum was " + max );
        System.out.println( "Minimum was " + min );
    }

}
