package Java.DataStructures;
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int choice, x;
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Search");
            System.out.println("5. Print");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = reader.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of nodes for stack: ");
                    int n = reader.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter the value of node: ");
                        x = reader.nextInt();
                        stack.push(x);
                    }
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped element: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Peeked element: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.print("Enter a value to check if it's in the list: ");
                    x = reader.nextInt();
                    System.out.println(stack.search(x) != -1 ? "Value is in the list" : "Value is not in the list");
                    break;
                case 5:
                    System.out.println("Stack: " + stack);
                    break;
                case 6:
                    reader.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
