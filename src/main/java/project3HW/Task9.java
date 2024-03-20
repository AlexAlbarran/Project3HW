package zproject3;

// Write a java program to find the second largest number in the array?

public class Task9 {
    public static void main(String[] args) {

        int[] numbers = {4, 88, 12, 56, 5, 10};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }
        System.out.println("Second largest number in the array: " + secondMax);
    }
}
