import java.util.Arrays;

/*
10)Write a java program to find the second-largest number in the array?
 */
public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] num = {7, 4, 9, 1, 6, 15, 8};

        //this will sort all numbers in the array from smallest to largest
        Arrays.sort(num);

        //this will print the second-largest number in the newly sorted array
        System.out.println(num[num.length-2]);
    }
}
