/*This program will calcuate the sum of two numbers,
* calculate the product of two numbers and
* print the sum and product on the same line*/
import java.util.Scanner;
public class Calculations {
    public static void main(String args []){
        Scanner keyboard = new Scanner(System.in);
        //adding and product two numbers
        System.out.println("Enter a number : ");
        int firstsum = keyboard.nextInt();
        System.out.println("Enter another number : ");
        int secondsum = keyboard.nextInt();

        System.out.println("\n\nSum: "+ (firstsum + secondsum));
        System.out.println("Product : " + (firstsum*secondsum));


       //find the square of a number
        System.out.print("Input ");
        int number = keyboard.nextInt();
        System.out.println("output " + (number*number));

        //displays two inputs in one line
        System.out.println("Input ");
        String str = keyboard.next();
        System.out.println("Input ");
        String str2 = keyboard.next();
        System.out.print("output " + str+str2);



    }
}
