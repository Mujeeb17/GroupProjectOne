import java.util.Scanner;

/*
2)Using Scanner create an array of countries. When an array is created,
retrieve all values from it and while retrieving those values print capital
for each country. (use 2 different loops).
 */
public class Countries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //initialising an array for countries of size 5
        String[] country = new String[5];

        //1st loop: using scanner to input the countries in the array
        for (int i = 0; i < country.length; i++) {
            System.out.println("Please input country " + (i + 1) + ":");
            country[i] = input.nextLine();
        }

        //2nd loop: using data from array to print possible capitals of each country
        for (int i = 0; i < country.length; i++) {
            switch (country[i].toLowerCase()) {
                case "italy":
                    System.out.println("Capital of Italy is Rome");
                    break;
                case "germany":
                    System.out.println("Capital of Germany is Berlin");
                    break;
                case "canada":
                    System.out.println("Capital of Canada is Ottawa");
                    break;
                case "canberra":
                    System.out.println("Capital of Australia is Canberra");
                    break;
                case "norway":
                    System.out.println("Capital of Norway is Oslo");
                    break;
                case "morocco":
                    System.out.println("Capital of Morocco is Rabat");
                    break;
                case "turkey":
                    System.out.println("Capital of Turkey is Ankara");
                    break;
            }
        }
    }
}
