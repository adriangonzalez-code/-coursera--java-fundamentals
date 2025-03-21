public class ForEachLoop {

    public static void main(String[] args) {

        String names[] = { "King", "Kochhar", "Sarah", "Blowing" };

        // Using traditional for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Using for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}