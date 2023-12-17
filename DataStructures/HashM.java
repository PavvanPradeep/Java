package Java.DataStructures;
import java.util.*;

public class HashM {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        int choice, x, index;
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add node");
            System.out.println("2. Remove node with index");
            System.out.println("3. Check if value is in list");
            System.out.println("4. Remove node with value");
            System.out.println("5. Print");
            System.out.println("6. Update node");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = reader.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of nodes for map");
                    int n = reader.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter the key");
                        int key = reader.nextInt();
                        System.out.print("Enter the value");
                        String value = reader.next();
                        hm.put(key, value);
                    }
                    break;
                case 2:
                    System.out.print("Enter the key of node to remove");
                    index = reader.nextInt();
                    hm = removeAt(hm, index);
                    break;
                case 3:
                    System.out.print("Enter a key to check if it's in the map");
                    x = reader.nextInt();
                    System.out.println(hm.containsKey(x) ? "Key is in the map" : "Key is not in the map");
                    break;
                case 4:
                    System.out.print("Enter the key of node to be removed");
                    int rem = reader.nextInt();
                    hm.remove(rem);
                    break;
                case 5:
                    System.out.println(hm);
                    break;
                case 6:
                    System.out.print("Enter the key of node to update");
                    x = reader.nextInt();
                    System.out.print("Enter the new value");
                    String newValue = reader.next();
                    hm.put(x, newValue);
                    break;
                case 7:
                    reader.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static HashMap<Integer, String> removeAt(HashMap<Integer, String> hm, int key) {
        if (hm.containsKey(key)) {
            hm.remove(key);
        } 
        else {
            System.out.println("Key not found");
        }
        return hm;
    }
}
