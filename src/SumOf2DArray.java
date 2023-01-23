/*
3) Create a 2D array of integer values. Print the sum of all numbers.
 */
public class SumOf2DArray {
    public static void main(String[] args) {

        //creating 2D array of integers
        int[][] num = {{4, 7, 9}, {9, 22, 5}, {12, 17, 18}};

        //initialising sum variable
        int sum = 0;

        //using nested loop to add all numbers from every individual array inside 'num'
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum += num[i][j];
            }
        }
        //printing sum of all numbers
        System.out.println("Sum of all numbers = " + sum);

    }
}
