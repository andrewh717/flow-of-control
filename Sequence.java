import java.util.Scanner;
public class Sequence
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter three nonnegative integers separated by spaces.");
        int num1, num2, num3, newNum1, newNum2, newNum3;
        
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();
        
        newNum1 = 0;
        newNum2 = 0;
        newNum3 = 0;
        
        if ((num1 > 0) && (num2 > 0) && (num3 > 0))
        {               
            if ((num1 < num2) && (num2 < num3))
            {
                newNum1 = num1;
                newNum2 = num2;
                newNum3 = num3;                
            }
            else if ((num1 < num3) && (num3 < num2))
            {
                newNum1 = num1;
                newNum2 = num3;
                newNum3 = num2;
            }
            else if ((num1 > num2) && (num1 < num3))
            {
                newNum1 = num2;
                newNum2 = num1;
                newNum3 = num3;
            }
            else if ((num2 < num3) && (num3 < num1))
            {
                newNum1 = num2;
                newNum2 = num3;
                newNum3 = num1;
            }
            else if ((num3 < num1) && (num1 < num2))
            {
                newNum1 = num3;
                newNum2 = num1;
                newNum3 = num2;
            }
            else if ((num3 < num2) && (num2 < num1))
            {
                newNum1 = num3;
                newNum2 = num2;
                newNum3 = num1;
            }
            
            System.out.println("These are the integers you entered in increasing order: ");
            System.out.println(newNum1 + " " + newNum2 + " " + newNum3);
        }
        else
        {
            System.out.println("Error. Please enter only positive integers.");
        }
        
    }
}