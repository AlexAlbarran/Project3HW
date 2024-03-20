package zproject3;

// Write a Java Program to print the first 10 numbers of Fibonacci series.

public class Task7 {
    public static void main(String[] args) {

        int num1 = 0;
        int Num2 = 1;

        System.out.print(num1 + " " + Num2 + " ");

        for (int i = 2; i < 10; i++) {
            int nextNum = num1 + Num2;
            System.out.print(nextNum + " ");
            num1 = Num2;
            Num2 = nextNum;
        }
    }
}
