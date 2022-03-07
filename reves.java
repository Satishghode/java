/*print the following pattern using for loop

        * * * *
        * * *
        * *
        *
*/

import java.util.*;


public class reves{
    public static void main(String[] args) {
        int n = 4;
        for(int i=n; i>=1 ; i--){
            //inner for loop
            for(int j=1 ;j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println( );
        }
    }
}

