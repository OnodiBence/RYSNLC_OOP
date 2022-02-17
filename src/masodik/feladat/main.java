package masodik.feladat;
import java.util.Scanner;

public class main {
	
	static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int arrSize = read(1, 10);
        String[] names = new String[arrSize];
        readNames(names);
        printNames(names);
        System.out.println("\"Bence\" in names: " + hasName(names, "Levente"));
    }

    public static int read(int min, int max) {
        int number = 0;
        do {
            System.out.println("Give me a number between " + min + " and " + max + "!");
            while (!input.hasNextInt()) {
                System.out.println("Bad input format!");
                input.next();
            }
            number = input.nextInt();
            input.nextLine();
        } while (number < min || number > max);
        return number;
    }

    public static void readNames(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            arr[i] = input.nextLine();
        }
    }

    public static void printNames(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ") " + arr[i]);
        }
    }

    public static boolean hasName(String[] arr, String name) {
        for (String n : arr) {
            if (n.equals(name))
                return true;
        }
        return false;
    }

}