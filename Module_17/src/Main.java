import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")) {
            System.out.print("Enter a message: ");
            input = sc.nextLine().toLowerCase();

            if (input.equals("quit")) {
                break;
            }

            if (input.equals("pass")) {
                continue;
            }

            System.out.println("Message: " + input);
        }
    }
}