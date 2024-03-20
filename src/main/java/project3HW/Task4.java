package zproject3;

// Create a 2D array of integers.
// Develop a program which will calculate the sum of  even and odd numbers for that array.

public class Task4 {
    public static void main(String[] args) {

        int[][] num = {
                {2, 5, 8, 10},
                {1, 3, 7, 4},
                {9, 6, 12, 20},
        };
        int sumEven = 0;
        int sumOdd = 0;


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++)
                if (num[i][j] % 2 == 0) {
                    sumEven += num[i][j];
                } else {
                    sumOdd += num[i][j];
                }
        }
        System.out.println("Sum of even numbers "+sumEven);
        System.out.println("Sum of odd numbers "+sumOdd);

    }
}
