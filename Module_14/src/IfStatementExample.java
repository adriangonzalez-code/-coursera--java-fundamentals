public class IfStatementExample {
    public static void main(String[] args) {

        boolean isAuthenticated = false;

        if (isAuthenticated) {
            System.out.println("LoggedIn");
        }

        if (!isAuthenticated) {
            System.out.println("Not LoggedIn");
        }
    }
}