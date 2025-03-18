public class Main {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Hello ");
        long startTime = System.currentTimeMillis();

        // Default capacity is 16
        System.out.println(buffer.capacity());

        for (int i = 0; i < 100000; i++) {
            buffer.append("World!");
        }

        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime));

        /*buffer.append("World!");
        System.out.println(buffer);*/

        StringBuilder builder = new StringBuilder("Hello ");
        startTime = System.currentTimeMillis();

        // Default capacity is 16
        System.out.println(builder.capacity());

        for (int i = 0; i < 100000; i++) {
            builder.append("World!");
        }

        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime));

        /*builder.append("World!");
        System.out.println(builder);*/
    }
}