public class Main {
    public static void main(String[] args) {

        // Declaring and array
        int[] marks;
        marks = new int[5];

        // OR
        int marks2[] = new int[5];

        // Initializing an array
        int[] marks3 = new int[] { 10, 20, 30, 40, 50 };

        // Declare and assign
        int[] marks4 = new int[5];
        marks4[0] = 100;
        marks4[1] = 60;
        marks4[2] = 78;
        marks4[3] = 89;
        marks4[4] = 98;

        for (int i = 0; i < marks4.length; i++) {
            System.out.println(marks4[i]);
        }

        System.out.println("********************************");

        for (int value : marks3) {
            System.out.println(value);
        }
    }
}