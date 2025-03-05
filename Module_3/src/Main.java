public class Main {
    public static void main(String[] args) {

        int intValue = 1000;

        // Implicit Tyoe Casting from int to long
        long longValue = intValue;

        // Implicit Type Casting from long to double
        double doubleValue = longValue;

        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);

        double doubleValue2 = 200.56;

        // Explicit Type Casting from double to int
        int intValue2 = (int) doubleValue2;

        // Explicit Type Casting from int to byte
        byte byteValue = (byte) intValue2;

        System.out.println(doubleValue2);
        System.out.println(intValue2);
        System.out.println(byteValue);
    }
}