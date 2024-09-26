/* * Name: bhavin
 * Program Name: COSC1200
 * Description: this program shows a quote, my student info, and a random number
 */
import java.util.Scanner;
public class ICE1assignment {
    public static void main(String[] args) {
        System.out.println("HELLO, My name is bhavin shuseevan, and my student ID is 100964616.");
        //intro info about me
        System.out.println("My favorite quote is: \"Everyone’s a wh**e, Grace. We just sell different parts of ourselves.\" - Thomas Shelby, Peaky Blinders.");
        // the quote
        Scanner input = new Scanner(System.in);
        //for the users input
        System.out.print("Please enter a number: ");
        //where u input
        int usrinpt = input.nextInt();
        //if (usrinpt != int)
        System.out.println("Your number is: " + usrinpt);
        //confirms the number
        int randomnum = (int) (Math.random() * (usrinpt + 1));
        //picks a random num using "math.random" from the inputed num + 1
        System.out.println("The number between 1 and "+ usrinpt+ " is:" + randomnum);
        //displays the picked number
        input.close();
    }
}
