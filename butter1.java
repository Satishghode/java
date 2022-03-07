/* 
        ##print the pattren


        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *
*/


import java.util.*;
 
public class butter1 {
   public static void main(String args[]) {
       int n = 19;
 
       //upper part ->ouuter loop 
       //this for condition usr for print row
       for(int i=1; i<=n; i++) {
           //this for loop usr for print the star
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           //this condition use for printing a space
 
           int s = 2 * (n-i);
           for(int k=1; k<=s; k++) {
               System.out.print(" ");
           }
           //inner to inner conditiion print to star
 
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           //then print the upper part then next line
           System.out.println();
       }
       //lower part ->  
       //row conditions
       for(int i=n; i>=1; i--) {
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        //print the lower part -> star

        int s = 2 * (n-i);
        for(int j=1; j<=s; j++) {
            System.out.print(" ");
        }
        // print the lower right star

        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        // new line star 
        System.out.println();
    }
 
    }
}

