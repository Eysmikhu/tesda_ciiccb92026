public class Tasksheet113 {

    public static void main(String[] args) {
        // Step 2: Create check_number variable initialized to 10
        int check_number = 10;

        // Step 3: Create String variable named message
        String message;

        // Step 4 & 5: Loop from 1 to check_number and evaluate odd/even
        for (int i = 1; i <= check_number; i++) {
            
            // Step 5: Assign ternary evaluation to message
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";

            // Step 6: Print the message value
            System.out.println(message);
        }
    }
}
