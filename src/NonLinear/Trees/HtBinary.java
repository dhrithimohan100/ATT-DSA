package NonLinear.Trees;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }


    public class HtBinary {
        static int findHeight(Node root) {
            //base case:if the root is null,tree is empty ht is 0
            if (root == null) {
                return 0;
            }
            int leftHeight = findHeight(root.left);
            int rightHeight = findHeight(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }


        public static void main(String[] args) {
            Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            System.out.println("ht of tree: "+findHeight(root));
        }
    }
}
