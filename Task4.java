import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Reverse the string 
        StringBuilder sb = new StringBuilder(text);
        String reverse = sb.reverse().toString();

        // Compare
        if (text.equals(reverse)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        input.close();
    }
}
