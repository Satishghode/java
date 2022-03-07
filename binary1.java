/*

        print the following pattren using binary
        
            1 
            0 1 
            1 0 1 
            0 1 0 1 
            1 0 1 0 1

*/

public class binary1 {
    public static void main(String agrs[]){
        int n = 50 ;
        for (int i = 1; i<=n ; i++){
            for (int j=1 ;j<=i ;j++){
                int sum;
                sum = i + j ;
                if (sum % 2 == 0) {
                    System.out.print("1 ");                    
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}
