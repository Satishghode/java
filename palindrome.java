/*
        print the palindrom number pattren.
        
        
            1
           212
          32123
         4321234
        543212345

*/






public class palindrom{
    public static void main(String args[]){
        int n = 5 ;
            //this for loop is print the row 
        for (int i = 1; i<=n ; i++){
                //space
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
                //print 1 St haf palindrom
            for(int j=i ;j>=1; j--){
                System.out.print(j);
            }
                //print 2 nd haf palindrom
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}









