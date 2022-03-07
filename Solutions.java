import java.util.*;
 
public class Solutions {
   public static void main(String args[]) {
       int n = 4;
 
       //upper part
       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
 
           int s = 2 * (n-i);
           for(int j=1; j<=s; j++) {
               System.out.print(" ");
           }
 
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
