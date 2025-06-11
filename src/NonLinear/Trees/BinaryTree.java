package NonLinear.Trees;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    Tree left;
    Tree right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinaryTree {
    public static void levelOrderTraversal(Tree root){
        if(root==null){
            return;
        }
        Queue<Tree>queue=new LinkedList<Tree>();
        queue.add(root);
        while(!queue.isEmpty()){
            Tree temp=queue.poll();//Removes and stores the front element
            System.out.println(temp.data +" ");
            //Left subtree
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Tree root=new Tree(1);
        root.left=new Tree(2);
        root.right=new Tree(3);
        root.left.left=new Tree(4);
        root.right.right=new Tree(5);
        System.out.println("BFS traversal");
        levelOrderTraversal(root);

    }
}

