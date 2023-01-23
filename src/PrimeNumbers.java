/*
7)Write a java program to check whether a given number is prime or not?
 */
public class PrimeNumbers {
    public static void main(String[] args) {

        //creating a number variable
        double num = 90;

        //creating a boolean variable that will determine the output of program
        boolean prime = true;

        //whenever the loop finds a number that 'num' is divisible by, except
        //for the numbers 1 and itself, it will change the value of 'prime' to false
        for (int i = 2; i <= (num / 2); i++) {
            if(num % i == 0){
                prime = false;
                break;
            }
        }

        if(prime){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
