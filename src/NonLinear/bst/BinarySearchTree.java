package NonLinear.bst;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int value){
        data=value;
        left=right=null;
    }
}

public class BinarySearchTree {
    //Left<Node<Right
    //the ht is not balanced->disadvanatge iof bst
    //time complexity O(N)
    static void inOrderTraversal(TreeNode root) {
        if (root != null) {//LDR
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    //extraaaaaaaa
    static void preorder(TreeNode root){
        if(root!=null){//DLR
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
    }

    static TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);//create a new node and return that
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    static TreeNode search(TreeNode root, int key) {
        //1 Empty
        //2 what if the data is at root only
        if (root == null || root.data == key) {
            return root;
        }
        if (root.data < key) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    static TreeNode findMin(TreeNode root) {
        TreeNode current = root;
        while (current != null && current.left != null) {//left ge hogta iradu  because namge successor beku anta
            current = current.left;
        }
        return current;
    }

    static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {// key chikadu idre go to left side
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            //only one child
            if (root.left == null) {
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            if (root.right == null) {
                TreeNode temp = root.right;
                root = null;
                return temp;
            }
            //Node with 2 children
            // find the inorder successor and replace the root node with that value
            //find the min @ right side subtree
            TreeNode temp = findMin(root.right);
            //Replace the root node with that value
            root.data = temp.data;
            //from the right side,call delete again to delete the duplicate data
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 40);
        insert(root, 20);
        insert(root, 10);
        insert(root, 70);
        insert(root, 80);
        System.out.println("InOrder traversal");
        inOrderTraversal(root);
        System.out.println("pre order traversal");
        preorder(root);
        System.out.println("\ndelete 50");
        root = deleteNode(root, 50);
        inOrderTraversal(root);
        System.out.println("\ndelete 90");
        root = deleteNode(root, 90);
        inOrderTraversal(root);
        System.out.println();
        TreeNode result = search(root, 400);
        if (result == null) {
            System.out.println("key not found");
        } else {
            System.out.println("key found");
        }
    }
}

