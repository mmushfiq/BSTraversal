
package az.mm.bst.traversal;

/**
 *
 * @author MM <mushfiqazeri@gmail.com>
 */
public class BSTraversalExplain {

    private static final int[] BST = {0, 25, 15, 50, 10, 22, 35, 70};

    public static void main(String[] args) {
        BSTraversalExplain bst = new BSTraversalExplain();
        int root = 1;
        bst.inOrderWalk(root);
    }

    public void inOrderWalk(int i) {
        if (i >= BST.length) return;
        inOrderWalk(left(i));
        print(i);
        inOrderWalk(right(i));
    }

    private void print(int i) {
        System.out.printf("%d is popped from stack and print \n", BST[i]);
    }

    private int left(int i) {
        if (2*i < BST.length) 
            System.out.printf("left-child(%d) is pushed to stack \n", BST[2*i]);
        else 
            System.out.printf("left-child of '%d' not exists! \n", BST[i]);

        return 2*i;
    }

    private int right(int i) {
        if (2*i+1 < BST.length) 
            System.out.printf("right-child(%d) is pushed to stack \n", BST[2*i+1]);
        else 
            System.out.printf("right-child of '%d' not exists! \n", BST[i]);

        return 2*i+1;
    }
}
