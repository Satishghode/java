import java.util.*;

/*sum of  number
 */
public class demo2
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int sum = 0;
        while (n > 0)
        {
            int temp = n % 10;
            sum = sum + temp;
            n=n/10;
        }
        System.out.println(sum);

    }
} 
