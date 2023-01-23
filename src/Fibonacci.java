/*
8)Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
public class Fibonacci {
    public static void main(String[] args) {

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        //declaring an array and initialising the first two numbers
        //of the fibonacci series
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;

        //printing first 2 numbers
        System.out.print("0 1 ");

        //This loop will calculate and print the following numbers in the series
        //as long as it's within the size of the 'fib' array
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.print(fib[i] + " ");
        }
    }
}
