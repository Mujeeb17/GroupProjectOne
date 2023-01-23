/*
9)Maximum and minimum number in the array?
 */
public class MaxMin {
    public static void main(String[] args) {

        int[] num = {7,4,9,1,6,15,8};

        //initialising both variables to the first number in the array
        int max = num[0], min = num[0];

        //this loop will go through all values in the array and if
        //a smaller number is found, it will replace the 'min' variable
        //if a bigger number is found, it will replace the 'max' variable
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max){
                max = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
