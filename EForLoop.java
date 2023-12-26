package Java;
import java.util.Scanner;

public class EForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        java.util.List<String> names = new java.util.ArrayList<>();

        System.out.println("\nEnter the number of names in the collection:");
        int numNames = scanner.nextInt();

        System.out.println("Enter " + numNames + " names for the collection:");
        for (int i = 0; i < numNames; i++) {
            names.add(scanner.next());
        }
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
