package Java.DataStructures;
import java.util.*;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLL {
    private Node head;
    private Node tail;
    public CircularLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; 
        } 
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; 
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println(); 
    }

    public static void main(String[] args) {
        CircularLL circularList = new CircularLL();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements");
        int n = scanner.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            circularList.insert(element);
        }
        System.out.println("Original Circular Linked List");
        circularList.display();
        scanner.close();
    }
}
