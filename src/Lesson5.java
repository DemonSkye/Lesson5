import java.util.Scanner;

public class Lesson5 {
    public static void main(String args[]){
        //Hard typing
        //Declare a type for our variable and that type has limitations
        //e.g. int only store integers without decimals, doesn't allow numbers.

        //Soft typing
        //When you declare a variable, you don't necessarily know what type it's going to be.
        var myVariable = 1;
        var myWords = "My words";

        //Hard typing ensures that:
        //1. You're not pushing code that you're not sure of / don't know what it does, into production
        //2. If you do know what type you need, use that type
        //3. It's a nightmare to figure out what someone planned to use that variable for when you soft type.

        // ==================================================================================================

        //How to take input from the user
        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter a number: ");
        //int a = scan.nextInt();

        //System.out.println("You entered: " + a);

        //For double use
        //double b = scan.nextDouble();

        System.out.println("Enter as many words as you want followed by the <Enter> key : ");
        String str = scan.nextLine();

        System.out.println(str);

        // ==================================================================================================
        //Suggested homework:
        //Create a program that allows a user to input some numbers, representing a bank account.
        //Once the user has entered their current balance, and their rate of interest, tell them how much money they will have in 1 year, 2 years, 5 years and 10 years.
        //Compounding interest (remeber Math.pow() that we looked at earlier.
        //or Simple interest



    }
}
