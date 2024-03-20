package zproject3;

// Create a program that uses an array to store a list of temperatures for a week,
// and then uses a loop to find the highest and lowest temperature for the week.

public class Task1 {
    public static void main(String[] args) {

        int[] temps = new int[7];
        temps[0] = 23;
        temps[1] = 42;
        temps[2] = 70;
        temps[3] = 75;
        temps[4] = 80;
        temps[5] = 35;
        temps[6] = 10;

        int max=temps[0];
        int low=temps[0];
        for (int num:temps) {
            if(max<num){
                max=num;
            }if(low>num)
                low=num;
        }
        System.out.println(max);
        System.out.println(low);
    }
}
