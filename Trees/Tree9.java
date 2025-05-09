package Trees;

class BST {
    int data;
    BST left;
    BST right;

    BST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree9 {
    public static BST binarysearch(BST root, int d) {
        if (root == null) {
            return new BST(d);
        }

        if (d > root.data) {
            root.right = binarysearch(root.right, d);
        } else {
            root.left = binarysearch(root.left, d);
        }
        return root;
    }

    public static void inorder(BST root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static BST search(BST root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (root.data < key) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public static void main(String[] args) {
        BST root = null;
        root = binarysearch(root, 10);
        binarysearch(root, 12);
        binarysearch(root, 5);
        binarysearch(root, 32);
        binarysearch(root, 6);
        System.out.print("BST: ");
        inorder(root);
        System.out.println();

        int keyToFind = 5;
        BST result = search(root, keyToFind);
        if (result != null) {
            System.out.println("Element " + keyToFind + " found in the tree.");
        } else {
            System.out.println("Element " + keyToFind + " not found in the tree.");
        }
    }
}
