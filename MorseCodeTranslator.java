/* Author: William Carmichael
 * GitHub Username: @willyyyyc
 * Last modification: 
 * Project Description: A simple commandline based translator
 * that translates user inputed text to morse code or vice-versa.
 */
import java.util.Scanner;
class MorseCodeTranslator {
    /*  */
    public static Boolean instructions(String userChoice) {
        if (userChoice.equals("t")) {
            // text instructions
            // translate object
            return true;
        } else if (userChoice.equals("m")) {
            // morse code instructions
            // translate object
            return true;
        } else if (userChoice.equals("q")) {
            return false;
        } 
        else {
            System.out.println("Invalid selection. Please try again or quit [q].");
            return true;
        }
    }

    /* Main Method: */
    public static void main (String[]args) {
        // Create scanner object to handle input
        Scanner in = new Scanner(System.in);
        
        // Series of print statements that explain program to the user
        System.out.println("");
        System.out.println("");
        System.out.println("Welcome!"); //add the morse code equivalent as well
        System.out.println("");
        System.out.println("This program will translate entered text to morse code, or entered morse code to text.");
        
        Boolean run = true;

        while (run) {
            System.out.println("Choose to enter text [t], morse code [m], or quit [q]: ");
            String userChoice = in.next();
            run = instructions(userChoice);
        }

        // Series of print statements thanking the user for using the program
        System.out.println("");
        System.out.println("");
        System.out.println("Thank you for using this program!");
        System.out.println("");
        System.out.println("Goodbye!"); // morse code equivalent. (use the translator?)

        // Close scanner object
        in.close();
    }
}