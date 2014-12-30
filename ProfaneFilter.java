import java.util.Scanner;
public class ProfaneFilter
{
   public static void main(String[] args)
   {
       Scanner keyboard = new Scanner(System.in);
       String cat = " cat ";
       String dog = " dog ";
       String llama = " llama ";
       
       System.out.println("Please enter a sentence. It shall be tested for profanity.");
       String s1 = keyboard.nextLine();
       
       if (((s1.charAt(0) == 'C') && (s1.charAt(1) == 'a') && (s1.charAt(2) == 't') && (s1.charAt(3) == ' ' )) || (s1.contains(cat)) || ((s1.charAt(0) == 'D') && (s1.charAt(1) == 'o') && (s1.charAt(2) == 'g') && (s1.charAt(3) == ' ' )) || (s1.contains(dog)) || ((s1.charAt(0) == 'L') && (s1.charAt(1) == 'l') && (s1.charAt(2) == 'a') && (s1.charAt(3) == 'm' ) && (s1.charAt(4) == 'a' ) && (s1.charAt(5) == ' ' )) || (s1.contains(llama))) 
       {
           System.out.println("Your sentence contains profanity.");           
       }
       else
       {
           System.out.println("Your sentence contains no profane words.");
       }
      
   }
}
