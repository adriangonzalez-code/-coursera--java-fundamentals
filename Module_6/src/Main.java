public class Main {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;
        int num3 = 7;

        System.out.println("num1 > num2: " + (num1 > num2)); // num1 greater than num2 = true
        System.out.println("num1 < num2: " + (num1 < num2)); // num1 less than num2 = false
        System.out.println("num1 >= num2: " + (num1 >= num2)); // num1 greater than or equal to num2 = true
        System.out.println("num1 <= num2: " + (num1 <= num2)); // num1 less than or equal to num2 = false
        System.out.println("num1 == num3: " + (num1 == num3)); // num1 equal to num3 = false
        System.out.println("num1 != num3: " + (num1 != num3)); // num1 not equal to num3 = true
    }
}