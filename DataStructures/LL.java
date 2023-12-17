package Java.DataStructures;
import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        int choice, x, index;
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("1 Add node");
            System.out.println("2 Remove node with index");
            System.out.println("3 Check if value is in list");
            System.out.println("4 Remove node with value");
            System.out.println("5 print");
            System.out.println("6 Exit");
            System.out.print("Enter your choice: ");
            choice = reader.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.print("Enter number of nodes for ll");
                    int n = reader.nextInt();  
                    for(int i =0;i<=n;i++){
                        System.out.print("Enter the value of node");
                        x = reader.nextInt();
                        ll = add(ll, x);
                    }
                    break;
                case 2:
                    System.out.print("Enter the index of node to remove: ");
                    index = reader.nextInt();
                    ll = removeAt(ll, index);
                    break;
                case 3:
                    System.out.print("Enter a value to check if it's in the list: ");
                    x = reader.nextInt();
                    System.out.println(contains(ll, x) ? "Value is in the list" : "Value is not in the list");
                    break;
                case 4:
                    System.out.print("Enter the value of node to be removed");
                    int rem=reader.nextInt();
                    for (int i = 0; i < ll.size(); i++) {
                        if(ll.get(i)==rem);
                        ll.remove(i);
                    }
                    break;
                case 5:
                    System.out.println(ll);
                    break;
                case 6:
                    System.out.println("Enter the value");
                    x=reader.nextInt();
                    System.out.println("Enter the index");  
                    index=reader.nextInt();
                    ll=update(ll, index, x);
                case 7:
                    reader.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static LinkedList<Integer> add(LinkedList<Integer>ll, int x){
        ll.add(x);
        return new LinkedList<Integer>(ll);
    }

    public static LinkedList<Integer> removeAt(LinkedList<Integer> ll, int index){
        if(index >= 0 && index < ll.size()){
            ll.remove(index);
        }
        return new LinkedList<Integer>(ll);
    }
    
    public static boolean contains(LinkedList<Integer> ll, int x){
        return ll.contains(x);
    }
    
    public static LinkedList<Integer> update(LinkedList<Integer> ll, int index, int value){
        if(index >= 0 && index < ll.size()){
            ll.set(index, value);
        }
        return new LinkedList<Integer>(ll);
    }
}
