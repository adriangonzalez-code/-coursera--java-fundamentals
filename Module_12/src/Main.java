public class Main {
    public static void main(String[] args) {

        // String Literal
        String str1 = "Hello ";
        System.out.println(str1);

        // Using String object
        String str2 =  new String("World");
        System.out.println(str2);

        // Concatenating String Literal and String object
        String str3 = str1 + str2;
        System.out.println(str3);

        // Length of the string str3
        System.out.println(str3.length());

        // Character at index 0 of the string str3
        System.out.println(str3.charAt(0));

        // Concatenating two strings using concat() method
        System.out.println(str1.concat(str2));

        // Substring of the string str3 from index 0 to 5 (excluding 5)
        System.out.println(str3.substring(0, 5));

        // Comparing two strings using equals() method
        System.out.println(str1.equals(str2));

        // Validate if the string str3 contains "Hello"
        System.out.println(str3.contains("Hello"));

        // Convert the string str3 to uppercase
        System.out.println(str3.toUpperCase());

        // Remove the leading and trailing spaces from the string str3
        System.out.println(str3.trim());
    }
}