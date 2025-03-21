import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";

        do {
            System.out.print("Enter a message: ");
            input = sc.nextLine().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}