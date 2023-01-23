import java.util.Scanner;

/*
1)Using Scanner create an array of integer values. After the array is created,
calculate the sum of all stored elements in that array.
 */
public class SumOfIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //initialising an integer array of size 5 and sum variable
        int[] num = new int[5];
        int sum = 0;

        //using scanner to input the numbers that will be stored in the array
        //and calculating sum of integers
        for (int i = 0; i < num.length; i++) {
            System.out.println("Input number " + (i + 1) + ":");
            num[i] = input.nextInt();
            sum += num[i];
        }

        System.out.println("The sum of integers is = " + sum);
    }
}