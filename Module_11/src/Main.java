public class Main {
    public static void main(String[] args) {
        int[][] marks = {
                { 1, 2, 3, 4, 5 },
                { 4, 5, 6, 7, 8 },
                { 7, 8, 9, 10, 11 }
        };

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}