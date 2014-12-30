import java.util.Scanner;
public class MiddleString
{
    public static void main(String[] args)
    {
        String s1, s2, s3, first, middle, last;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("You will be asked to enter three sentences.");
        System.out.println("Please enter your first sentence.");
        s1 = keyboard.nextLine();
        
        System.out.println("Please enter your second sentence.");
        s2 = keyboard.nextLine();
        
        System.out.println("Please enter your third sentence.");
        s3 = keyboard.nextLine();
        
        first = s1;
        
        if (s2.compareTo(first) > 0)
        {
            last = s2;
        }
        else
        {
            first = s2;
            last = s1;
        }
        if (s3.compareTo(first) <= 0)
        {
            middle = first;
            first = s3;
        }
        else if (s3.compareTo(last) >= 0)
        {
            middle = last;
            last = s3;
        }
        else
        {
            middle = s3;           
        }
        System.out.println("If arranged lexicographically, the second sentence would be: ");
        System.out.println(middle);
        
    }
}