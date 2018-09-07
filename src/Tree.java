import java.util.Scanner;

public class Tree {

    public static void main(String[] args)
    {
        new Tree().run();
    }

    static class Node {
        Node left;
        Node right;
        int value;

        public Node(int value)
        {
            this.value = value;
        }
    }

    public void run() {
        Scanner n = new Scanner(System.in);
        Node root = new Node(n.nextInt());
        System.out.println("Building tree with root value " + root.value);
        Scanner key = new Scanner(System.in);
        insert(root, key.nextInt());
        insert(root, key.nextInt());
        insert(root, key.nextInt());
        System.out.println(root);
    }

    private void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("  Inserted " + value + " to left of "
                        + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.value);
                node.right = new Node(value);
            }
        }
    }
}