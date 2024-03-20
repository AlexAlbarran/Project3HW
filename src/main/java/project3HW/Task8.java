package zproject3;

// Maximum and minimum number in the array?

public class Task8 {
    public static void main(String[] args) {

        int[] numbers = {4, 88, 12, 56, 5, 10};
        int max = numbers[0];
        int min = numbers[0];

        // Find maximum and minimum numbers
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}
