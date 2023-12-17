package Java.DataStructures;
import java.util.*;

public class hashset{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        while (true) {
            System.out.println("1 Insert element");
            System.out.println("2 Delete element");
            System.out.println("3 Check if element is present");
            System.out.println("4 Search element");
            System.out.println("5 Display HashSet");
            System.out.println("6 Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert");
                    String insertElement = scanner.nextLine();
                    hashSet.add(insertElement);
                    break;
                case 2:
                    System.out.print("Enter element to delete: ");
                    String deleteElement = scanner.nextLine();
                    if (hashSet.remove(deleteElement)) {
                        System.out.println("removed");
                    } else {
                        System.out.println("not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter element to check");
                    String checkElement = scanner.nextLine();
                    if (hashSet.contains(checkElement)) {
                        System.out.println("present ");
                    } else {
                        System.out.println("not present");
                    }
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    String searchElement = scanner.nextLine();
                    boolean found = false;
                    for (String element : hashSet) {
                        if (element.equals(searchElement)) {
                            found = true;
                            break;
                        }
                    }
                    System.out.println(found ? searchElement + " found in the HashSet." : searchElement + " not found in the HashSet.");
                    break;
                case 5:
                    System.out.println("HashSet" + hashSet);
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
