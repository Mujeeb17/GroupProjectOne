/*
11)Write a program to print out duplicate
elements from an Array of Strings?
 */
public class Duplicate {
    public static void main(String[] args) {

        String[] arr = {"eggs", "tomatoes", "water", "eggs", "lettuce", "water"};

        //this nested loop will compare each element to find duplicates
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                //the outer loop starts with the first index in the array
                // the inner loop will start at the index that is one after arr[i]
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }
}
