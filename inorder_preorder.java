class Node {
    public int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    public Node root = null;

    void insert(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            Node temp = root;
            while (true) {
                if (data < temp.data) { 
                    if (temp.left == null) {
                        temp.left = n;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else { 
                    if (temp.right == null) {
                        temp.right = n;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(100);
        t.insert(90);
        t.insert(70);
        t.insert(30);
        t.insert(35);
        t.insert(77);
        t.insert(99);
        t.insert(120);
        t.insert(22);
        t.insert(113);

        System.out.print("Inorder: ");
        t.inorder(t.root);
        System.out.println();
        
        System.out.print("Preorder: ");
        t.preorder(t.root);
        System.out.println();

    }
}
