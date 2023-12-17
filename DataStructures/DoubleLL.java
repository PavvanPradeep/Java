package Java.DataStructures;
import java.util.*;
class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
public class DoubleLL {
    private Node head;

    public DoubleLL() {
        this.head = null;
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("inserted");
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("not found");
        } else {
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            } else {
                head = temp.next;
            }

            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }

            System.out.println("deleted");
        }
    }
    public void display() {
        Node temp = head;
        System.out.println("DLL elements:");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLL dll = new DoubleLL();

        while (true) {
            System.out.println("1 Insert");
            System.out.println("2 Delete");
            System.out.println("3 Display");
            System.out.println("4 Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert");
                    int insertData = scanner.nextInt();
                    dll.insert(insertData);
                    break;
                case 2:
                    System.out.print("Enter the data to delete");
                    int deleteData = scanner.nextInt();
                    dll.delete(deleteData);
                    break;
                case 3:
                    dll.display();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
