package zproject3;

// Write a program to swap 2 numbers without a temporary variable?

public class Task5 {
    public static void main(String[] args) {

        int i = 1;
        int j = 2;

        i = i+j; // 1 + 2 = 3
        j = i-j; // 3 - 2 = 1
        i = i-j; // 3 - 1 = 2

        System.out.println(j);
        System.out.println(i);
    }
}
