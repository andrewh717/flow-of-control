import java.util.Scanner;
public class TempConversion
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double temp, newTemp;
                        
        System.out.println("Please enter a temperature. Don't worry about degrees just yet.");
        temp = keyboard.nextDouble();
        System.out.println("Is that in degrees Celsius or Fahrenheit? Please use either C or c for Celsius or F or f for Fahrenheit.");
        char deg = keyboard.next().charAt(0);
        
        if (deg == 'C' || deg == 'c')
        {
            newTemp = 9 * temp / 5 + 32;
            System.out.println("When converted to Fahrenheit, the temperature you entered is " + newTemp + "F");
        }
        else if (deg == 'F' || deg == 'f')
        {
            newTemp = 5 * (temp - 32) / 9;
            System.out.println("When converted to Celsius, the temperature you entered is " + newTemp + "C");
        }
        else
        {
            System.out.println("Error. Please use either C or c for Celsius or F or f for Fahrenheit.");
        }
      
        
    }
}