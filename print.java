/*print thr following  pattren

        * * * *
        * * * *
        * * * *
        * * * * 

 */

import java.util.*;

public class print{
    public static void main (String args[]){
        int n = 5;
        int m = 4;
        
        //outer loop
        for(int i = 1; i <= n ; i++ ){
            //inner loop
            for (int j = 1; j <= m ; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}