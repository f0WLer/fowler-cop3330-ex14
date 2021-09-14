import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double subtotal = Integer.parseInt(scanner.nextLine());
        System.out.print("What is the state? ");
        String state = scanner.nextLine();

        String output = "";
        double total = subtotal;
        if (state.toLowerCase(Locale.ROOT).equals("wi")) {
            double tax = subtotal * 0.055;
            total += tax;
            output += String.format("The subtotal is $%.2f.\nThe tax is $%.2f.\n",
                    subtotal, tax);
        }
        output += String.format("The total is $%.2f.", total);
        System.out.println(output);
    }
}
