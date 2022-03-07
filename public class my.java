import java.util.*;

public class my
{
static boolean isPalindrome(String str)
{
int i = 0, j = str.length() - 1;
while (i < j) {
if (str.charAt(i) != str.charAt(j))
return false;
i++;
j--;
}
return true;
}
public static void main(String[] args)
{
String str = "geek_divakar rakavid_keeg";
if (isPalindrome(str))
System.out.print("Yes");
else
System.out.print("NO")
}
}
