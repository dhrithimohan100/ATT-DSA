package NonLinear.Interview;

class tree {
    int data;
    tree left;
    tree right;

    tree(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
public class MirrorTree {

        private static void inorder(tree root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data+ " ");
                inorder(root.right);
            }
        }

        private static tree mirrorTree(tree root) {
            if (root == null) {
                return root;
            }
            tree temp = root.left;
            root.left = root.right;
            root.right = temp;
            if (root.left != null) {
                mirrorTree(root.left);
            }
            if (root.right != null) {
                mirrorTree(root.right);

            }
                return root;
            }


            public static void main (String[]args){
                tree root = new tree(1);
                root.left = new tree(2);
                root.right = new tree(3);
                root.left.left = new tree(4);
                root.right.left = new tree(5);
                root.right.right = new tree(6);
                System.out.println("Inorder of og tree:");
                inorder(root);
                root = mirrorTree(root);
                System.out.println("inorder of mirror tree");
                inorder(root);

            }

        }


