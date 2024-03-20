package zproject3;

// Write a java program to check whether a given number is prime or not?

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number");
        int num = scanner.nextInt();
        int i = num%2;
        int j = num%3;


        if(i==0 || j==0) {
            System.out.println("Not a prime number");
        }else{
            System.out.println("Prime number");
        }

    }
}
