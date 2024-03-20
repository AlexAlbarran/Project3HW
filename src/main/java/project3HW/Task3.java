package zproject3;

// Create a 2D array or integer type where you will store odd and even numbers.
// Develop a program which will identify/print the even numbers only.

public class Task3 {
    public static void main(String[] args) {

        int[][] num = {
                {2, 5, 8, 10},
                {1, 3, 7, 4},
                {9, 6, 12, 20},
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.println(num[i][j]);
                }
            }
        }
    }
}
