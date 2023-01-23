/*
5)Create a 2D array of integers. Develop a program which will calculate
 the sum of even and odd numbers for that array.
 */
public class EvenAndOddSum {
    public static void main(String[] args) {

        //creating a 2D array of odd and even numbers
        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};

        //initialising sum for even and odd numbers
        int evenSum = 0, oddSum = 0;

        //creating a nested loop that will add up all even numbers to 'evenSum'
        //and will also add up all odd numbers in 'oddSum'
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if(num[i][j] % 2 == 0){
                    evenSum += num[i][j];
                } else {
                    oddSum += num[i][j];
                }
            }
        }
        //printing the summ of odd numbers and the sum of even numbers
        System.out.println("Odd sum = " + oddSum);
        System.out.println("Even sum = " + evenSum);
    }
}
