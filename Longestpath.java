package Java;

import java.util.Scanner;
import java.util.Stack;

public class Longestpath {

    public class BinaryTree {

        private class Node {
            int data;
            Node left;
            Node right;

            Node(int data, Node left, Node right) {
                this.data = data;
                this.left = left;
                this.right = right;
            }
        }

        private Node root = null;
        BinaryTree(String s) {
            this.root = buildTreeFromString(s, null);
        }

        private Node buildTreeFromString(String s, Node parent) {
            if (s.length() == 0) {
                return null;
            }
            Node node = new Node(0, null, null);
            node.data = Integer.parseInt(String.valueOf(s.charAt(0)));

            if (s.length() > 1) {
                Stack<Character> stack = new Stack<>();
                stack.push(s.charAt(1));
                int i = 2;
                while (!stack.isEmpty() && i < s.length()) {
                    if (s.charAt(i) == '(') {
                        stack.push(s.charAt(i));
                    } else if (s.charAt(i) == ')') {
                        stack.pop();
                    }
                    i++;
                }
                int end = i;
                String leftSubtree = s.substring(2, end - 1);
                node.left = buildTreeFromString(leftSubtree, node);

                if (end + 1 < s.length() - 1) {
                    String rightSubtree = s.substring(end + 1, s.length() - 1);
                    node.right = buildTreeFromString(rightSubtree, node);
                }
            }
            return node;
        }

        public void display() {
            display(this.root);
        }

        private void display(Node parent) {
            String str = "";
            if (parent.left != null) {
                str += parent.left.data + " => ";
            } else {
                str += "End => ";
            }
            str += parent.data;
            if (parent.right != null) {
                str += " <= " + parent.right.data;
            } else {
                str += " <= End";
            }
            System.out.println(str);

            if (parent.left != null) {
                display(parent.left);
            }
            if (parent.right != null) {
                display(parent.right);
            }
        }

        public int calculatelps() {
            return calculatelps(this.root, 0).sum;
        }

        public class Pair {
            int maxDepth;
            int sum;
        }

        private Pair calculatelps(Node parent, int depth) {
            if (parent == null) {
                Pair result = new Pair();
                result.maxDepth = -1;
                result.sum = 0;
                return result;
            }

            if (parent.left == null && parent.right == null) {
                Pair result = new Pair();
                result.maxDepth = depth;
                result.sum = parent.data;
                return result;
            }

            Pair leftResult = calculatelps(parent.left, depth + 1);
            Pair rightResult = calculatelps(parent.right, depth + 1);

            Pair currentResult = new Pair();
            currentResult.maxDepth = Math.max(leftResult.maxDepth, rightResult.maxDepth);

            if (leftResult.maxDepth > rightResult.maxDepth) {
                currentResult.sum = leftResult.sum + parent.data;
            } else if (leftResult.maxDepth < rightResult.maxDepth) {
                currentResult.sum = rightResult.sum + parent.data;
            } else {
                currentResult.sum = Math.max(leftResult.sum, rightResult.sum) + parent.data;
            }

            return currentResult;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary tree string: ");
        String treeString = scanner.nextLine();
        Longestpath lps = new Longestpath();
        BinaryTree tree = lps.new BinaryTree(treeString);
        System.out.println("\nBinary Tree:");
        tree.display();
        System.out.println("\nLongest Path Sum: " + tree.calculatelps());
        scanner.close();
    }
}
