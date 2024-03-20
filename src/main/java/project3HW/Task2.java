package zproject3;

// Create an array of integer values.
// After the array is created, calculate the sum of all stored elements in that array.

public class Task2 {
    public static void main(String[] args) {

        int [] numbers = {5,10,15,120,25,30,35,1000};
        int sum = 0;


        for(int n:numbers) {
            sum=sum+n;
        }
        System.out.println(sum);

    }
}
