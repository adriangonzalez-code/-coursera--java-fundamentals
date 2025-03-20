public class IfElseIfElseStatementExample {
    public static void main(String[] args) {

        float sellingPrice = 1000.0f, costPrice = 1000.0f;

        if (sellingPrice > costPrice) {
            System.out.println("Profit");
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss");
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}