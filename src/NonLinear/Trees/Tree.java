package NonLinear.Trees;

public class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data=data;
        this.left=this.right=null;
    }
    public static void preOrder(Tree root){//DLR
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }

    }
    public static void inOrder(Tree root) {//LDR
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

        }
    }
    public static void postOrder(Tree root) {//LRD
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        // the tree is formed/built top to bottom and left  to right (level by Level)
        //level 0
        Tree root =new Tree(1);
        //level 1
        root.left=new Tree(2);
        root.right=new Tree(3);
        //level 2
        root.left.left=new Tree(4);
        root.left.right=new Tree(5);
        root.right.left=new Tree(6);
        root.right.right=new Tree(7);
        //level 3
        root.left.right.left=new Tree(9);
        root.right.right.left=new Tree(15);
            System.out.print("preorder: ");
            preOrder(root);
            System.out.println();
            System.out.print("inorder: ");
            inOrder(root);
            System.out.println();
            System.out.print("postorder: ");
            postOrder(root);
            System.out.println();


    }
}
