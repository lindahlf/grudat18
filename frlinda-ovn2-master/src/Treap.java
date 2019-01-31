import java.util.Random;

//Fred Lindahl, grudat18, uppg 2.5

/**
 * This class creates and maintains a randomized binary search tree, a treap.
 */
public class Treap {

    public Node root;
    private int size;
    private Random prio;

    /**
     * Objects from this class represent nodes in the treap
     */
    private class Node{

        private String key;
        private Node left;
        private Node right;
        private int nodePrio;

        /**
         * Creates a node in the tree with a string key.psm
         * Also has a priority value.
         */
        private Node(String key){
            this.key = key;
            this.right = null;
            this.left = null;
            this.nodePrio = prio.nextInt();

        }
    }

    /**
     * Create an empty treap
     */
    public Treap(){
        root = null;
        size = 0;
        prio = new Random();

    }

    /**
     * Insert a new node into the tree and return the updated tree
     * @param node
     * @param tree
     *
     * @return updated tree
     * Time complexity: f(n) = log n
     */
    public Node insert(String node, Node tree){
        Node newNode = new Node(node);
        if (tree  == null){
            size ++;
            return newNode;
        }
        if (node.compareToIgnoreCase(tree.key) < 0){  // check if inserted node is smaller than tree
            tree.left = insert(node, tree.left);
            if (tree.nodePrio > tree.left.nodePrio){
                tree = rotateRight(tree);
            }
        }
        else
            tree.right = insert(node, tree.right);
        if (tree.right != null) {
            if (tree.nodePrio > tree.right.nodePrio) {
                tree = rotateLeft(tree);
            }
        }
        return tree;
    }

    /**
     * Takes the LEFT leaf of the current tree and makes the current tree its RIGHT leaf, right rotation.
     * @param tree
     * @return new tree
     *
     * Time complexity: f(n) = log n
     */
    private Node rotateRight(Node tree){
        Node fooNode = tree.left;
        tree.left = null;
        if (fooNode.right != null){
            tree.left = fooNode.right;
            fooNode.right = null;
        }
        fooNode.right = tree;
        return fooNode;
    }

    /**
     * Takes the RIGHT leaf of current tree and makes the current tree its LEFT leaf, left rotation.
     * @param tree
     * @return new tree
     *
     * Time complexity: f(n) = log n
     */
    private Node rotateLeft(Node tree){
        Node fooNode = tree.right;
        tree.right = null;
        if (fooNode.left != null){
            tree.right = fooNode.left;
            fooNode.left = null;
        }
        fooNode.left = tree;
        return fooNode;
    }

    /**
     * Returns the number of elements in current treap.
     *
     * @return size of treap
     * Time complexity: f(n) = 1
     */
    public int getSize(){
        return size;
    }

    /**
     * Finds elements in alphabetic order and appends them to a given StringBuilder
     * @param tree
     * @param list
     * @return updated StringBuilder with treap elements in alphabetic order.
     *
     * Time complexity: f(n) = n
     */
    private StringBuilder inOrder(Node tree, StringBuilder list){
        if (tree == null){
            return list;
        }
        else {
            inOrder(tree.left, list);
            list.append(tree.key);
            list.append(" ");
            inOrder(tree.right, list);
        }
        return list;
    }

    /**
     * Returns a string representation of current treap.
     * @return string representation of current treap
     *
     * Time complexity: f(n) = 1
     */
    public String toString(){
        StringBuilder printTreap = new StringBuilder();
        if (size == 0) return null;
        printTreap = inOrder(root, printTreap);
        return printTreap.toString();
    }

    /**
     * Checks if each parent tree has a higher priority (smaller nodePrio) than its two respective leafs.
     * Ignores if one or both leafs are null
     * @param tree
     * @return
     *
     * Time complexity: f(n) = n
     */
    public boolean checkPrio(Node tree){
        if (tree == null){
            return false;
        }
        else{
            checkPrio(tree.left);
            if (tree.left != null && tree.right != null) {
                if (tree.nodePrio < tree.left.nodePrio && tree.nodePrio < tree.right.nodePrio) {
                    return true;
                }
            }
            if (tree.left != null){
                if (tree.nodePrio < tree.left.nodePrio) {
                    return true;
                }
            }
            if (tree.right != null){
                if (tree.nodePrio < tree.right.nodePrio){
                    return true;
                }
            }
            else return true;
            checkPrio(tree.right);
        }
        return false;
    }
}
